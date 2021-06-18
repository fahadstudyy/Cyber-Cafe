package finalproject;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class userlogin extends javax.swing.JFrame {

    public userlogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBoxShowpass = new javax.swing.JCheckBox();
        Upass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Uusername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        close1 = new javax.swing.JLabel();
        lbl_Uusername = new javax.swing.JLabel();
        lbl_Upassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(385, 570));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER LOGIN");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(120, 30, 210, 60);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 200, 90, 22);

        jCheckBoxShowpass.setBackground(new java.awt.Color(0, 0, 0));
        jCheckBoxShowpass.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxShowpass.setText("Show Password");
        jCheckBoxShowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxShowpassActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBoxShowpass);
        jCheckBoxShowpass.setBounds(130, 390, 130, 23);

        Upass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpassActionPerformed(evt);
            }
        });
        Upass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UpassKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UpassKeyTyped(evt);
            }
        });
        getContentPane().add(Upass);
        Upass.setBounds(130, 330, 170, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 300, 90, 22);

        Uusername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Uusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UusernameActionPerformed(evt);
            }
        });
        Uusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UusernameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UusernameKeyTyped(evt);
            }
        });
        getContentPane().add(Uusername);
        Uusername.setBounds(130, 240, 170, 30);

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(191, 120, 86));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(160, 490, 80, 23);

        close1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        close1.setForeground(new java.awt.Color(255, 255, 255));
        close1.setText("X");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });
        getContentPane().add(close1);
        close1.setBounds(360, 10, 20, 20);

        lbl_Uusername.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Uusername.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Uusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_UusernameKeyReleased(evt);
            }
        });
        getContentPane().add(lbl_Uusername);
        lbl_Uusername.setBounds(130, 270, 150, 10);

        lbl_Upassword.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_Upassword.setForeground(new java.awt.Color(255, 0, 0));
        lbl_Upassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_UpasswordKeyReleased(evt);
            }
        });
        getContentPane().add(lbl_Upassword);
        lbl_Upassword.setBounds(130, 360, 140, 10);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\saadw\\OneDrive\\Desktop\\cafe.gif")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 385, 570);

        setSize(new java.awt.Dimension(386, 570));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowpassActionPerformed
        if(jCheckBoxShowpass.isSelected())
        {
            Upass.setEchoChar((char)0);
        }
        else
        {
            Upass.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBoxShowpassActionPerformed

    private void UpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpassActionPerformed

    }//GEN-LAST:event_UpassActionPerformed

    private void UusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UusernameActionPerformed

    }//GEN-LAST:event_UusernameActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      

        if(Uusername.getText().trim().isEmpty() && Upass.getText().trim().isEmpty()){
         lbl_Uusername.setText("User name is Empty");
        lbl_Upassword.setText("Password is Empty");
        }
        else if(Uusername.getText().trim().isEmpty()){
            lbl_Uusername.setText("User name is Empty");
        }
        else if(Upass.getText().trim().isEmpty()){
        lbl_Upassword.setText("Password is Empty");    
        }
        else{
        
            
           String Uuser,Upasssss;
        Uuser=Uusername.getText();
        Upasssss=Upass.getSelectedText();
        
        if( Uuser.equals("Fahad") || Uuser.equals("fahad")  && Upasssss.equals("756"))
        {
            userpannel ap=new userpannel();
            ap.setVisible(true);
        //ap.pack();
        ap.setLocationRelativeTo(null);
        ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        }
        else{
       System.out.println("Wrong Input");
            JOptionPane.showMessageDialog(null,"Wrong Username or Password");
        }
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close1MouseClicked

    private void lbl_UpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_UpasswordKeyReleased

    }//GEN-LAST:event_lbl_UpasswordKeyReleased

    private void lbl_UusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_UusernameKeyReleased

    }//GEN-LAST:event_lbl_UusernameKeyReleased

    private void UusernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UusernameKeyReleased
lbl_Uusername.setText("");
    }//GEN-LAST:event_UusernameKeyReleased

    private void UpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpassKeyReleased
lbl_Upassword.setText("");
    }//GEN-LAST:event_UpassKeyReleased

    private void UusernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UusernameKeyTyped
        // TODO add your handling code here:
       // String name= Uusername.getText();
        
    }//GEN-LAST:event_UusernameKeyTyped

    private void UpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UpassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_UpassKeyTyped

    /**
     * @param args the command line arguments
     */
   // private static Scanner x;
    public static void main(String args[])  {
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
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
      /* String Filepath="Record.txt";
       userlogin(name,pas,Filepath);*/
       //userlogin(user,pass,Filepath);
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userlogin().setVisible(true);
            }
        });
    }
    public static void userlogin(String user,String pass,String Filepath) {
       
   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Upass;
    private javax.swing.JTextField Uusername;
    private javax.swing.JLabel close1;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxShowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_Upassword;
    private javax.swing.JLabel lbl_Uusername;
    // End of variables declaration//GEN-END:variables
}
