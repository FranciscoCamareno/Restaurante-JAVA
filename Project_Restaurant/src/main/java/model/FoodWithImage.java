package model;

import org.json.simple.JSONObject;

public class FoodWithImage {
private Food food;
    private String imagePath;

    public FoodWithImage(Food food, String imagePath) {
        this.food = food;
        this.imagePath = imagePath;
    }

    public Food getFood() {
        return food;
    }

    public String getImagePath() {
        return imagePath;
    }

    @SuppressWarnings("unchecked")
    public JSONObject toJson() {
        JSONObject jsonFoodWithImage = new JSONObject();
        jsonFoodWithImage.put("food", food.toJson());
        jsonFoodWithImage.put("imagePath", imagePath);
        return jsonFoodWithImage;
    }

    public static FoodWithImage fromJson(JSONObject jsonFoodWithImage) {
        JSONObject jsonFood = (JSONObject) jsonFoodWithImage.get("food");
        Food food = Food.fromJson(jsonFood);
        String imagePath = (String) jsonFoodWithImage.get("imagePath");
        return new FoodWithImage(food, imagePath);
    }
}
