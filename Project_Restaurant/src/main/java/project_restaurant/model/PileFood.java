/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;


public class PileFood {

    private int length;
    private NodeFood top;

    public PileFood() {
        length = 0;
        top = null;
    }

    public void push(Food food) {
        NodeFood nodeFood = new NodeFood(food);
        nodeFood.setNext(top);
        top = nodeFood;
        length++;
    }

    public void pop() {
        NodeFood nodeFood = top;
        top = nodeFood.getNext();
        length--;
    }

    public boolean isVoid() {
        return top == null;
    }

    public void emptyPile() {
        while (!isVoid()) {
            pop();
        }
    }

    public Food getTop() {
        return top.getData();
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        String data = "";
        NodeFood nodeFood = top;
        while (nodeFood != null) {
            data += "\n" + nodeFood.getData();
            nodeFood = nodeFood.getNext();
        }
        return data;
    }
}
