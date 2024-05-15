
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import project_restaurant.view.menu.*;
import project_restaurant.view.*;
import project_restaurant.model.*;

public class PurchaseOrderController implements ActionListener{

   OrderGUI orderGUI;
   NavMenuPanel navMenuPanel;
   OrderButtonsPanel orderButtonsPanel;
   
    public PurchaseOrderController() {
    this.orderGUI = new OrderGUI();
    navMenuPanel = orderGUI.getNavMenuPanel();
    orderButtonsPanel = orderGUI.getOrderButtonsPanel();
    orderGUI.setVisible(true);
    navMenuPanel.listen(this);
    orderButtonsPanel.listen(this);
    
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Buy":    
             JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
             orderGUI.dispose();
                break;
                case "Akari":
                System.out.println("Funciona AKARI");
                orderGUI.dispose();
                break;
                case "X":
                System.out.println("Funciona X");
                System.exit(0);
                break;
    }
  
    }
    
}
