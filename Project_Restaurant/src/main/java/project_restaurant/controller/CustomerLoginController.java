
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.*;
import project_restaurant.model.*;

public class CustomerLoginController implements ActionListener{
    
    private LoginGUI loginGUI;
    private LoginDataPanel loginDataPanel;
    private LoginButtonsPanel loginButtonsPanel;
    
    
    public CustomerLoginController() {
        loginGUI = new LoginGUI();
        loginDataPanel = new LoginDataPanel();
        loginButtonsPanel = new LoginButtonsPanel();
        loginGUI.setLocationRelativeTo(null);
        loginGUI.setVisible(true);
    }

    public LoginGUI getLoginGUI() {
        return loginGUI;
    }
    
    
    //metodos action listener
    @Override
    public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()){
            case "Log-in":
                break;
            case "Back":
                break;
        }
    }
    
    
    public static void main(String[] args) {
        new CustomerLoginController();
    }
    
}
