/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import human_resources.controller.ProcessingTesting;
import human_resources.model.Testing;
import human_resources.utility.JelenaException;
import human_resources.utility.Utility;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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

        DatePickerSettings dps = new DatePickerSettings();
        dps.setFormatForDatesCommonEra("dd.MM.yyyy.");
        dpDateOfTesting.setSettings(dps);
    }

    protected void load() {
        DefaultListModel<Testing> model = new DefaultListModel<>();
        processing.getEntitys().forEach(
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

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

        txtTypeOfTesting.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        jComboBox1.setMaximumRowCount(100);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDateOfTesting)
                            .addComponent(lblTypeOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTypeOfTesting)
                            .addComponent(dpDateOfTesting, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumberOfTesting))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jsNumberOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTypeOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfTesting)
                    .addComponent(dpDateOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsNumberOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResultOfTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
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

        btnDelete.setText("Delete");
        btnDelete.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Date d = Utility.convertToDateViaInstant(dpDateOfTesting.getDate());

        System.out.println(d);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Testing> List;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private com.github.lgooddatepicker.components.DatePicker dpDateOfTesting;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsNumberOfTesting;
    private javax.swing.JLabel lblDateOfTesting;
    private javax.swing.JLabel lblNumberOfTesting;
    private javax.swing.JLabel lblResultOfTesting;
    private javax.swing.JLabel lblTypeOfTesting;
    private javax.swing.JTextField txtTypeOfTesting;
    // End of variables declaration//GEN-END:variables

    protected void save(Testing t) {
        if (!control(t)) {
            return;
        }
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
        if (dpDateOfTesting.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Date of testing is mandatory");
            return false;
        }

        return true;
    }

    private boolean controlNumberOfTesting(Testing t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean controlResultOfTesting(Testing t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void setValues(Testing t) {
        txtTypeOfTesting.setText(t.getTypeOfTesting());
      

    }
}
