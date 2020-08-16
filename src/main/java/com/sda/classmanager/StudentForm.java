/*
 * Created by JFormDesigner on Sun Aug 16 14:08:18 CEST 2020
 */

package com.sda.classmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.*;

/**
 * @author Pawel
 */
public class StudentForm extends JPanel {
    private INewStudentFromSubmittedListener newStudentListener;

    public StudentForm(INewStudentFromSubmittedListener listener) {
        this.newStudentListener = listener;
        initComponents();

        Gender[] genders = Gender.values();
        for (Gender gender : genders) {
            comboGender.addItem(gender);
        }
        // Prepare spinner Year Born                        .. Wartość początkowa    minimum             maksimum               skok
        spinnerYearBorn.setModel(new SpinnerNumberModel(LocalDate.now().getYear(), 1920, LocalDate.now().getYear(), 1));

        buttonSubmit.addActionListener(actionEvent -> {
            Student student = new Student();
            student.setName(textFieldName.getText());
            student.setLastName(textFieldLastName.getText());
            student.setQuarantined(checkQuarantined.isSelected());
            student.setYearBorn((Integer) spinnerYearBorn.getValue());
            student.setGender((Gender) comboGender.getSelectedItem());

            if (newStudentListener != null) {
                newStudentListener.studentCreated(student);
            }
        });
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        labelHeadlineForm = new JLabel();
        hSpacer1 = new JPanel(null);
        labelName = new JLabel();
        textFieldName = new JTextField();
        labelLastName = new JLabel();
        textFieldLastName = new JTextField();
        labelGender = new JLabel();
        comboGender = new JComboBox();
        labelQuarantined = new JLabel();
        checkQuarantined = new JCheckBox();
        labelYearBorn = new JLabel();
        spinnerYearBorn = new JSpinner();
        vSpacer5 = new JPanel(null);
        buttonSubmit = new JButton();

        //======== this ========
        setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
                0, 0, 0, 0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder
                .BOTTOM, new java.awt.Font("D\u0069al\u006fg", java.awt.Font.BOLD, 12), java.awt.Color.
                red), getBorder()));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.
                                               beans.PropertyChangeEvent e) {
                if ("\u0062or\u0064er".equals(e.getPropertyName())) throw new RuntimeException();
            }
        });
        setLayout(new GridLayout(12, 2));

        //---- labelHeadlineForm ----
        labelHeadlineForm.setText("Student Form:");
        labelHeadlineForm.setFont(new Font("Bitstream Vera Sans", Font.BOLD, 21));
        add(labelHeadlineForm);
        add(hSpacer1);

        //---- labelName ----
        labelName.setText("Name:");
        add(labelName);
        add(textFieldName);

        //---- labelLastName ----
        labelLastName.setText("Last name:");
        add(labelLastName);
        add(textFieldLastName);

        //---- labelGender ----
        labelGender.setText("Gender:");
        add(labelGender);
        add(comboGender);

        //---- labelQuarantined ----
        labelQuarantined.setText("Quarantined:");
        add(labelQuarantined);
        add(checkQuarantined);

        //---- labelYearBorn ----
        labelYearBorn.setText("Year born:");
        add(labelYearBorn);

        //---- spinnerYearBorn ----
        spinnerYearBorn.setModel(new SpinnerNumberModel(1920, 1920, 2020, 1));
        add(spinnerYearBorn);
        add(vSpacer5);

        //---- buttonSubmit ----
        buttonSubmit.setText("Submit");
        add(buttonSubmit);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JLabel labelHeadlineForm;
    private JPanel hSpacer1;
    private JLabel labelName;
    private JTextField textFieldName;
    private JLabel labelLastName;
    private JTextField textFieldLastName;
    private JLabel labelGender;
    private JComboBox comboGender;
    private JLabel labelQuarantined;
    private JCheckBox checkQuarantined;
    private JLabel labelYearBorn;
    private JSpinner spinnerYearBorn;
    private JPanel vSpacer5;
    private JButton buttonSubmit;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
