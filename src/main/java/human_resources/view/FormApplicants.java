/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.view;

import human_resources.controller.ProcessingApplicant;
import human_resources.model.Applicant;
import human_resources.utility.JelenaException;
import human_resources.utility.Utility;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.apache.commons.validator.routines.EmailValidator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Jelena
 */
public class FormApplicants extends JelenaView<Applicant> {

    /**
     * Creates new form FormApplicant
     */
    private ProcessingApplicant processing;

    public FormApplicants() {
        initComponents();
        setTitle(Utility.getNameOfApplication() + " Applicants");
        processing = new ProcessingApplicant();
         btnSearch.setText("\uD83D\uDD0D");
        //load();
    }

    protected void load() {
        DefaultListModel<Applicant> model = new DefaultListModel<>();
        processing.getEntitys(txtCondition.getText().trim()).forEach(
                (applicant) -> {
                    model.addElement(applicant);
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
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPersonalIdentificationNumber = new javax.swing.JLabel();
        txtPersonalIdentificationNumber = new javax.swing.JTextField();
        lblApplicantCV = new javax.swing.JLabel();
        txtApplicantCv = new javax.swing.JTextField();
        lblMotivationalLetter = new javax.swing.JLabel();
        txtMotivationalLetter = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        txtCondition = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 2, 12))); // NOI18N

        lblFirstName.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblFirstName.setText("First name:");

        txtFirstName.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblLastName.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblLastName.setText("Last name:");

        txtLastName.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblAddress.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblAddress.setText("Address:");

        txtAddress.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblPhoneNumber.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblPhoneNumber.setText("Phone number:");

        txtPhoneNumber.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblEmail.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblPersonalIdentificationNumber.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblPersonalIdentificationNumber.setText("Personal identification number:");
        lblPersonalIdentificationNumber.setToolTipText("");

        txtPersonalIdentificationNumber.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblApplicantCV.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblApplicantCV.setText("Applicant CV:");

        txtApplicantCv.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        lblMotivationalLetter.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lblMotivationalLetter.setText("Motivational letter:");

