/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project_restaurant.view.menu;

import javax.swing.JLabel;
import javax.swing.JSpinner;

/**
 *
 * @author fcama
 */
public class ObjectOrderDish extends javax.swing.JPanel {

    /**
     * Creates new form ObjectOrderDish
     */
    public ObjectOrderDish() {
        initComponents();
    }

    public JSpinner getJsAmount() {
        return jsAmount;
    }

    public void setJsAmount(JSpinner jsAmount) {
        this.jsAmount = jsAmount;
    }

    public JLabel getLblNameDish() {
        return lblNameDish;
    }

    public void setLblNameDish(JLabel lblNameDish) {
        this.lblNameDish = lblNameDish;
    }

    public JLabel getLblPriceDish() {
        return lblPriceDish;
    }

    public void setLblPriceDish(JLabel lblPriceDish) {
        this.lblPriceDish = lblPriceDish;
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameDish = new javax.swing.JLabel();
        lblPriceDish = new javax.swing.JLabel();
        jsAmount = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNameDish.setForeground(new java.awt.Color(51, 51, 51));
        lblNameDish.setText("Name");
        add(lblNameDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 150, -1));

        lblPriceDish.setForeground(new java.awt.Color(51, 51, 51));
        lblPriceDish.setText("Price");
        add(lblPriceDish, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 160, -1));

        jsAmount.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        add(jsAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/objeto platillo carrito.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSpinner jsAmount;
    private javax.swing.JLabel lblNameDish;
    private javax.swing.JLabel lblPriceDish;
    // End of variables declaration//GEN-END:variables
}
