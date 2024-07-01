/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package desktop_app;

import com.formdev.flatlaf.FlatLightLaf;
import desktop_app.Custom_font;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author agustin
 */
public class Log_in extends javax.swing.JFrame {

    

    /**
     * Creates new form Log_in
     */
    public Log_in() {
       
        setUndecorated(true);
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        initComponents();
        setLocationRelativeTo(null); //Center the frame to screen

applyCustomFont();
    }
    
private void applyCustomFont() {
     Font customFont = Custom_font.getFont("Bold.ttf", 30);
     Title.setFont(customFont);    
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        close_btn = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        mid_panel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        pup_icon = new javax.swing.JLabel();
        footer = new javax.swing.JLabel();
        sign_in_btn = new com.k33ptoo.components.KButton();
        pass_view = new javax.swing.JLabel();
        Pw_secured_field = new javax.swing.JPasswordField();
        Schl_ID_field = new javax.swing.JTextField();
        subtitle1 = new javax.swing.JLabel();
        input_design = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        mid_design = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrator Access");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setLocationByPlatform(true);
        setModalExclusionType(null);
        setUndecorated(true);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setOpaque(false);
        main_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close_btn.setBorder(null);
        close_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/close.png"))); // NOI18N
        close_btn.setToolTipText("close");
        close_btn.setAlignmentY(0.0F);
        close_btn.setBorderPainted(false);
        close_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        close_btn.setkAllowGradient(false);
        close_btn.setkBackGroundColor(new java.awt.Color(255, 255, 255));
        close_btn.setkHoverColor(new java.awt.Color(153, 153, 153));
        close_btn.setkPressedColor(new java.awt.Color(255, 51, 0));
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });
        main_panel.add(close_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 40, 20, 20));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.setOpaque(false);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        main_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 970, 40));

        mid_panel.setBackground(new java.awt.Color(255, 255, 255));
        mid_panel.setOpaque(false);
        mid_panel.setLayout(null);

        Title.setFont(new java.awt.Font("Product Sans", 1, 30)); // NOI18N
        Title.setForeground(new java.awt.Color(3, 9, 11));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Admin Access");
        mid_panel.add(Title);
        Title.setBounds(180, 150, 200, 37);

        pup_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pup_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/pup_50x50.png.png"))); // NOI18N
        mid_panel.add(pup_icon);
        pup_icon.setBounds(260, 90, 50, 58);

        footer.setBackground(new java.awt.Color(102, 102, 102));
        footer.setFont(new java.awt.Font("Product Sans", 1, 10)); // NOI18N
        footer.setForeground(new java.awt.Color(204, 204, 204));
        footer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        footer.setText("Polytechnic University of the Philippines - San Juan Campus");
        footer.setToolTipText("");
        mid_panel.add(footer);
        footer.setBounds(80, 430, 410, 20);

        sign_in_btn.setBackground(new java.awt.Color(255, 255, 255));
        sign_in_btn.setBorder(null);
        sign_in_btn.setText("Sign In");
        sign_in_btn.setBorderPainted(false);
        sign_in_btn.setContentAreaFilled(false);
        sign_in_btn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        sign_in_btn.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        sign_in_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sign_in_btn.setkAllowGradient(false);
        sign_in_btn.setkBackGroundColor(new java.awt.Color(17, 149, 230));
        sign_in_btn.setkHoverColor(new java.awt.Color(204, 204, 255));
        sign_in_btn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        sign_in_btn.setOpaque(true);
        sign_in_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sign_in_btnMouseEntered(evt);
            }
        });
        sign_in_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_in_btnActionPerformed(evt);
            }
        });
        mid_panel.add(sign_in_btn);
        sign_in_btn.setBounds(140, 370, 290, 40);

        pass_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/eye.png"))); // NOI18N
        pass_view.setToolTipText("show");
        pass_view.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pass_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pass_viewMouseClicked(evt);
            }
        });
        mid_panel.add(pass_view);
        pass_view.setBounds(400, 320, 20, 20);

        Pw_secured_field.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        Pw_secured_field.setForeground(new java.awt.Color(204, 204, 204));
        Pw_secured_field.setText("Your password");
        Pw_secured_field.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Pw_secured_field.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Pw_secured_field.setEchoChar('\u0000');
        Pw_secured_field.setOpaque(true);
        Pw_secured_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pw_secured_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pw_secured_fieldFocusLost(evt);
            }
        });
        Pw_secured_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pw_secured_fieldActionPerformed(evt);
            }
        });
        Pw_secured_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Pw_secured_fieldKeyTyped(evt);
            }
        });
        mid_panel.add(Pw_secured_field);
        Pw_secured_field.setBounds(180, 320, 210, 20);

        Schl_ID_field.setBackground(new java.awt.Color(255, 255, 255));
        Schl_ID_field.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        Schl_ID_field.setForeground(new java.awt.Color(204, 204, 204));
        Schl_ID_field.setText("Your school id number");
        Schl_ID_field.setBorder(null);
        Schl_ID_field.setNextFocusableComponent(Pw_secured_field);
        Schl_ID_field.setOpaque(true);
        Schl_ID_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Schl_ID_fieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Schl_ID_fieldFocusLost(evt);
            }
        });
        Schl_ID_field.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Schl_ID_fieldMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Schl_ID_fieldMouseExited(evt);
            }
        });
        Schl_ID_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Schl_ID_fieldActionPerformed(evt);
            }
        });
        mid_panel.add(Schl_ID_field);
        Schl_ID_field.setBounds(180, 250, 240, 20);

        subtitle1.setBackground(new java.awt.Color(255, 255, 255));
        subtitle1.setFont(new java.awt.Font("Product Sans", 0, 11)); // NOI18N
        subtitle1.setForeground(new java.awt.Color(17, 149, 230));
        subtitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle1.setText("Forgot password");
        subtitle1.setToolTipText("");
        subtitle1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtitle1.setOpaque(true);
        subtitle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtitle1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subtitle1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subtitle1MouseExited(evt);
            }
        });
        mid_panel.add(subtitle1);
        subtitle1.setBounds(332, 287, 110, 20);

        input_design.setBackground(new java.awt.Color(255, 255, 255));
        input_design.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        input_design.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/Labels.png"))); // NOI18N
        input_design.setOpaque(true);
        mid_panel.add(input_design);
        input_design.setBounds(100, 180, 370, 210);

        subtitle.setBackground(new java.awt.Color(102, 102, 102));
        subtitle.setFont(new java.awt.Font("Product Sans", 1, 13)); // NOI18N
        subtitle.setForeground(new java.awt.Color(153, 153, 153));
        subtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitle.setText("Welcome back! Please enter you details.");
        subtitle.setToolTipText("");
        mid_panel.add(subtitle);
        subtitle.setBounds(140, 180, 290, 20);

        mid_design.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/mid_panel.png"))); // NOI18N
        mid_panel.add(mid_design);
        mid_design.setBounds(30, 40, 520, 448);

        main_panel.add(mid_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 560, 540));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/main_design.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        main_panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main_panel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1000, 540));

        getContentPane().add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void sign_in_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_in_btnActionPerformed
        System.out.println("Username: " + Schl_ID_field.getText());
        System.out.println("Password: " + Pw_secured_field.getText());
        admin_check();
    }//GEN-LAST:event_sign_in_btnActionPerformed

    private void Schl_ID_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Schl_ID_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Schl_ID_fieldActionPerformed

    private void Schl_ID_fieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schl_ID_fieldMouseClicked

    }//GEN-LAST:event_Schl_ID_fieldMouseClicked

    private void Schl_ID_fieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Schl_ID_fieldMouseExited

    }//GEN-LAST:event_Schl_ID_fieldMouseExited

    private void Schl_ID_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Schl_ID_fieldFocusGained
        if (Schl_ID_field.getText().equals("Your school id number")) {
            Schl_ID_field.setText("");
            Schl_ID_field.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_Schl_ID_fieldFocusGained

    private void Schl_ID_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Schl_ID_fieldFocusLost
        if (Schl_ID_field.getText().isEmpty()) {
            Schl_ID_field.setText("Your school id number");
            Schl_ID_field.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_Schl_ID_fieldFocusLost

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        Custom_animations.fadeOut(logInFrame, 150, 50);
        dispose(); // Close the frame
        System.exit(0);
    }//GEN-LAST:event_close_btnActionPerformed

    private void Pw_secured_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Pw_secured_fieldKeyTyped
        if (Pw_secured_field.getText().equals("Your password")) {
            Pw_secured_field.setText("");
            Pw_secured_field.setForeground(Color.BLACK); // Set text color to black when the user starts typing
        }
    }//GEN-LAST:event_Pw_secured_fieldKeyTyped

    private void Pw_secured_fieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pw_secured_fieldFocusLost
        if (Pw_secured_field.getPassword().length == 0) {
            Pw_secured_field.setText("Your password");
            Pw_secured_field.setForeground(Color.GRAY); // Optional: Set text color to gray when placeholder text is restored
            togglePasswordVisibility(); // Hide the password when focus is lost
        }

    }//GEN-LAST:event_Pw_secured_fieldFocusLost

    private void Pw_secured_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pw_secured_fieldFocusGained
        if (Pw_secured_field.getText().equals("Your password")) {
            Pw_secured_field.setText(null);
            Pw_secured_field.setEchoChar('*');
            Pw_secured_field.setForeground(Color.BLACK); // Optional: Set text color to black when focused
            // togglePasswordVisibility(); // Show the password when focused
        }
    }//GEN-LAST:event_Pw_secured_fieldFocusGained

    private void Pw_secured_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pw_secured_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pw_secured_fieldActionPerformed

    private void subtitle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle1MouseEntered
        subtitle1.setForeground(new Color(164, 186, 189));

    }//GEN-LAST:event_subtitle1MouseEntered

    private void subtitle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle1MouseExited
        subtitle1.setForeground(new Color(17, 149, 230));

    }//GEN-LAST:event_subtitle1MouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        posX = evt.getX();
        posY = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        setLocation(evt.getXOnScreen() - posX, evt.getYOnScreen() - posY);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void pass_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pass_viewMouseClicked
        togglePasswordVisibility();
    }//GEN-LAST:event_pass_viewMouseClicked

    private void subtitle1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtitle1MouseClicked
        Custom_animations.fadeIn(forgot, 150, 50);
        forgot.setVisible(true);
    }//GEN-LAST:event_subtitle1MouseClicked

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered

    }//GEN-LAST:event_formMouseEntered

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        Log_in fr1 = new Log_in();
        Forgot_pwrd fr2 = new Forgot_pwrd();
        fr1.setOpacity(0.5f);
        fr2.setOpacity(1.0f);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        Log_in fr1 = new Log_in();
        fr1.setOpacity(1.0f);
    }//GEN-LAST:event_formFocusLost

    private void sign_in_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sign_in_btnMouseEntered

    }//GEN-LAST:event_sign_in_btnMouseEntered

    //custom functions
    private void togglePasswordVisibility() {
        if (isPasswordVisible) {
            Pw_secured_field.setEchoChar('\u2022'); // Echo character for hiding password
            pass_view.setIcon(new ImageIcon(getClass().getResource("/desktop_app/assets/eye.png")));
            pass_view.setToolTipText("show");
        } else {
            Pw_secured_field.setEchoChar((char) 0); // Echo character for showing password
            pass_view.setIcon(new ImageIcon(getClass().getResource("/desktop_app/assets/view.png")));
            pass_view.setToolTipText("hide");
        }
        isPasswordVisible = !isPasswordVisible; // Toggle the state
    }
