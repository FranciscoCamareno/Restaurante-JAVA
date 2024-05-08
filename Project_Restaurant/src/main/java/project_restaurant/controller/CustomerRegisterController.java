/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import project_restaurant.view.*;
import project_restaurant.model.*;

/**
 *
 * @author fcama
 */
public class CustomerRegisterController implements ActionListener, MouseListener {

    private RegisterGUI registerGUI;
    private RegisterDataPanel registerDataPanel;
    private RegisterButtonsPanel registerButtonsPanel;
    private Customer customer;
    private CustomerArray customerArray;
    private CustomerJSON customerJSON;

    public CustomerRegisterController() {
        registerGUI = new RegisterGUI();
        registerDataPanel = new RegisterDataPanel();
        registerButtonsPanel = new RegisterButtonsPanel();
        customerArray = new CustomerArray();
//        registerDataPanel.listen(this);
        registerButtonsPanel.listen(this);
        registerGUI.listen(this);
        registerGUI.setLocationRelativeTo(null);
        registerGUI.setVisible(true);
    }

    public RegisterGUI getRegisterGUI() {
        return registerGUI;
    }

    //metodo action listener
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Sign-Up":
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
                break;
        }
    }

    //metodo mouse listener
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        new CustomerRegisterController();
    }

}
