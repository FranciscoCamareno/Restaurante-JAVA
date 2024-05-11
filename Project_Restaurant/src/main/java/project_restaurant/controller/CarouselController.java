/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.controller;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author valer
 */
public class CarouselController extends Thread {

    MainMenuController mainMenuController;
    boolean carousel;

    int pos;

    public CarouselController(MainMenuController mainMenuController) {
        this.mainMenuController = mainMenuController;
        carousel = false;
        pos = 1;
    }

    public void run() {

        while (!carousel) {

            mainMenuController.startCarousel(pos);

            try {

                sleep(2000);
                if (pos == 0) {
                    pos = 1;

                } else {
                    if (pos == 1) {
                        pos = 2;
                    } else {
                        pos = 0;
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(CarouselController.class.getName()).log(Level.SEVERE, null, ex);
            }
            mainMenuController.update();
        }
    }

}