// Create an instance of Custom_dialog

    public void admin_check() {
        PreparedStatement ps;
    ResultSet rs;

    String schoolId = Schl_ID_field.getText().trim();
    String password = new String(Pw_secured_field.getPassword()).trim();

    String query = "SELECT * FROM admin_data WHERE user_id = ? AND pass = ?";

    try {
        ps = Db_con.getConnection().prepareStatement(query);
        ps.setString(1, schoolId);
        ps.setString(2, password);  // Set the second parameter

        rs = ps.executeQuery();
        log_attempt++;
        System.out.print("Attempt[" + log_attempt + "]: ");

        // Check if the ResultSet contains any rows
        if (rs.next()) {
            // Retrieve the password from the ResultSet
            String storedPassword = rs.getString("pass");
            String storedUsername = rs.getString("user_id");

            // Check if the stored password matches the entered password (case-sensitive)
            if (password.equals(storedPassword) && schoolId.equals(storedUsername)) {
                
                System.out.println("Admin Access Granted\n");
                   Custom_animations.fadeIn(sec_year, 150, 50);
                    sec_year.setVisible(true);
                   
                
            } else {
                System.out.println("Admin Access Denied\n");
                 dia.setDiaError("Access Denied", "Credentials do not match, try again");
            }
        } else {
            // User does not exist
            System.out.println("User does not exist\n");
             dia.setDiaError("Access Denied", "User does not exist, try again");
        }

        // Close ResultSet, PreparedStatement, and Connection
        rs.close();
        ps.close();
    } catch (SQLException ex) {
        // Handle SQL exceptions
        ex.printStackTrace();
    }
    }     

    public ArrayList<String> data_fetch(String tableName, String columnName) {
        PreparedStatement ps;
        ResultSet rs;
        ArrayList<String> fetchedDataList = new ArrayList<>();

        String query = "SELECT " + columnName + " FROM " + tableName;

        try {
            ps = Db_con.getConnection().prepareStatement(query);

            rs = ps.executeQuery();

            // Iterate over the ResultSet to fetch each row
            while (rs.next()) {
                // Data exists
                String fetchedData = rs.getString(columnName);
                fetchedDataList.add(fetchedData);
            }

            // Close ResultSet, PreparedStatement, and Connection
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            // Handle SQL exceptions
            ex.printStackTrace();
        }

        return fetchedDataList;
    }

    /**
     * \
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
             FlatLightLaf.install();
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Flatlaf Light".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            System.out.println("Error: " + e);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                anim.fadeIn(logInFrame, 150, 50);
                logInFrame.setVisible(true);
                  
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pw_secured_field;
    private javax.swing.JTextField Schl_ID_field;
    private javax.swing.JLabel Title;
    private com.k33ptoo.components.KButton close_btn;
    private javax.swing.JLabel footer;
    private javax.swing.JLabel input_design;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel mid_design;
    private javax.swing.JPanel mid_panel;
    private javax.swing.JLabel pass_view;
    private javax.swing.JLabel pup_icon;
    private com.k33ptoo.components.KButton sign_in_btn;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel subtitle1;
    // End of variables declaration//GEN-END:variables

    //custom declarations
    int posX, posY;
    private boolean isEyeIcon = true;
    private boolean isPasswordVisible = false;
    public static Forgot_pwrd forgot = new Forgot_pwrd();
    public static Custom_animations anim = new Custom_animations();
    static Log_in logInFrame = new Log_in();
    static Custom_Errdialog dia = new Custom_Errdialog();
    static int log_attempt = 0;
    static Sec_year sec_year = new Sec_year();
    static admin_dashboard admin_dash = new admin_dashboard("", "");


}
