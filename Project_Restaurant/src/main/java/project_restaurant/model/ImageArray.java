/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author valer
 */
public class ImageArray {

    private ArrayList<Image> imageArray;

    public ImageArray() {
        imageArray = new ArrayList();
    }

    public void fillArray() {

        imageArray.add(new Image(0, 0, new ImageIcon("./src/main/resources/img/agedashi-tofu.png")));
        imageArray.add(new Image(0, 0, new ImageIcon("./src/main/resources/img/karaage.png")));
        imageArray.add(new Image(0, 0, new ImageIcon("./src/main/resources/img/matcha parfait.png")));
    }

    public int getImageArraySize() {
        int imageArraySize = 0;

        imageArraySize = imageArray.size();

        return imageArraySize;
    }
    
    public Image get(int posicion){
        return imageArray.get(posicion);
    }

}
