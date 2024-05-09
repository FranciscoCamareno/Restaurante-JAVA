
package project_restaurant.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import project_restaurant.view.menu.*;
import project_restaurant.view.*;
import project_restaurant.model.*;


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
