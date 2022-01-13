/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mashovproclient;

import java.awt.event.KeyEvent;
import java.sql.*;


/**
 *
 * @author R.I.O
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginSign = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ConnnectBTN = new javax.swing.JButton();
        UserNameSign = new javax.swing.JLabel();
        PassWordSign = new javax.swing.JLabel();
        UserNameField = new javax.swing.JTextField();
        PassWordField = new javax.swing.JPasswordField();
        CloseLAB = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginSign.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        LoginSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginSign.setText("L o g i n");
        getContentPane().add(LoginSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 180, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" - Sign up - ");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 80, 20));

        ConnnectBTN.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ConnnectBTN.setText("Connect");
        ConnnectBTN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(ConnnectBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 320, 40));

        UserNameSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserNameSign.setIcon(new javax.swing.ImageIcon("C:\\Users\\R.I.O\\Downloads\\login (1).png")); // NOI18N
        getContentPane().add(UserNameSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 40, 50));

        PassWordSign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassWordSign.setIcon(new javax.swing.ImageIcon("C:\\Users\\R.I.O\\Downloads\\key (1).png")); // NOI18N
        getContentPane().add(PassWordSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 40, 50));

        UserNameField.setBackground(java.awt.Color.white);
        UserNameField.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        UserNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        UserNameField.setText("MyName");
        UserNameField.setNextFocusableComponent(PassWordField);
        UserNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserNameFieldKeyReleased(evt);
            }
        });
        getContentPane().add(UserNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 280, 50));

        PassWordField.setBackground(java.awt.Color.white);
        PassWordField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        PassWordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PassWordField.setText("dfdfd");
        getContentPane().add(PassWordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 280, 50));

        CloseLAB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CloseLAB.setIcon(new javax.swing.ImageIcon("C:\\Users\\R.I.O\\Downloads\\cross (2).png")); // NOI18N
        CloseLAB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseLABMouseClicked(evt);
            }
        });
        getContentPane().add(CloseLAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 50, 40));

        BackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackGround.setIcon(new javax.swing.ImageIcon("C:\\Users\\R.I.O\\Downloads\\Office communication.gif")); // NOI18N
        BackGround.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BackGround.setName(""); // NOI18N
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void addNewuser(String x, String y ) {
        
        try {
            // connect to the database
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=MashovProDB");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Temp.dbo.Data(localDate, relativeDate) VALUES (?, ?);");

            stmt.setString(1, x);
            stmt.setString(2, y);

            stmt.executeUpdate();
            conn.close();

        } catch (Exception e) {
            System.err.println(e);
        }
    }
    private void CloseLABMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseLABMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_CloseLABMouseClicked

    private void UserNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameFieldKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            PassWordField.requestFocus();
    }//GEN-LAST:event_UserNameFieldKeyReleased

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel CloseLAB;
    private javax.swing.JButton ConnnectBTN;
    private javax.swing.JLabel LoginSign;
    private javax.swing.JPasswordField PassWordField;
    private javax.swing.JLabel PassWordSign;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JLabel UserNameSign;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
