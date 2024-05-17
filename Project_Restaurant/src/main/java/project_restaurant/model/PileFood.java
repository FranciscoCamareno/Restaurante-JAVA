/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;

import project_restaurant.view.menu.OrderTable;

public class PileFood {

    private int length;
    private NodeFood top;

    public PileFood() {
        length = 0;
        top = null;
    }
    
     public void cleanList() {
        length = 0;
        top = null;
    }
    
    public String[][] getMatrizPileFood(){
    String[][] matrixMeals = new String[length][Food.FOOD_LABELS.length];
    NodeFood nodeFood = top;
    for (int i = 0; i < length; i++) {
        for (int j = 0; j < Food.FOOD_LABELS.length; j++) {                       
            matrixMeals[i][j] = nodeFood.getFood(j);
        }
        nodeFood = nodeFood.getNext();
    }
    return matrixMeals;
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

//    public void addRowsToTableModel(OrderTable orderTable) {
//        NodeFood currentNode = top;
//        Object[][] rows = new Object[length][2]; // Creamos un arreglo bidimensional para almacenar todas las filas
//
//        int index = 0;
//        while (currentNode != null) {
//            rows[index][0] = currentNode.getData().getName();
//            rows[index][1] = currentNode.getData().getPrice();
//            index++;
//            currentNode = currentNode.getNext();
//        }
//
//        orderTable.setDataTable(rows); // Pasamos el arreglo bidimensional al método setDataTable
//    }

}
