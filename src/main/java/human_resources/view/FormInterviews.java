/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.view;

import com.toedter.calendar.JDateChooser;
import human_resources.controller.ProcessingInterview;
import human_resources.controller.ProcessingJobApplication;
import human_resources.model.Interview;
import human_resources.model.JobApplication;
import human_resources.utility.JelenaException;
import human_resources.utility.Utility;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jelena
 */
public class FormInterviews extends JelenaView<Interview> {

    /**
     * Creates new form FormInterview
     */
    private ProcessingInterview processing;

    public FormInterviews() {
        initComponents();
        processing = new ProcessingInterview();
        setTitle(Utility.getNameOfApplication() + " Interviews");
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setLocale(Locale.ENGLISH);
        dateChooser.setDateFormatString("dd.MM.yyyy");
        btnSearch.setText("\uD83D\uDD0D");
        loadJobApplications();
        load();
    }

    protected void load() {
        DefaultListModel<Interview> model = new DefaultListModel<>();
        processing.getEntitys().forEach(
                (interview) -> {
                    model.addElement(interview);
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
        lblTypeOfInterview = new javax.swing.JLabel();
        txtTypeOfInterview = new javax.swing.JTextField();
        lblDateOfInterview = new javax.swing.JLabel();
        dcDateOfInterview = new com.toedter.calendar.JDateChooser();
        lblNumberOfInterview = new javax.swing.JLabel();
        jsNumberOfInterview = new javax.swing.JSpinner();
        lblJobApplication = new javax.swing.JLabel();
        cmbJobApplication = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        txtCondition = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 460));
        setPreferredSize(new java.awt.Dimension(750, 460));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 2, 12))); // NOI18N

        lblTypeOfInterview.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblTypeOfInterview.setText("Type of interview:");

        txtTypeOfInterview.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblDateOfInterview.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblDateOfInterview.setText("Date of interview:");

        dcDateOfInterview.setDateFormatString("dd.MM.yyyy.");
        dcDateOfInterview.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblNumberOfInterview.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblNumberOfInterview.setText("NumberOfInterview:");

        jsNumberOfInterview.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        lblJobApplication.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblJobApplication.setText("Job application: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNumberOfInterview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsNumberOfInterview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDateOfInterview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcDateOfInterview, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTypeOfInterview)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTypeOfInterview, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblJobApplication)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbJobApplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJobApplication)
                    .addComponent(cmbJobApplication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTypeOfInterview)
                    .addComponent(txtTypeOfInterview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblDateOfInterview))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcDateOfInterview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberOfInterview)
                    .addComponent(jsNumberOfInterview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        btnAdd.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnUpdate.setText("Update");

        btnDelete.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnDelete.setText("Delete");

        List.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        List.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(List);

        txtCondition.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtCondition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAdd)
                        .addGap(26, 26, 26)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Date d = dcDateOfInterview.getDate();
        System.out.println(d);
        Interview i = new Interview();

        save(i);
    }//GEN-LAST:event_btnAddActionPerformed

    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        Interview i = List.getSelectedValue();
        if (i == null) {
            return;
        }
        setValues(i);
    
    }//GEN-LAST:event_ListValueChanged

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       if (txtCondition.getText().trim().length() < 1) {
            JOptionPane.showMessageDialog(null, "Minimum 1 characters");
            return;
        }
        load();
    }//GEN-LAST:event_btnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Interview> List;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<JobApplication> cmbJobApplication;
    private com.toedter.calendar.JDateChooser dcDateOfInterview;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jsNumberOfInterview;
    private javax.swing.JLabel lblDateOfInterview;
    private javax.swing.JLabel lblJobApplication;
    private javax.swing.JLabel lblNumberOfInterview;
    private javax.swing.JLabel lblTypeOfInterview;
    private javax.swing.JLabel txtCondition;
    private javax.swing.JTextField txtTypeOfInterview;
    // End of variables declaration//GEN-END:variables

    @Override
    protected void save(Interview i) {
        if (!control(i)) {
            return;

        }
        try {
            processing.save(i);
        } catch (JelenaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }

        load();
    }

    @Override
    protected boolean control(Interview i) {
        return controlTypeOfInterview(i)
                && controlDateOfInterview(i)
                && controlNumberOfInterview(i);

    }

    @Override
    protected void setValues(Interview i) {
        txtTypeOfInterview.setText(i.getTypeOfInterview());
        
    }

    private boolean controlTypeOfInterview(Interview i) {
        if (txtTypeOfInterview.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Type of interview is mandatory");
            return false;
        }
        i.setTypeOfInterview(txtTypeOfInterview.getText());
        return true;
    }

    private boolean controlDateOfInterview(Interview i) {
        if (dcDateOfInterview.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Selection of date of interview is mandatory");
            return false;
    }
        i.setDateOfInterview(dcDateOfInterview.getDate());
        return true;
    }
    private boolean controlNumberOfInterview(Interview i) {
     if(jsNumberOfInterview.getValue()==null){
         JOptionPane.showMessageDialog(null,"You need to select number of interview");
           return false; 
        }
     jsNumberOfInterview.getValue();
     return true;
    }
    
    private void loadJobApplications(){
       DefaultComboBoxModel<JobApplication> m = new DefaultComboBoxModel<>();
        JobApplication ja = new JobApplication();
        ja.setId(0);
//        ja.setNumberOfApplication(Integer.parseInt("Choose job application"));
       
      

        m.addElement(ja);

        new ProcessingJobApplication().getEntitys().forEach((jobApplication) -> {
            m.addElement(jobApplication);
        });
        cmbJobApplication.setModel(m);

    }
    
    }


