
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.menu.*;
import project_restaurant.view.*;
import project_restaurant.model.*;

public class PurchaseOrderController implements ActionListener{

    private OrderGUI orderGUI;
    private OrderTable orderTable;
    
    public PurchaseOrderController() {
    orderTable = orderGUI.getOrderTable1();
    
    }

    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Buy":    
                
                break;
    }
  
    }
    
}
