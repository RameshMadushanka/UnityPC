package UnityPC;


import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Derushan
 */
public class ChangePassword extends javax.swing.JFrame {
    Connection conn=null;
    ResultSet rs = null;
    PreparedStatement pst =null;
    Statement st=null;
    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
        initComponents();
        
          try{
                   conn=DBconn.getConn();
                   st= conn.createStatement();
                  
        
        
    }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
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
        HomeButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernametext = new javax.swing.JTextField();
        ChangeButton = new javax.swing.JButton();
        newpasswordtext = new javax.swing.JPasswordField();
        confirmpasswordtext = new javax.swing.JPasswordField();
        passwordtext2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(3147, 2147));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeButton.setBackground(new java.awt.Color(0, 153, 153));
        HomeButton.setFont(new java.awt.Font("Android", 0, 24)); // NOI18N
        HomeButton.setText("Cancel/Home");
        HomeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(HomeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 170, 70));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 110));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Re-Enter New Password :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 270, 40));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter Current Password :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 270, 40));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Username:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 270, 40));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter New Password :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 270, 40));

        usernametext.setBackground(new java.awt.Color(255, 153, 51));
        usernametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametextActionPerformed(evt);
            }
        });
        jPanel1.add(usernametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 250, 40));

        ChangeButton.setBackground(new java.awt.Color(0, 153, 153));
        ChangeButton.setFont(new java.awt.Font("Android", 0, 24)); // NOI18N
        ChangeButton.setText("Change");
        ChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ChangeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 170, 70));

        newpasswordtext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        newpasswordtext.setForeground(new java.awt.Color(102, 102, 102));
        newpasswordtext.setBorder(null);
        newpasswordtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpasswordtextActionPerformed(evt);
            }
        });
        jPanel1.add(newpasswordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 250, 40));

        confirmpasswordtext.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        confirmpasswordtext.setBorder(null);
        confirmpasswordtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasswordtextActionPerformed(evt);
            }
        });
        jPanel1.add(confirmpasswordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 250, 40));

        passwordtext2.setBackground(new java.awt.Color(255, 153, 51));
        passwordtext2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        passwordtext2.setForeground(new java.awt.Color(255, 255, 255));
        passwordtext2.setBorder(null);
        passwordtext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtext2ActionPerformed(evt);
            }
        });
        jPanel1.add(passwordtext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 250, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordtext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtext2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtext2ActionPerformed

    private void confirmpasswordtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasswordtextActionPerformed
        // TODO add your handling code here:
         String password = passwordtext2.getText();
        String username = usernametext.getText();
        String newpassword = newpasswordtext.getText();
        String confirmpassword = confirmpasswordtext.getText();

        try{
            String sql ="select * from user_details where password='"+password+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            rs.next();
            String pass=rs.getString(3);
            
           if(pass.equals(password) && !pass.equals("") ) 
           {
            if( newpassword.equals(confirmpassword) && !newpassword.equals("") &&  !confirmpassword.equals(""))
            {
                 st.executeUpdate("update user_details set Password='"+newpassword+"' where User_Name='"+rs.getString(2) +"'");
                 JOptionPane.showMessageDialog(null,"password successfully changed");
                 close();
                 Login h= new Login();
                 h.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"doesnot match with password");
                
            }
           }
           else
           {
               JOptionPane.showMessageDialog(null,"invalid password");
                
           }
        }
        catch(SQLException e)
            {
                System.err.println(e);
            }
    }//GEN-LAST:event_confirmpasswordtextActionPerformed

    private void newpasswordtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpasswordtextActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_newpasswordtextActionPerformed

    private void ChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeButtonActionPerformed
        // TODO add your handling code here
        
        String password = passwordtext2.getText();
        String username = usernametext.getText();
        String newpassword = newpasswordtext.getText();
        String confirmpassword = confirmpasswordtext.getText();

        try{
            String sql ="select * from user_details where password='"+password+"'";
            pst = conn.prepareStatement(sql);
            rs=pst.executeQuery();
            rs.next();
            String pass=rs.getString(3);
            
           if(pass.equals(password) && !password.equals("") ) 
           {
            if( newpassword.equals(confirmpassword) && !newpassword.equals("") &&  !confirmpassword.equals(""))
            {
                 st.executeUpdate("update user_details set Password='"+newpassword+"' where User_Name='"+rs.getString(2) +"'");
                 JOptionPane.showMessageDialog(null,"password successfully changed");
                 close();
                 Login h= new Login();
                 h.setVisible(true);
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"doesnot match with password");
                
            }
           }
           else
           {
               JOptionPane.showMessageDialog(null,"invalid password");
                
           }
        }
        catch(SQLException e)
            {
                System.err.println(e);
            }
        
           
       
            
            
        
    }//GEN-LAST:event_ChangeButtonActionPerformed

    private void usernametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametextActionPerformed

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeButtonActionPerformed
        // TODO add your handling code here:
        close();
        homeWin h= new homeWin();
        h.setVisible(true);

    }//GEN-LAST:event_HomeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeButton;
    private javax.swing.JButton HomeButton;
    private javax.swing.JPasswordField confirmpasswordtext;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newpasswordtext;
    private javax.swing.JPasswordField passwordtext2;
    private javax.swing.JTextField usernametext;
    // End of variables declaration//GEN-END:variables
private void close(){
    WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
}
}
