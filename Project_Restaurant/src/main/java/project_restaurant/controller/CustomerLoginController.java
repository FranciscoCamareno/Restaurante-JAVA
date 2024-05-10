
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.*;
import project_restaurant.model.*;

public class CustomerLoginController implements ActionListener{
    
    private LoginGUI loginGUI;
    private LoginDataPanel loginDataPanel;
    private LoginButtonsPanel loginButtonsPanel;
    private CustomerArray customerArray;
    private MainMenuController mainMenuController;
    
    public CustomerLoginController() {
        loginGUI = new LoginGUI();
        customerArray = new CustomerArray();        
        loginDataPanel=loginGUI.loginDataPanel();
        loginButtonsPanel = loginGUI.loginButtonsPanel();
        loginButtonsPanel.listen(this);
        loginGUI.setLocationRelativeTo(null);
        loginGUI.setVisible(true);
        
       // loginGUI.setVisible(true);
    }

    public LoginGUI getLoginGUI() {
        return loginGUI;
    }
    
    
    //metodos action listener
    @Override
    public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()){
            case "Log-in":                
                
               if(!loginDataPanel.getTxtUserNameLogin().equals("") && !loginDataPanel.getTxtPasswordLogin().equals("")){
                   
                   if(customerArray.findPassword(customerArray.find(loginDataPanel.getTxtUserNameLogin()), loginDataPanel.getTxtPasswordLogin())){                   
                   mainMenuController = new MainMenuController();   
                   loginGUI.dispose();
               }else{
                   loginGUI.Message("El usuario y la contraseña no coinciden");
               }                      
               }else{
                   loginGUI.Message("No puede dejar ningún de los dos campos de texto vacíos ");                                                                      
               }
               
                   
                break;
            case "Back":
                System.exit(0);
                break;
        }
    }
    
    
    public static void main(String[] args) {
        new CustomerLoginController();
    }
    
}