        txtMotivationalLetter.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblMotivationalLetter)
                            .addComponent(lblApplicantCV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPersonalIdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMotivationalLetter, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtPersonalIdentificationNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtEmail)
                            .addComponent(txtApplicantCv)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtAddress)
                            .addComponent(txtLastName)
                            .addComponent(txtFirstName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(31, 31, 31)
                        .addComponent(btnDelete)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPersonalIdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPersonalIdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApplicantCv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApplicantCV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMotivationalLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMotivationalLetter))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        List.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        List.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        List.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(List);

        btnSearch.setText("S");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnExportExcel.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        btnExportExcel.setText("Export Excel");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCondition, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnExportExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCondition))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExportExcel)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Applicant a = new Applicant();

        save(a);
    }//GEN-LAST:event_btnAddActionPerformed

    protected void save(Applicant a) {
        if (!control(a)) {
            return;

        }
        try {
            processing.save(a);
        } catch (JelenaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }

        load();
    }

    protected boolean control(Applicant a) {
        return controlFirstName(a)
                && controlLastName(a)
                && controlAddress(a)
                && controlPhoneNumber(a)
                && controlEmail(a)
                && controlPersonalIdentificationNumber(a)
                && controlApplicantCV(a)
                && controlMotivationalLetter(a);
    }

    private boolean controlFirstName(Applicant a) {

        if (txtFirstName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "First name is mandatory");
            return false;
        }
        a.setFirstName(txtFirstName.getText());
        return true;
    }

    private boolean controlLastName(Applicant a) {

        if (txtLastName.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Last name is mandatory");
            return false;
        }
        a.setLastName(txtLastName.getText());
        return true;
    }

    private boolean controlAddress(Applicant a) {
        if (txtAddress.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Address is mandatory");
            return false;
        }
        a.setAddress(txtAddress.getText());
        return true;
    }

    private boolean controlPhoneNumber(Applicant a) {

        if (txtPhoneNumber.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Phone number is mandatory");
            return false;
        }
        a.setPhoneNumber(txtPhoneNumber.getText());
        return true;
    }

    private boolean controlEmail(Applicant a) {

        if (txtEmail.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Email is mandatory");
            return false;
        }

        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(txtEmail.getText())) {
            error(txtEmail, "Input of valid email is mandatory");
            return false;
        }

        a.setEmail(txtEmail.getText());
        return true;
    }

    private boolean controlPersonalIdentificationNumber(Applicant a) {

        if (txtPersonalIdentificationNumber.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Personal identification number is mandatory");
            return false;
        }
        a.setPersonalIdentificationNumber(txtPersonalIdentificationNumber.getText());
        return true;
    }

    private boolean controlApplicantCV(Applicant a) {

        if (txtApplicantCv.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Applicant cv is mandatory");
            return false;
        }
        a.setApplicantCV(txtApplicantCv.getText());
        return true;
    }

    private boolean controlMotivationalLetter(Applicant a) {

        if (txtMotivationalLetter.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "MotivationalLetter is mandatory");
            return false;
        }
        a.setMotivationalLetter(txtMotivationalLetter.getText());
        return true;
    }

    private void ListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
        Applicant a = List.getSelectedValue();
        if (a == null) {
            return;
        }
        setValues(a);
    }

    protected void setValues(Applicant a) {

        txtFirstName.setText(a.getFirstName());
        txtLastName.setText(a.getLastName());
        txtAddress.setText(a.getAddress() == null ? "" : a.getAddress());
        txtPhoneNumber.setText(a.getPhoneNumber() == null ? "" : a.getPhoneNumber());
        txtEmail.setText(a.getEmail() == null ? "" : a.getEmail());
        txtPersonalIdentificationNumber.setText(a.getPersonalIdentificationNumber() == null ? "" : a.getPersonalIdentificationNumber());
        txtApplicantCv.setText(a.getApplicantCV() == null ? "" : a.getApplicantCV());
        txtMotivationalLetter.setText(a.getMotivationalLetter() == null ? "" : a.getMotivationalLetter());
    }//GEN-LAST:event_ListValueChanged

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Applicant a = List.getSelectedValue();
        if (a == null) {
            JOptionPane.showMessageDialog(null, "First choose item");
            return;
        }
        save(a);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Applicant a = List.getSelectedValue();
        if (a == null) {
            JOptionPane.showMessageDialog(null, "First choose item");
            return;
        }
        if (JOptionPane.showConfirmDialog(
                null,
                "Safe to delete" + " " + a.getFirstName() + " " + a.getLastName(),
                "Delete applicant",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE)
                == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            processing.delete(a);
        } catch (JelenaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }

        load();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(txtCondition.getText().trim().length()<2){
            JOptionPane.showMessageDialog(null, "Minimum 2 characters");
            return;
        }
        load();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        try {
            
        
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        /* CreationHelper helps us create instances of various things like DataFormat, 
           Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way */
        CreationHelper createHelper = workbook.getCreationHelper();

        // Create a Sheet
        Sheet sheet = workbook.createSheet("Applicants");

       


        // Create a Row
        Row headerRow = sheet.createRow(0);

            Cell cell = headerRow.createCell(0);
            cell.setCellValue("First name");
        
            cell = headerRow.createCell(1);
            cell.setCellValue("Last name");
        
            int rowNum=1;
        for(Applicant a : processing.getEntitys()) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(a.getFirstName());

            row.createCell(1)
                    .setCellValue(a.getLastName());

        }

	
        // Write the output to a file
        FileOutputStream fileOut = new FileOutputStream("E:" + File.separator + "poi-generated-file.xlsx");
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
        
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExportExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Applicant> List;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblApplicantCV;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMotivationalLetter;
    private javax.swing.JLabel lblPersonalIdentificationNumber;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtApplicantCv;
    private javax.swing.JTextField txtCondition;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMotivationalLetter;
    private javax.swing.JTextField txtPersonalIdentificationNumber;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables

    private void error(JComponent component, String message) {
        JOptionPane.showMessageDialog(null, message);
        component.setBackground(Color.RED);
        component.setForeground(Color.WHITE);
        component.requestFocus();

    }

}
