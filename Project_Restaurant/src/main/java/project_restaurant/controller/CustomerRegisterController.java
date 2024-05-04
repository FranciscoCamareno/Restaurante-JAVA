/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import project_restaurant.view.*;
import project_restaurant.model.*;

/**
 *
 * @author fcama
 */
public class CustomerRegisterController implements ActionListener, MouseListener{
    private RegisterGUI registerGUI;
    private RegisterDataPanel registerDataPanel;
    private RegisterButtonsPanel registerButtonsPanel;
    private Customer customer;
    private CustomerArray customerArray;
    private CustomerJSON customerJSON;
    private static int numero = 1;
    
    public CustomerRegisterController() {
        registerGUI = new RegisterGUI();
        registerDataPanel = new RegisterDataPanel();
        registerButtonsPanel = new RegisterButtonsPanel();
        customerArray = new CustomerArray();
        registerButtonsPanel.listen(this);
        registerDataPanel.listen(this);
        registerGUI.listen(this);
        registerGUI.setLocationRelativeTo(null);
        registerGUI.setVisible(true);
    }
    
    //metodo action listener
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Sign-Up":
                String idNumber = String.valueOf(generarNumero());
                String userName = registerDataPanel.getTxtUserNameRegister();
                String eMail = registerDataPanel.getTxtEmail();
                String password = registerDataPanel.getTxtPasswordRegister();
                
                customer = new Customer(idNumber, userName, password, eMail);
//                customerJSON = new CustomerJSON();
//                customerJSON.addCustomerJSON(customer);
                customerArray.add(customer);
                System.out.println("El cliente fue registrado con éxito");
                break;
            case "Back":
                break;
        }
    }
    
    

    public static int generarNumero() {
        return numero++;
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
