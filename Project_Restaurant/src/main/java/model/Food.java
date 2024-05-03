/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.json.simple.JSONObject;

/**
 *
 * @author valer
 */
public class Food {
    private String idNumber;
    private String name;
    private String description;
    private double price;
    private String category; // Nueva propiedad para la categoría

    public Food(String idNumber, String name, String description, double price, String category) {
        this.idNumber = idNumber;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    // Getters y setters

    @SuppressWarnings("unchecked")
    public JSONObject toJson() {
        JSONObject jsonFood = new JSONObject();
        jsonFood.put("idNumber", idNumber);
        jsonFood.put("name", name);
        jsonFood.put("description", description);
        jsonFood.put("price", price);
        jsonFood.put("category", category);
        return jsonFood;
    }

    public static Food fromJson(JSONObject jsonFood) {
        String idNumber = (String) jsonFood.get("idNumber");
        String name = (String) jsonFood.get("name");
        String description = (String) jsonFood.get("description");
        double price = (Double) jsonFood.get("price");
        String category = (String) jsonFood.get("category"); 
        return new Food(idNumber, name, description, price, category);
    }

    @Override
    public String toString() {
        return "Food{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' + 
                '}';
    }
}
