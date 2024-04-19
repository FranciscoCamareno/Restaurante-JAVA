/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project_restaurant.view;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author fcama
 */
public class LoginDataPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginDataPanel
     */
    public LoginDataPanel() {
        initComponents();
    }
    
    //METODOS SET Y GET
    public JPasswordField getTxtPasswordLogin() {
        return txtPasswordLogin;
    }

    public void setTxtPasswordLogin(JPasswordField txtPasswordLogin) {
        this.txtPasswordLogin = txtPasswordLogin;
    }

    public String getTxtUserNameLogin() {
        return txtUserNameLogin.getText();
    }

    public void setTxtUserNameLogin(String txtUserNameLogin) {
        this.txtUserNameLogin.setText(txtUserNameLogin);
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
        jLabel2 = new javax.swing.JLabel();
        txtUserNameLogin = new javax.swing.JTextField();
        barra_username_img = new javax.swing.JLabel();
        txtPasswordLogin = new javax.swing.JPasswordField();
        barra_password_img = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 114, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 92, 30));

        txtUserNameLogin.setBackground(new java.awt.Color(245, 245, 245));
        txtUserNameLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUserNameLogin.setForeground(new java.awt.Color(43, 43, 43));
        txtUserNameLogin.setBorder(null);
        add(txtUserNameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, 40));

        barra_username_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barra1-5px.png"))); // NOI18N
        add(barra_username_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 60, -1, -1));

        txtPasswordLogin.setBackground(new java.awt.Color(245, 245, 245));
        txtPasswordLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPasswordLogin.setForeground(new java.awt.Color(43, 43, 43));
        txtPasswordLogin.setBorder(null);
        add(txtPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 350, 40));

        barra_password_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barra1-5px.png"))); // NOI18N
        add(barra_password_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra_password_img;
    private javax.swing.JLabel barra_username_img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtPasswordLogin;
    private javax.swing.JTextField txtUserNameLogin;
    // End of variables declaration//GEN-END:variables
}
