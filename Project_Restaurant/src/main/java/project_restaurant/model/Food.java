
package project_restaurant.model;
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

    public Food(String idNumber, String name, String description, double price) {
        this.idNumber = idNumber;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    @SuppressWarnings("unchecked")
    public JSONObject toJson() {
        JSONObject jsonFood = new JSONObject();
        jsonFood.put("idNumber", idNumber);
        jsonFood.put("name", name);
        jsonFood.put("description", description);
        jsonFood.put("price", price);
        return jsonFood;
    }

    public static Food fromJson(JSONObject jsonFood) {
        String idNumber = (String) jsonFood.get("idNumber");
        String name = (String) jsonFood.get("name");
        String description = (String) jsonFood.get("description");
        double price = (Double) jsonFood.get("price");
        return new Food(idNumber, name, description, price);
    }

    @Override
    public String toString() {
        return "Food{" +
                "idNumber='" + idNumber + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
