/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;

/**
 *
 * @author eveba
 */
public class NodeFood {

    private Food data;
    private NodeFood next;

    public NodeFood(Food data) {
        this.data = data;
    }

    public Food getData() {
        return data;
    }

    public void setData(Food data) {
        this.data = data;
    }

    public NodeFood getNext() {
        return next;
    }

    public void setNext(NodeFood next) {
        this.next = next;
    }

}
