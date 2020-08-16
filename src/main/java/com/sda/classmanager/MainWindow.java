/*
 * Created by JFormDesigner on Sat Aug 15 14:23:19 CEST 2020
 */

package com.sda.classmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.*;

/**
 * @author unknown
 */
public class MainWindow extends JFrame {
    public MainWindow() {
        initComponents();

        // sekcja inicjalizacji zmiennych
        studentForm = new StudentForm();

        // sekcja konfiguracji widoku
        leftPanel.add(studentForm);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pawel
        leftPanel = new JPanel();
        panel2 = new JPanel();
        labelList = new JLabel();
        scrollPane1 = new JScrollPane();
        list1 = new JList();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(1, 2));

        //======== leftPanel ========
        {
            leftPanel.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border
            .EmptyBorder(0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax
            .swing.border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,
            12),java.awt.Color.red),leftPanel. getBorder()));leftPanel. addPropertyChangeListener(new java.beans
            .PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.
            getPropertyName()))throw new RuntimeException();}});
            leftPanel.setLayout(new GridLayout(1, 1, 1, 1));
        }
        contentPane.add(leftPanel);

        //======== panel2 ========
        {
            panel2.setLayout(new GridBagLayout());
            ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
            ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
            ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {1.0, 1.0, 0.0, 1.0E-4};

            //---- labelList ----
            labelList.setText("Student List:");
            labelList.setFont(new Font("Bitstream Vera Sans", Font.BOLD, 21));
            panel2.add(labelList, new GridBagConstraints(0, 0, 1, 1, 0.0, 1.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));

            //======== scrollPane1 ========
            {
                scrollPane1.setViewportView(list1);
            }
            panel2.add(scrollPane1, new GridBagConstraints(0, 1, 1, 1, 0.0, 10.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel2);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        // Prepare Combobox with available options (Genders)
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pawel
    private JPanel leftPanel;
    private JPanel panel2;
    private JLabel labelList;
    private JScrollPane scrollPane1;
    private JList list1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private final StudentForm studentForm;
}
