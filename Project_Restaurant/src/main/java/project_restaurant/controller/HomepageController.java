/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.AccessButtonsPanel;
import project_restaurant.view.AccessGUI;
import project_restaurant.view.LoginGUI;
import project_restaurant.view.RegisterGUI;

/**
 *
 * @author valer
 */
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
        accessGUI.setVisible(true);
        customerLoginController = new CustomerLoginController();
        loginGUI = customerLoginController.getLoginGUI();
        customerRegisterController = new CustomerRegisterController();
        registerGUI = customerRegisterController.getRegisterGUI();

    }

    public AccessGUI getAccessGUI() {
        return accessGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        switch (e.getActionCommand()) {
            case "Sign-In":
                System.out.println("Sign-In");
                loginGUI.setVisible(true);
                accessGUI.dispose();
                break;
            case "Sign-Up":
                System.out.println("Sign-Up");
                registerGUI.setVisible(true);
                accessGUI.dispose();
                break;
        }

    }

    public static void main(String[] args) {
        new HomepageController();
    }

}
