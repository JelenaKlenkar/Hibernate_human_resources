/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.view;

import human_resources.controller.ProcessingJobPosition;
import human_resources.model.JobPosition;
import human_resources.utility.JelenaException;
import human_resources.utility.Utility;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jelena
 */
public class FormJobPositions extends JelenaView<JobPosition> {

    /**
     * Creates new form FormJobPosition
     */
    private ProcessingJobPosition processing;

    public FormJobPositions() {
        initComponents();
        setTitle(Utility.getNameOfApplication() + " Job positions");
        processing = new ProcessingJobPosition();
        load();
    }

    protected void load() {
        DefaultListModel<JobPosition> model = new DefaultListModel<>();
        processing.getEntitys().forEach(
                (jobPosition) -> {
                    model.addElement(jobPosition);
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
        lblNameOfJobPosition = new javax.swing.JLabel();
        txtNameOfJobPosition = new javax.swing.JTextField();
        lblJobDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtJobDescription = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 2, 12))); // NOI18N

        lblNameOfJobPosition.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblNameOfJobPosition.setText("Name of job position:");

        txtNameOfJobPosition.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblJobDescription.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblJobDescription.setText("Job description:");

        txtJobDescription.setColumns(20);
        txtJobDescription.setLineWrap(true);
        txtJobDescription.setRows(5);
        jScrollPane1.setViewportView(txtJobDescription);

        btnAdd.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblNameOfJobPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNameOfJobPosition)
                        .addComponent(lblJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameOfJobPosition)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameOfJobPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblJobDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(51, 51, 51))
        );

        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(List);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        JobPosition jp = new JobPosition();
        save(jp);
    }//GEN-LAST:event_btnAddActionPerformed

    protected void setValues(JobPosition jp) {

        txtNameOfJobPosition.setText(jp.getNameOfJobPosition());
        txtJobDescription.setText(jp.getJobDescription());

    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        JobPosition jp = List.getSelectedValue();
        if (jp == null) {
            JOptionPane.showMessageDialog(null, "First choose item");
            return;
        }
        save(jp);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        JobPosition jp = List.getSelectedValue();
        if (jp == null) {
            return;
        }
        setValues(jp);
    }//GEN-LAST:event_ListValueChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JobPosition jp = List.getSelectedValue();
        if (jp == null) {
            JOptionPane.showMessageDialog(null, "First choose item");
            return;
        }
        if (JOptionPane.showConfirmDialog(
                null,
                "Safe to delete" + " " + jp.getNameOfJobPosition(),
                "Delete job position",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            processing.delete(jp);
        } catch (JelenaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }

        load();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<JobPosition> List;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblJobDescription;
    private javax.swing.JLabel lblNameOfJobPosition;
    private javax.swing.JTextArea txtJobDescription;
    private javax.swing.JTextField txtNameOfJobPosition;
    // End of variables declaration//GEN-END:variables

    protected void save(JobPosition jp) {
        if (!control(jp)) {
            return;
        }
        try {
            processing.save(jp);
        } catch (JelenaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }

        load();
    }

    protected boolean control(JobPosition jp) {
        return controlNameOfJobPosition(jp)
                && controlJobDescription(jp);
    }

    private boolean controlNameOfJobPosition(JobPosition jp) {
        if (txtNameOfJobPosition.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Name of job position is mandatory");
            return false;
        }
        jp.setNameOfJobPosition(txtNameOfJobPosition.getText());
        return true;
    }

    private boolean controlJobDescription(JobPosition jp) {
        if (txtJobDescription.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Job description is mandatory");
            return false;
        }
        jp.setJobDescription(txtJobDescription.getText());
        if (txtJobDescription.getText().length() > 500) {
            JOptionPane.showMessageDialog(null,"Job description cannot contain more then 500 characters");
        }
        
        return true;
    }
}
