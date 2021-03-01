package planetfoodapp.gui;


import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import planetfoodapp.dao.UserDao;
import planetfoodapp.dbutil.DBConnection;
import planetfoodapp.pojo.UserProfile;
import planetfoodapp.pojo.Users;

/**
 *
 * @author Lenovo User
 */
public class LoginFrame extends javax.swing.JFrame {
    private String userId, password;

    /**
     *
     */
    public LoginFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private int validateInput(){
        userId =txtUserId.getText();
        char[]pwd=txtPassword.getPassword();
        if(userId.isEmpty()){
           return -1;  
        }
        else if(pwd.length==0){
            return 0;
        }
        else{
            password = String.valueOf(pwd);
            return 1;
        }
    }
    private String getUserType(){
        if(jrAdmin.isSelected())
            return jrAdmin.getText();
        else if(jrCashier.isSelected())
            return jrCashier.getText();
        else
            return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jrAdmin = new javax.swing.JRadioButton();
        jrCashier = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN PAGE");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 153, 102), 3, true));
        jPanel1.setForeground(new java.awt.Color(0, 102, 102));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USER LOGIN SCREEN");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login Details");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/planetfoodapp/gui/login.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setForeground(new java.awt.Color(0, 102, 102));

        jrAdmin.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrAdmin);
        jrAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jrAdmin.setText("Admin");
        jrAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAdminActionPerformed(evt);
            }
        });
        jrAdmin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrAdminKeyPressed(evt);
            }
        });

        jrCashier.setBackground(new java.awt.Color(0, 102, 102));
        buttonGroup1.add(jrCashier);
        jrCashier.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrCashier.setForeground(new java.awt.Color(255, 255, 255));
        jrCashier.setText("Cashier");
        jrCashier.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jrCashierKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jrAdmin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jrCashier)
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrAdmin)
                    .addComponent(jrCashier))
                .addGap(21, 21, 21))
        );

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("USER TYPE");

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(0, 102, 102));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("QUIT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setLabelFor(txtUserId);
        jLabel5.setText("USER-ID");

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PASSWORD");

        txtUserId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        txtUserId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserIdKeyPressed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(txtPassword))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnLogin)
                .addGap(155, 155, 155)
                .addComponent(btnQuit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(170, 170, 170)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLogin)
                                    .addComponent(btnQuit))
                                .addContainerGap(55, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       int isValidInput = validateInput();
          if(isValidInput==-1)
       {
           JOptionPane.showMessageDialog(null,"UserId Field Can not be left blank!","ERROR!",JOptionPane.ERROR_MESSAGE);
           return ;
       }
       else if(isValidInput==0)
       {
           JOptionPane.showMessageDialog(null,"Password Field Can not be left blank!","ERROR!",JOptionPane.ERROR_MESSAGE);
           return ;
       }
       
       String usertype = getUserType();
     
       if(usertype==null)
       {
           JOptionPane.showMessageDialog(null,"Please choose a option!","ERROR!",JOptionPane.ERROR_MESSAGE);
       }
       try
       {
           Users user =new Users();
            user.setUserId(userId);
            user.setPassword(password);
            user.setUserType(usertype);
          
               String username;
               username = UserDao.validateUser(user);
               
               if(username!=null)
               {
                  JOptionPane.showMessageDialog(null,"Login Accepted!","WELCOME- "+username,JOptionPane.INFORMATION_MESSAGE);
                  UserProfile.setUsername(username);
                  UserProfile.setUsertype(usertype);
                  UserProfile.setUserid(userId);
                  
              
                 if (usertype.equalsIgnoreCase("admin"))
                   {
                   AdminOptionsFrame adminoptionsframe = new AdminOptionsFrame();
                   adminoptionsframe.setVisible(true);
                 
                   } 
                 else 
                 {
                   CashierOptionsFrame cashieroptionsframe = new CashierOptionsFrame();
                   cashieroptionsframe.setVisible(true);
                  
                 }      
                this.dispose();
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"Invalid userId/Password!","Login Denied!",JOptionPane.ERROR_MESSAGE);
               }
       }
               catch(Exception ex){
                       JOptionPane.showMessageDialog(null,"Error while connecting in database!","Login Exception!",JOptionPane.ERROR_MESSAGE);
                     ex.printStackTrace();
                       }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     *
     */
    public void Login(){
       int isValidInput = validateInput();
       if(isValidInput==-1)
       {
           JOptionPane.showMessageDialog(null,"UserId Field Can not be left blank!","ERROR!",JOptionPane.ERROR_MESSAGE);
           return ;
       }
       else if(isValidInput==0)
       {
           JOptionPane.showMessageDialog(null,"Password Field Can not be left blank!","ERROR!",JOptionPane.ERROR_MESSAGE);
           return ;
       }
       
       String usertype = getUserType();
     
       if(usertype==null)
       {
           JOptionPane.showMessageDialog(null,"Please choose a option!","ERROR!",JOptionPane.ERROR_MESSAGE);
       }
       try
       {
           Users user =new Users();
            user.setUserId(userId);
            user.setPassword(password);
            user.setUserType(usertype);
          
               String username;
               username = UserDao.validateUser(user);
               
               if(username!=null)
               {
                  JOptionPane.showMessageDialog(null,"Login Accepted!","WELCOME- "+username,JOptionPane.INFORMATION_MESSAGE);
                  UserProfile.setUsername(username);
                  UserProfile.setUsertype(usertype);
                  UserProfile.setUserid(userId);
                  
              
                 if (usertype.equalsIgnoreCase("admin"))
                   {
                   AdminOptionsFrame adminoptionsframe =new AdminOptionsFrame();
                   adminoptionsframe.setVisible(true);
                 
                   } 
                 else 
                 {
                   CashierOptionsFrame cashieroptionsframe = new CashierOptionsFrame();
                   cashieroptionsframe.setVisible(true);
                  
                 }      
                this.dispose();
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"Invalid userId/Password!","Login Denied!",JOptionPane.ERROR_MESSAGE);
               }
       }
               catch(Exception ex){
                       JOptionPane.showMessageDialog(null,"Error while connecting in database!","Login Exception!",JOptionPane.ERROR_MESSAGE);
                     ex.printStackTrace();
               }
    }
    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
       int ans;
       ans=JOptionPane.showConfirmDialog(null,"Are you sure want to quit?","QUITTING!",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         if(ans==JOptionPane.YES_OPTION){
           DBConnection.closeConnection();
           System.exit(0);
       }
    }//GEN-LAST:event_btnQuitActionPerformed

    private void jrAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrAdminActionPerformed

    private void txtUserIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserIdKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
        txtPassword.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
        }
    }//GEN-LAST:event_txtUserIdKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_UP){
         txtUserId.requestFocus();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            jrAdmin.requestFocus();
            jrAdmin.doClick();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void jrAdminKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrAdminKeyPressed
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_ENTER:
                Login();
                break;
            case KeyEvent.VK_RIGHT:
                jrCashier.requestFocus();
                jrCashier.doClick();
                break;
            case KeyEvent.VK_UP:
                txtPassword.requestFocus();
                break;
            default:
                break;
        }
       
      
    }//GEN-LAST:event_jrAdminKeyPressed

    private void jrCashierKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jrCashierKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Login();
       }
       else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
           jrAdmin.requestFocus();
           jrAdmin.doClick();
       }
       else if(evt.getKeyCode()==KeyEvent.VK_UP){
         txtPassword.requestFocus();
       }
    }//GEN-LAST:event_jrCashierKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrAdmin;
    private javax.swing.JRadioButton jrCashier;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
