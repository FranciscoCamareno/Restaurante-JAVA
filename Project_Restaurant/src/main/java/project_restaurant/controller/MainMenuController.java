/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.menu.MainMenuButtons;
import project_restaurant.view.menu.MainMenuGUI;
import project_restaurant.view.menu.NavMenuPanel;

/**
 *
 * @author valer
 */
public class MainMenuController implements ActionListener {

    MainMenuGUI mainMenuGUI;
    MainMenuButtons mainMenuButtons;
    NavMenuPanel navMenuPanel;

    public MainMenuController() {

        mainMenuGUI = new MainMenuGUI();
        mainMenuButtons = mainMenuGUI.getMainMenuButtons();
        navMenuPanel = mainMenuGUI.getNavMenuPanel1();
        mainMenuButtons.listen(this);
        mainMenuGUI.setVisible(true);

    }

    public MainMenuGUI getMainMenuGUI() {
        return mainMenuGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "Appetizers":
                System.out.println("Funciona Appetizers");
                break;
            case "MainCourse":
                System.out.println("Funciona MainCourse");
                break;
            case "Desserts":
                System.out.println("Funciona Desserts");
                break;
            case "Drinks":
                System.out.println("Funciona Drinks");
                break;

        }
    }

    public static void main(String[] args) {
        new MainMenuController();
    }
}
