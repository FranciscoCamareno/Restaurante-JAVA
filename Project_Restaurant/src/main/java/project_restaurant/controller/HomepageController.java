
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.menu.*;
import project_restaurant.view.*;
import project_restaurant.model.*;


public class HomepageController implements ActionListener {

    AccessGUI accessGUI;
    AccessButtonsPanel accessButtonsPanel;
    RegisterGUI registerGUI;
    LoginGUI loginGUI;
    CustomerLoginController customerLoginController;
    CustomerRegisterController customerRegisterController;
    

    public HomepageController() {

        accessGUI = new AccessGUI();
        accessButtonsPanel = accessGUI.getAccessButtonsPanel();
        accessButtonsPanel.listen(this);
        customerLoginController = new CustomerLoginController();
        loginGUI = customerLoginController.getLoginGUI();
        customerRegisterController = new CustomerRegisterController();
        registerGUI = customerRegisterController.getRegisterGUI();
        accessGUI.setLocationRelativeTo(null);
        accessGUI.setVisible(true);
        
    }

    public AccessGUI getAccessGUI() {
        return accessGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Sign-In":
                System.out.println("Sign-In");
                loginGUI.setLocationRelativeTo(null);
                loginGUI.setVisible(true);
                accessGUI.dispose();
                break;
            case "Sign-Up":
                System.out.println("Sign-Up");
                registerGUI.setLocationRelativeTo(null);
                registerGUI.setVisible(true);
                //accessGUI.dispose();
                //accessGUI.setVisible(false);
                break;
        }

    }

    public static void main(String[] args) {
        new HomepageController();
    }

    

}
