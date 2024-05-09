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
    private String category;
    private String imagePath;

    public Food() {
    }

    public Food(String idNumber, String name, String description, double price, String category) {
        this.idNumber = idNumber;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Food{"
                + "idNumber='" + idNumber + '\''
                + ", name='" + name + '\''
                + ", description='" + description + '\''
                + ", price=" + price
                + ", category='" + category + '\''
                + ", imagePath='" + imagePath + '\''
                + '}';
    }
}
