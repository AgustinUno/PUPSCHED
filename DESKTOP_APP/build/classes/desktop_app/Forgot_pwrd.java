/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desktop_app;

import static desktop_app.Log_in.anim;
import static desktop_app.Log_in.dia;
import static desktop_app.Log_in.logInFrame;
import static desktop_app.Sec_ques.setSecQues;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

/**
 *
 * @author agustin
 */
public class Forgot_pwrd extends javax.swing.JFrame {

    /**
     * Creates new form forgot_pwrd
     */
    public Forgot_pwrd() {
        setUndecorated(true);
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        initComponents();
        setLocationRelativeTo(null); //Center the frame to screen
        applyCustomFont();
    }
    
     private void applyCustomFont() {

        jLabel3.setFont(Custom_font.getFont("Bold.ttf", 24));
        jLabel4.setFont(Custom_font.getFont("Regular.ttf", 12));
        jLabel2.setFont(Custom_font.getFont("Regular.ttf", 12));
       jTextField1.setFont(Custom_font.getFont("Regular.ttf", 12));
        kButton2.setFont(Custom_font.getFont("Bold.ttf", 14));
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
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        kButton2.setBorder(null);
        kButton2.setText("Proceed");
        kButton2.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        kButton2.setkAllowGradient(false);
        kButton2.setkBackGroundColor(new java.awt.Color(17, 149, 230));
        kButton2.setkHoverColor(new java.awt.Color(204, 204, 255));
        kButton2.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton2.setOpaque(true);
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton2);
        kButton2.setBounds(170, 320, 185, 40);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/back.png"))); // NOI18N
        jLabel6.setToolTipText("return to Log In");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel6KeyPressed(evt);
            }
        });
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 320, 38, 40);

        jLabel2.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("password reset instructions");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 160, 320, 15);

        jTextField1.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Enter your username");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(true);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(155, 243, 240, 20);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/user.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 210, 360, 70);

        jLabel4.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Enter your username to proceed with");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 150, 340, 10);

        jLabel3.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 149, 230));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Forgot Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 100, 190, 30);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/mid_panel_blue.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 520, 470);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 40, 440, 390);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        Log_in fr1 = new Log_in();
        Forgot_pwrd fr2 = new Forgot_pwrd();

        fr2.setOpacity(0.5f);
        fr1.setOpacity(1.0f);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        Forgot_pwrd fr2 = new Forgot_pwrd();
        fr2.setOpacity(1.0f);
    }//GEN-LAST:event_formFocusLost
    int attempt = 1;
    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
        
        Log_in fr = new Log_in();
        ArrayList<String> fetchedDataList = new ArrayList<>();
        fetchedDataList = fr.data_fetch("admin_data", "user_id");

        System.out.println("\nData: " + fetchedDataList);

        boolean userExists = false;
        for (String fetchedData : fetchedDataList) {
            if (jTextField1.getText().equals(fetchedData)) {
                userExists = true;
                break;
            }
        }
        System.out.printf("Attempt[%d]: ", attempt);
        attempt++;
        if (userExists) {
            System.out.println("User exists");
             anim.fadeIn(sec_ques, 150, 50);
             sec_ques.setVisible(true);
             sec_ques.username = jTextField1.getText();
             sec_change_user.username = jTextField1.getText();
             dispose();
             setSecQues();
            
        } else {
            System.out.println("Try another username");
            dia.setDiaError("Invalid User", "Username does not exists, try again");
           
        }

    }//GEN-LAST:event_kButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if (jTextField1.getText().equals("Enter your username")) {
            jTextField1.setText("");
            jTextField1.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().isEmpty()) {
            jTextField1.setText("Enter your username");
            jTextField1.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6KeyPressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         Custom_animations.fadeOut(frame, 150, 50);
        
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/back_hover.png"))); // NOI18N
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/back.png"))); // NOI18N
    }//GEN-LAST:event_jLabel6MouseExited

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
            java.util.logging.Logger.getLogger(Forgot_pwrd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forgot_pwrd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forgot_pwrd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forgot_pwrd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                Custom_animations.fadeIn(frame, 150, 50);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private com.k33ptoo.components.KButton kButton2;
    // End of variables declaration//GEN-END:variables
  static Forgot_pwrd frame = new Forgot_pwrd();
  static Sec_ques sec_ques = new Sec_ques();
    static Sec_change_user sec_change_user = new Sec_change_user();
  
}
