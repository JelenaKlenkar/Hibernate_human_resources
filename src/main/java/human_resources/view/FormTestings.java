/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import human_resources.controller.ProcessingJobApplication;
import human_resources.controller.ProcessingTesting;
import human_resources.model.JobApplication;
import human_resources.model.Testing;
import human_resources.utility.JelenaException;
import human_resources.utility.Utility;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jelena
 */
public class FormTestings extends JelenaView<Testing> {

    /**
     * Creates new form FormTesting
     */
    private ProcessingTesting processing;

    public FormTestings() {
        initComponents();
        processing = new ProcessingTesting();
        setTitle(Utility.getNameOfApplication() + " Testings");
        btnSearch.setText("\uD83D\uDD0D");
        DatePickerSettings dps = new DatePickerSettings();
        dps.setFormatForDatesCommonEra("dd.MM.yyyy.");
        dpDateOfTesting.setSettings(dps);
        loadJobApplications();
        load();
    }

    protected void load() {
        DefaultListModel<Testing> model = new DefaultListModel<>();
        processing.getEntitys(txtCondition.getText().trim()).forEach(
                (testing) -> {
                    model.addElement(testing);
                });
        List.setModel(model);
        List.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTypeOfTesting = new javax.swing.JLabel();
        lblDateOfTesting = new javax.swing.JLabel();
        lblNumberOfTesting = new javax.swing.JLabel();
        lblResultOfTesting = new javax.swing.JLabel();
        jsNumberOfTesting = new javax.swing.JSpinner();
        dpDateOfTesting = new com.github.lgooddatepicker.components.DatePicker();
        txtTypeOfTesting = new javax.swing.JTextField();
        lblPercent = new javax.swing.JLabel();
        txtResultOfTesting = new javax.swing.JTextField();
        lblJobApplication = new javax.swing.JLabel();
        cmbJobApplication = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtCondition = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 2, 12))); // NOI18N

        lblTypeOfTesting.setText("Type of testing:");
        lblTypeOfTesting.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        lblDateOfTesting.setText("Date of testing:");
        lblDateOfTesting.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        lblNumberOfTesting.setText("Number of testing:");
        lblNumberOfTesting.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        lblResultOfTesting.setText("Result of testing:");
        lblResultOfTesting.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        jsNumberOfTesting.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));
        jsNumberOfTesting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dpDateOfTesting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtTypeOfTesting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTypeOfTesting.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblPercent.setText("%");
        lblPercent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblPercent.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        txtResultOfTesting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtResultOfTesting.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblJobApplication.setText("Job application: ");
        lblJobApplication.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJobApplication)
                        .addGap(18, 18, 18)
                        .addComponent(cmbJobApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(156, 156, 156)
                                                .addComponent(txtResultOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblResultOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblNumberOfTesting)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jsNumberOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTypeOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTypeOfTesting))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDateOfTesting)
                                .addGap(26, 26, 26)
                                .addComponent(dpDateOfTesting, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJobApplication)
                    .addComponent(cmbJobApplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTypeOfTesting, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txtTypeOfTesting))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOfTesting)
                    .addComponent(dpDateOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsNumberOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPercent))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List);

        btnAdd.setText("Add");
        btnAdd.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtCondition.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        btnSearch.setText("S");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Testing t = new Testing();

          if (dpDateOfTesting.getDate() != null) {

            Date d = Utility.convertToDateViaInstant(dpDateOfTesting.getDate());
            t.setDateOfTesting(d);

        }

        save(t);
    }//GEN-LAST:event_btnAddActionPerformed

    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        Testing t = List.getSelectedValue();
        if (t == null) {
            return;
        }
        setValues(t);

    }//GEN-LAST:event_ListValueChanged

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Testing t = List.getSelectedValue();
        if (t == null) {
            JOptionPane.showMessageDialog(null, "First choose item");
            return;
        }
        save(t);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Testing t = List.getSelectedValue();
        if (t == null) {
            JOptionPane.showMessageDialog(null, "First choose item");
            return;
        }
        if (JOptionPane.showConfirmDialog(
                null,
                "Safe to delete" + " " + t.getTypeOfTesting() + " " + t.getTypeOfTesting(),
                "Delete testing",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            processing.delete(t);
        } catch (JelenaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }

        load();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtCondition.getText().trim().length() < 1) {
            JOptionPane.showMessageDialog(null, "Minimum 1 characters");
            return;
        }
        load();
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Testing> List;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<JobApplication> cmbJobApplication;
    private com.github.lgooddatepicker.components.DatePicker dpDateOfTesting;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsNumberOfTesting;
    private javax.swing.JLabel lblDateOfTesting;
    private javax.swing.JLabel lblJobApplication;
    private javax.swing.JLabel lblNumberOfTesting;
    private javax.swing.JLabel lblPercent;
    private javax.swing.JLabel lblResultOfTesting;
    private javax.swing.JLabel lblTypeOfTesting;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtResultOfTesting;
    private javax.swing.JTextField txtTypeOfTesting;
    // End of variables declaration//GEN-END:variables

    protected void save(Testing t) {
        if (!control(t)) {
            return;
        }
        t.setJobApplications((JobApplication) cmbJobApplication.getSelectedItem());
        t.setTypeOfTesting(txtTypeOfTesting.getText());
        t.setNumberOfTesting((Integer) jsNumberOfTesting.getValue());
        t.setresultOfTesting(Integer.parseInt(txtResultOfTesting.getText()));
        t.setDateOfTesting(Utility.convertToDateViaInstant(dpDateOfTesting.getDate()));
        try {
            processing.save(t);
        } catch (JelenaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }

        load();

    }

    protected boolean control(Testing t) {
        return controlTypeOfTesting(t)
                && controlDateOfTesting(t)
                && controlNumberOfTesting(t)
                && controlResultOfTesting(t);
    }

    private boolean controlTypeOfTesting(Testing t) {
        if (txtTypeOfTesting.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Type of testing is mandatory");
            return false;
        }
        t.setTypeOfTesting(txtTypeOfTesting.getText());
        return true;
    }

    private boolean controlDateOfTesting(Testing t) {
        if (dpDateOfTesting.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Date of testing is mandatory");
            return false;
        }
        t.setDateOfTesting(Utility.convertToDateViaInstant(dpDateOfTesting.getDate()));
        return true;
    }

    private boolean controlNumberOfTesting(Testing t) {
        /*if (jsNumberOfTesting.getValue() == 0) {
            JOptionPane.showMessageDialog(null, "You need to select number of testing");
            return false;
        }*/
        t.setNumberOfTesting((Integer) jsNumberOfTesting.getValue());
        return true;
    }

    private boolean controlResultOfTesting(Testing t) {
        if (txtResultOfTesting.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Result of testing is mandatory");
            return false;
        }
        t.setresultOfTesting(Integer.parseInt(txtResultOfTesting.getText()));
        return true;
    }

    @Override
    protected void setValues(Testing t) {
        cmbJobApplication.setSelectedItem(t.getJobApplications());
        txtTypeOfTesting.setText(t.getTypeOfTesting());
        t.setDateOfTesting(Utility.convertToDateViaInstant(dpDateOfTesting.getDate()));
        t.setNumberOfTesting((Integer) jsNumberOfTesting.getValue());
        t.setresultOfTesting(Integer.parseInt(txtResultOfTesting.getText()));

    }

    private void loadJobApplications() {
        DefaultComboBoxModel<JobApplication> m = new DefaultComboBoxModel<>();
        JobApplication ja = new JobApplication();
        ja.setId(0);
        ja.setNumberOfApplication(Integer.parseInt("0"));

        m.addElement(ja);

        new ProcessingJobApplication().getEntitys().forEach((jobApplication) -> {
            m.addElement(jobApplication);
        });
        cmbJobApplication.setModel(m);

    }
}
