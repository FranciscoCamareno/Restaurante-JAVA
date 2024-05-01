/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_restaurant.model;
import java.util.ArrayList;

/**
 *
 * @author valer
 */
public class FoodArray {
    
    private ArrayList<Food> foodArray;

    public FoodArray() {
        foodArray = new ArrayList();
    }

    public String addFood(Food food) {
        if (foodArray.add(food)) {
            return "Comida agregada exitosamente";
        }
        return "Error al registrar la comida";
    }

    public String removeFood(Food food) {
        if (foodArray.remove(food)) {
            return "La comida fue eliminada exitosamente";
        }
        return "Error al eliminar la comida";
    }

    public Food findFood(String idNumber) {
        for (int i = 0; i < foodArray.size(); i++) {
            if (foodArray.get(i).getIdNumber().equalsIgnoreCase(idNumber));
            return foodArray.get(i);
        }
        return null;
    }

    @Override
    public String toString() {

        String foods = "Las comidas agregadas al pedido son las siguientes: \n";

        for (int iFoods = 0; iFoods < foodArray.size(); iFoods++) {
            foods += foodArray.get(iFoods);
        }

        return foods;
    }

}
