/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import project_restaurant.view.*;
import project_restaurant.model.*;

/**
 *
 * @author fcama
 */
public class CustomerLoginController implements ActionListener, MouseListener{
    
    private LoginGUI loginGUI;
    private LoginDataPanel loginDataPanel;
    private LoginButtonsPanel loginButtonsPanel;
    
    
    public CustomerLoginController() {
        loginGUI = new LoginGUI();
        loginDataPanel = new LoginDataPanel();
        loginButtonsPanel = new LoginButtonsPanel();
        loginGUI.setLocationRelativeTo(null);
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
                break;
            case "Back":
                break;
        }
    }
    
    
    
    
    //metodos mouse listener
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
        new CustomerLoginController();
    }
    
}
