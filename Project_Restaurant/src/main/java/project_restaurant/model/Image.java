/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author valer
 */
public class Image {

    private int x;
    private int y;
    private ImageIcon icon;

    public Image() {
    }

    public Image(int x, int y, ImageIcon icon) {
        this.x = x;
        this.y = y;
        this.icon = icon;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public void show(Graphics g/*le entra por parametro un obj grafico*/) {
        //icon = new ImageIcon("./src/main/resources/img/edamame.png");
        icon.paintIcon(null, g, 23, 106);
    }

}
