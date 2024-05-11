
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
    }

    public LoginGUI getLoginGUI() {
        return loginGUI;
    }
    
    
    //metodos action listener
    @Override
    public void actionPerformed(ActionEvent e) {
    switch(e.getActionCommand()){
            case "Log-in":                
                
               if(!loginDataPanel.getTxtUserNameLogin().equals("") && !loginDataPanel.getTxtPasswordLogin().equals("")){ //revisa si el campo está vacío                   
                   if(customerArray.findPassword(customerArray.find(loginDataPanel.getTxtUserNameLogin()), loginDataPanel.getTxtPasswordLogin())){  //Revisa si la contraseña y el usuario son correctos                 
                   mainMenuController = new MainMenuController();  //Inicializa el menú  
                   loginGUI.dispose();
               }else{
                   loginGUI.Message("El usuario y la contraseña no coinciden"); //Si la información del usuario no coincide manda este mensaje
               }                      
               }else{
                   loginGUI.Message("No puede dejar ningún de los dos campos de texto vacíos ");  //Si se deja algún campo vacío pone este mensaje                                                                 
               }                                  
                break;
            case "Back":
                System.exit(0); //Sale deñ programa
                break;
        }
    }    
    
    public static void main(String[] args) {
        new CustomerLoginController();
    }
    
}
