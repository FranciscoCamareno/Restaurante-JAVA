package project_restaurant.controller;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.ImageIcon;
import project_restaurant.view.menu.*;
import project_restaurant.view.*;
import project_restaurant.model.*;

public class MainMenuController implements ActionListener {

    MainMenuGUI mainMenuGUI;
    MainMenuButtons mainMenuButtons;
    NavMenuPanel navMenuPanel;
    AppetizerMenuGUI appetizerMenuGUI;
    CourseMenuGUI courseMenuGUI;
    DessertsMenuGUI dessertsMenuGUI;
    DrinkMenuGUI drinkMenuGUI;
    Image image;
    ImageArray imageArray;
    CarouselController carouselController;
    OrderGUI orderGUI;

    public MainMenuController() {

        image = new Image();
        //image.setIcon(new ImageIcon("./src/main/resources/img/agedashi-tofu.png"));
        imageArray = new ImageArray();
        imageArray.fillArray();

        mainMenuGUI = new MainMenuGUI(this);
        mainMenuButtons = mainMenuGUI.getMainMenuButtons();
        navMenuPanel = mainMenuGUI.getNavMenuPanel1();
        mainMenuButtons.listen(this);
        navMenuPanel.listen(this);
        mainMenuGUI.setLocationRelativeTo(null);
        mainMenuGUI.setVisible(true);
        carouselController = new CarouselController(this);
        carouselController.start();

        appetizerMenuGUI = new AppetizerMenuGUI();
        navMenuPanel = appetizerMenuGUI.getNavMenuPanel();
        navMenuPanel.listen(this);
        
        courseMenuGUI = new CourseMenuGUI();
        navMenuPanel = courseMenuGUI.getNavMenuPanel();
        navMenuPanel.listen(this);
        
        dessertsMenuGUI = new DessertsMenuGUI();
        navMenuPanel = dessertsMenuGUI.getNavMenuPanel();
        navMenuPanel.listen(this);
        
        drinkMenuGUI = new DrinkMenuGUI();
        navMenuPanel = drinkMenuGUI.getNavMenuPanel();
        navMenuPanel.listen(this);
        
        orderGUI = new OrderGUI();
        navMenuPanel = orderGUI.getNavMenuPanel();
        navMenuPanel.listen(this);

    }

    public void draw(Graphics g) {
        image.show(g);
    }

    public void update() {
        mainMenuGUI.repaint();
    }

    public MainMenuGUI getMainMenuGUI() {
        return mainMenuGUI;
    }

    public void startCarousel(int posicion) {
        image = imageArray.get(posicion);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {

            case "Appetizers":
                System.out.println("Funciona Appetizers");
                appetizerMenuGUI.setLocationRelativeTo(null);
                appetizerMenuGUI.setVisible(true);
                mainMenuGUI.setVisible(false);
                break;
            case "MainCourse":
                System.out.println("Funciona MainCourse");
                courseMenuGUI.setLocationRelativeTo(null);
                courseMenuGUI.setVisible(true);
                mainMenuGUI.setVisible(false);
                break;
            case "Desserts":
                System.out.println("Funciona Desserts");
                dessertsMenuGUI.setLocationRelativeTo(null);
                dessertsMenuGUI.setVisible(true);
                mainMenuGUI.setVisible(false);
                break;
            case "Drinks":
                System.out.println("Funciona Drinks");
                drinkMenuGUI.setLocationRelativeTo(null);
                drinkMenuGUI.setVisible(true);
                mainMenuGUI.setVisible(false);
                break;
            case "Akari":
                System.out.println("Funciona AKARI");
                mainMenuGUI.setVisible(true);
                break;
            case "X":
                System.out.println("Funciona X");
                System.exit(0);
                break;
            case "Order":
                System.out.println("Funciona order");
                orderGUI.setLocationRelativeTo(null);
                orderGUI.setVisible(true);
                mainMenuGUI.setVisible(false);
                break;

        }
    }

    public static void main(String[] args) {
        new MainMenuController();
    }

}
