/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_restaurant.view;

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accessButtonsPanel1 = new project_restaurant.view.AccessButtonsPanel();
        accessButtonsPanel = new project_restaurant.view.AccessButtonsPanel();
        access_fondo_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        accessButtonsPanel.setOpaque(false);
        getContentPane().add(accessButtonsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, -1));

        access_fondo_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/access fondo.png"))); // NOI18N
        getContentPane().add(access_fondo_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(AccessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccessGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccessGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private project_restaurant.view.AccessButtonsPanel accessButtonsPanel;
    private project_restaurant.view.AccessButtonsPanel accessButtonsPanel1;
    private javax.swing.JLabel access_fondo_img;
    // End of variables declaration//GEN-END:variables
}
