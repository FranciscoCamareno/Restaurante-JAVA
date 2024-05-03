/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.json.simple.parser.ParseException;

/**
 *
 * @author valer
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FoodArray {

    private List<FoodWithImage> foodArray;

    public FoodArray() {
        foodArray = new ArrayList<>();
    }

    public String addFood(FoodWithImage foodWithImage) {
        if (foodArray.add(foodWithImage)) {
            return "Comida agregada exitosamente";
        }
        return "Error al registrar la comida";
    }

    public String removeFood(FoodWithImage foodWithImage) {
        if (foodArray.remove(foodWithImage)) {
            return "La comida fue eliminada exitosamente";
        }
        return "Error al eliminar la comida";
    }

    public FoodWithImage findFood(String idNumber) {
        for (FoodWithImage foodWithImage : foodArray) {
            if (foodWithImage.getFood().getIdNumber().equalsIgnoreCase(idNumber)) {
                return foodWithImage;
            }
        }
        return null;
    }

    public void saveFoodToFile(String fileName) {
        try {
            JsonManagerFood.saveToFile(fileName, foodArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadFoodFromFile(String fileName) {
        try {
            foodArray = JsonManagerFood.loadWithImagesFromFile(fileName);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        String foods = "Las comidas agregadas al pedido son las siguientes: \n";
        for (FoodWithImage foodWithImage : foodArray) {
            foods += foodWithImage.getFood().toString() + "\n";
        }
        return foods;
    }
}
