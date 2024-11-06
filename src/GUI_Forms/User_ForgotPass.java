package GUI_Forms;
import Functions.Log_in;
import javax.swing.JOptionPane;
public class User_ForgotPass extends javax.swing.JFrame {
Log_in log = new Log_in();
    public User_ForgotPass() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        haha1 = new javax.swing.JPanel();
        hehe1 = new javax.swing.JLabel();
        hehe3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        secans = new javax.swing.JTextField();
        VER = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        secquest = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        haha1.setBackground(new java.awt.Color(2, 39, 60));

        hehe1.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        hehe1.setForeground(new java.awt.Color(255, 255, 255));
        hehe1.setText("EMAIL:");

        hehe3.setFont(new java.awt.Font("Sitka Display", 1, 12)); // NOI18N
        hehe3.setForeground(new java.awt.Color(255, 255, 255));
        hehe3.setText("SECURITY QUESTION:");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        VER.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        VER.setText("VERIFY");
        VER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VERActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORGOT PASSWORD");

        secquest.setFont(new java.awt.Font("Sitka Heading", 0, 12)); // NOI18N
        secquest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "THE NAME OF YOUR FIRST PET", "THE CITY THAT YOU WHERE BORN", "YOUR MOTHERS MAIDEN NAME", "THE NAME OF THE SCHOOL YOU FIRST WENT INTO", " " }));
        secquest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secquestActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Sitka Display", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NOTE:");

        jLabel14.setFont(new java.awt.Font("Sitka Display", 2, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("ENTER THE SECURITY ANSWER THAT YOU SUBMIT DURING THE CREATION OF THE ACCOUNT");

        javax.swing.GroupLayout haha1Layout = new javax.swing.GroupLayout(haha1);
        haha1.setLayout(haha1Layout);
        haha1Layout.setHorizontalGroup(
            haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, haha1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(haha1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(haha1Layout.createSequentialGroup()
                                    .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(VER)
                                        .addComponent(jLabel1))
                                    .addGap(15, 15, 15))
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(secans, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(haha1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, haha1Layout.createSequentialGroup()
                        .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hehe1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, haha1Layout.createSequentialGroup()
                                .addComponent(hehe3)
                                .addGap(18, 18, 18)
                                .addComponent(secquest, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );
        haha1Layout.setVerticalGroup(
            haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(haha1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hehe1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hehe3)
                    .addComponent(secquest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secans, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(haha1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(15, 15, 15)
                .addComponent(VER)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(haha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(haha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void VERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VERActionPerformed
        log.setEmail(email.getText());
        log.setSec_answer(secans.getText());
        String securityQuestion = (String) secquest.getSelectedItem();
        if(email.getText().isEmpty() || secans.getText().isEmpty())
        {
             JOptionPane.showMessageDialog(null, "Cannot be empty!", "Empty text field", JOptionPane.ERROR_MESSAGE);
        }
        else {
            SQL_Conn.SQL_Conn.dbForgorPassValidation(log.getEmail(),securityQuestion,log.getSec_answer());
            this.dispose();
        }
        
        
    }//GEN-LAST:event_VERActionPerformed

    private void secquestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secquestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secquestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_ForgotPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_ForgotPass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VER;
    private javax.swing.JTextField email;
    private javax.swing.JPanel haha1;
    private javax.swing.JLabel hehe1;
    private javax.swing.JLabel hehe3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JTextField secans;
    private javax.swing.JComboBox<String> secquest;
    // End of variables declaration//GEN-END:variables
}