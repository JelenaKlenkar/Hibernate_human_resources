/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human_resources.view;

import human_resources.model.Operator;
import human_resources.utility.Utility;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import org.apache.commons.validator.routines.EmailValidator;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Jelena
 */
public class Authorisation extends javax.swing.JFrame {

    /**
     * Creates new form Authorisation
     */
    public Authorisation() {
        initComponents();
        //setTitle(Utility.getNameOfApplication());
        //if(Utility.isDev()){
        //txtEmail.setText("jelena.klenkar@gmail.com");
        // pswLozinka.setText("ja");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pswPassword = new javax.swing.JPasswordField();
        btnAuthorize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Human resources APP Authorisation");

        jLabel1.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel1.setText("Email");

        txtEmail.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        pswPassword.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        pswPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswPasswordKeyPressed(evt);
            }
        });

        btnAuthorize.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        btnAuthorize.setText("Authorize");
        btnAuthorize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAuthorize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAuthorizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(pswPassword)
                    .addComponent(btnAuthorize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 75, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pswPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnAuthorize, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAuthorizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAuthorizeActionPerformed
        if (txtEmail.getText().trim().length() == 0) {
            error(txtEmail, "Input of email is mandatory");
            return;
        }
        EmailValidator emailValidator = EmailValidator.getInstance();
        if (!emailValidator.isValid(txtEmail.getText())) {
            error(txtEmail, "Input of valid email is mandatory");
            return;
        }

        txtEmail.setBackground(Color.WHITE);
        txtEmail.setForeground(Color.BLACK);

        if (pswPassword.getPassword().length == 0) {
            error(pswPassword, "Input of password is mandatory");
            return;
        }

        pswPassword.setBackground(Color.WHITE);
        pswPassword.setForeground(Color.BLACK);

        Operator o = new Operator();

        if (o == null) {
            JOptionPane.showMessageDialog(null, "Email not found");
            txtEmail.requestFocus();
            return;
        }

        if (!BCrypt.checkpw(new String(pswPassword.getPassword()),
                o.getPassword())) {
            JOptionPane.showMessageDialog(null,
                    "Email or password is incorrect");
            pswPassword.requestFocus();
            return;
        }
    }//GEN-LAST:event_btnAuthorizeActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAuthorizeActionPerformed(null);
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void pswPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswPasswordKeyPressed
        txtEmailKeyPressed(evt);
    }//GEN-LAST:event_pswPasswordKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAuthorize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswPassword;
    private javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables

    private void error(JComponent component, String message) {
        JOptionPane.showMessageDialog(null, message);
        component.setBackground(Color.RED);
        component.setForeground(Color.WHITE);
        component.requestFocus();

    }
}
