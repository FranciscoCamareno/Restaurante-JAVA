/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_restaurant.view;

import javax.swing.JOptionPane;
import project_restaurant.controller.HomepageController;

/**
 *
 * @author fcama
 */
public class AccessGUI extends javax.swing.JFrame {

    /**
     * Creates new form AccessGUI
     */
    public AccessGUI() {
        initComponents();
    }
    
    public AccessButtonsPanel getAccessButtonsPanel() {
        return accessButtonsPanel;
    }
    
    public void listen(HomepageController homepageController){
        
    }
    
   public void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accessButtonsPanel = new project_restaurant.view.AccessButtonsPanel();
        access_fondo_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accessButtonsPanel.setOpaque(false);
        getContentPane().add(accessButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, -1, -1));

        access_fondo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/access fondo.png"))); // NOI18N
        getContentPane().add(access_fondo_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_restaurant.view.AccessButtonsPanel accessButtonsPanel;
    private javax.swing.JLabel access_fondo_img;
    // End of variables declaration//GEN-END:variables
}
