package model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eveba
 */
public class JsonManagerFood {
    
     public static void saveFoodWithImagesToFile(String fileName, List<FoodWithImage> foodList) {
        JSONArray jsonArray = new JSONArray();
        for (FoodWithImage foodWithImage : foodList) {
            JSONObject foodObject = new JSONObject();
            foodObject.put("idNumber", foodWithImage.getFood().getIdNumber());
            foodObject.put("name", foodWithImage.getFood().getName());
            foodObject.put("description", foodWithImage.getFood().getDescription());
            foodObject.put("price", foodWithImage.getFood().getPrice());
            foodObject.put("imagePath", foodWithImage.getImagePath());
            jsonArray.add(foodObject);
        }
        try (FileWriter file = new FileWriter(fileName)) {
            file.write(jsonArray.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<FoodWithImage> loadFoodWithImagesFromFile(String fileName) {
        JSONParser parser = new JSONParser();
        List<FoodWithImage> foodList = new ArrayList<>();
        try {
            JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(fileName));
            for (Object obj : jsonArray) {
                JSONObject foodObject = (JSONObject) obj;
                String idNumber = (String) foodObject.get("idNumber");
                String name = (String) foodObject.get("name");
                String description = (String) foodObject.get("description");
                double price = (Double) foodObject.get("price");
                String imagePath = (String) foodObject.get("imagePath");
                Food food = new Food(idNumber, name, description, price);
                foodList.add(new FoodWithImage(food, imagePath));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return foodList;
    }
}
