/*
 * Created by JFormDesigner on Sun Aug 16 15:36:27 CEST 2020
 */

package com.sda.classmanager.view;

import java.awt.*;
import javax.swing.*;

/**
 * @author Pawel
 */
public class StudentData extends JPanel {
    public StudentData() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        labelDescription = new JLabel();
        hSpacer1 = new JPanel(null);
        firstNameLabel = new JLabel();
        labelName = new JTextField();
        label3 = new JLabel();
        labelLastName = new JTextField();
        label4 = new JLabel();
        spinnerYearBorn = new JSpinner();
        label5 = new JLabel();
        comboGender = new JComboBox();
        label6 = new JLabel();
        checkQuarantined = new JCheckBox();
        buttonSave = new JButton();
        buttonDelete = new JButton();

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder( 0
        , 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
        , new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,
         getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
        ) {if ("\u0062order" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new GridLayout(7, 2));

        //---- labelDescription ----
        labelDescription.setText("Student Data:");
        add(labelDescription);
        add(hSpacer1);

        //---- firstNameLabel ----
        firstNameLabel.setText("First Name:");
        add(firstNameLabel);
        add(labelName);

        //---- label3 ----
        label3.setText("Last Name:");
        add(label3);
        add(labelLastName);

        //---- label4 ----
        label4.setText("Year born:");
        add(label4);
        add(spinnerYearBorn);

        //---- label5 ----
        label5.setText("Gender: ");
        add(label5);
        add(comboGender);

        //---- label6 ----
        label6.setText("Quarantined:");
        add(label6);
        add(checkQuarantined);

        //---- buttonSave ----
        buttonSave.setText("Save");
        add(buttonSave);

        //---- buttonDelete ----
        buttonDelete.setText("Delete");
        add(buttonDelete);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JLabel labelDescription;
    private JPanel hSpacer1;
    private JLabel firstNameLabel;
    private JTextField labelName;
    private JLabel label3;
    private JTextField labelLastName;
    private JLabel label4;
    private JSpinner spinnerYearBorn;
    private JLabel label5;
    private JComboBox comboGender;
    private JLabel label6;
    private JCheckBox checkQuarantined;
    private JButton buttonSave;
    private JButton buttonDelete;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
