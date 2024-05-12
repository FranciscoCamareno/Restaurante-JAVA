package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.*;
import project_restaurant.model.*;

public class CustomerRegisterController implements ActionListener {

    private RegisterGUI registerGUI;
    private AccessGUI accessGUI;
    private AccessButtonsPanel accessButtonsPanel;
    private RegisterDataPanel registerDataPanel;
    private RegisterButtonsPanel registerButtonsPanel;
    private Customer customer;
    private CustomerArray customerArray;
    private HomepageController homepageController;

    public CustomerRegisterController() {
        registerGUI = new RegisterGUI();
        registerDataPanel = registerGUI.getRegisterDataPanel();
        registerButtonsPanel = registerGUI.getRegisterButtonsPanel();
        customerArray = new CustomerArray();
        registerButtonsPanel.listen(this);
        registerGUI.listen(this);
        //registerGUI.setVisible(true);
        registerGUI.setLocationRelativeTo(null);
    }

    public RegisterGUI getRegisterGUI() {
        return registerGUI;
    }

    //metodo action listener
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Sign-Up":
                System.out.println("prueba");
                String idNumber = "1";
                String userName = registerDataPanel.getTxtUserNameRegister(); // Obteniendo el texto del campo de nombre de usuario
                String eMail = registerDataPanel.getTxtEmail(); // Obteniendo el texto del campo de correo electrónico
                String password = registerDataPanel.getTxtPasswordRegister(); // Obteniendo el texto del campo de contraseña

                if (userName.isEmpty() || eMail.isEmpty() || password.isEmpty()) {
                    System.out.println("Por favor, rellene todos los campos antes de registrar.");
                } else {
                    customer = new Customer(idNumber, userName, password, eMail);
                    customerArray.add(customer);
                    System.out.println("El cliente fue registrado con éxito");
                }

                break;
            case "Back":
                System.out.println("back");
                accessGUI.setVisible(true);
                registerGUI.dispose();
                break;
        }
    }
    

    public static void main(String[] args) {
        new CustomerRegisterController();
    }

}
