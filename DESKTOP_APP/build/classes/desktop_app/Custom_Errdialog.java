package desktop_app;
import static desktop_app.Log_in.dia;
import java.awt.Color;

public class Custom_Errdialog extends javax.swing.JFrame {

    private String title, subtitle;
    private static final Custom_animations anim = new Custom_animations();

    /**
     * Creates new form Custom_Errdialog
     */
    public Custom_Errdialog() {
        setUndecorated(true);
        setBackground(new Color(0.0f, 0.0f, 0.0f, 0.0f));
        initComponents();
        setLocationRelativeTo(null); // Center the frame to screen
    }

    public void setDiaError(String newtitle, String newsubtitle) {
        this.title = newtitle;
        this.subtitle = newsubtitle;
        jLabel2.setText(this.title);
        jLabel3.setText(this.subtitle);
         anim.fadeIn(dia, 150, 50);
         dia.setVisible(true);
    }

    public static String formatText(String text) {
        // Insert newline after every 25 characters, but not in the middle of a word
        StringBuilder formattedText = new StringBuilder();
        int length = text.length();
        int index = 0;
        while (index < length) {
            int nextIndex = Math.min(index + 25, length);
            int spaceIndex = text.lastIndexOf(' ', nextIndex);
            if (spaceIndex == -1 || spaceIndex <= index) {
                // No space found within the next 25 characters, or space is at the beginning, so break the word
                formattedText.append(text, index, nextIndex);
                if (nextIndex < length) {
                    formattedText.append("<br>");
                }
                index = nextIndex;
            } else {
                // Insert newline before the last space found
                formattedText.append(text, index, spaceIndex);
                formattedText.append("<br>");
                index = spaceIndex + 1; // Skip the space
            }
        }
        return "<html>" + formattedText.toString() + "</html>";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        kButton1.setBorder(null);
        kButton1.setText("OK");
        kButton1.setFont(new java.awt.Font("Product Sans", 1, 14)); // NOI18N
        kButton1.setkAllowGradient(false);
        kButton1.setkBackGroundColor(new java.awt.Color(255, 51, 51));
        kButton1.setkHoverColor(new java.awt.Color(255, 102, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1);
        kButton1.setBounds(180, 210, 140, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Default Error");
        jPanel1.add(jLabel3);
        jLabel3.setFont(new java.awt.Font("Product Sans", 4, 15)); // NOI18N
        jLabel3.setBounds(110, 130, 270, 50);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Error Dialog");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 70, 190, 40);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop_app/assets/error_dia.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 320);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 315));

        pack();
    }// </editor-fold>

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Custom_Errdialog().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.k33ptoo.components.KButton kButton1;
    // End of variables declaration
}
