/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project_restaurant.view;

/**
 *
 * @author fcama
 */
public class RegisterButtonsPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterButtonsPanel
     */
    public RegisterButtonsPanel() {
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

        btnSignUpRegister = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        btnSignUpRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boton sign up registro.png"))); // NOI18N
        btnSignUpRegister.setActionCommand("Sign-Up");
        btnSignUpRegister.setBorderPainted(false);
        btnSignUpRegister.setContentAreaFilled(false);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back boton.png"))); // NOI18N
        btnBack.setActionCommand("Back");
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSignUpRegister)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSignUpRegister)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSignUpRegister;
    // End of variables declaration//GEN-END:variables
}
