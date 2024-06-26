package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.menu.*;
import project_restaurant.view.*;
import project_restaurant.model.*;

public class HomepageController implements ActionListener {

    private AccessGUI accessGUI;
    private AccessButtonsPanel accessButtonsPanel;
    private RegisterGUI registerGUI;
    private LoginGUI loginGUI;
    private CustomerLoginController customerLoginController;
    private CustomerRegisterController customerRegisterController;

    public HomepageController() {
        accessGUI = new AccessGUI();
        accessButtonsPanel = accessGUI.getAccessButtonsPanel();
        accessButtonsPanel.listen(this);
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
                customerLoginController = new CustomerLoginController();
                loginGUI = customerLoginController.getLoginGUI();
                System.out.println("Sign-In");
                loginGUI.setLocationRelativeTo(null);
                loginGUI.setVisible(true);
//                accessGUI.dispose();
                break;
            case "Sign-Up":
                customerRegisterController = new CustomerRegisterController();
                registerGUI = customerRegisterController.getRegisterGUI();
                System.out.println("Sign-Up");
                registerGUI.setLocationRelativeTo(null);
                registerGUI.setVisible(true);
//                accessGUI.dispose();
                break;
        }

    }

    public static void main(String[] args) {
        new HomepageController();
    }

}
