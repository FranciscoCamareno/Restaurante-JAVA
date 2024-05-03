/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;

import java.io.File;
import java.io.FileNotFoundException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;
import project_restaurant.model.Food;

/**
*
*  @author eveba
*   Son tres pasos, faciles de recordar.
*   La primera vez se ejecutan los dos primeros, el tercero se puede ejecutar, pero en este proyecto no creo que sea necesario.
*   La segunda vez, solo se ejecuta el tercero, por que si no, se sobre escriben,
*   En esta clase no es peligroso, por que siempre es la misma informacion, pero no esta de mas ser precavidos.
*   1. addProductsToJson()
*   2. writeJSON()
*   3. readJSON()
*/
public class MenuJsonManager {

    JSONObject baseJSONObject;

    public MenuJsonManager() {
        this.baseJSONObject = new JSONObject();
    }

    //Aqui se crean los objectos que iran en el archivo JSON.
    public void addProductsToJson() {
        JSONArray foodList = new JSONArray();
        ///////////////////////////////////////////////////////////////////////
        Food appetizer1 = new Food("A1", "Edamame", "Edamame", 2800.1, "Appetizer");
        Food appetizer2 = new Food("A2", "Gyoza", "Gyoza", 2800.1, "Appetizer");
        Food appetizer3 = new Food("A3", "Yakitori", "Yakitori", 2800.1, "Appetizer");
        ///////////////////////////////////////////////////////////////////////////
        Food mainCourse1 = new Food("M1", "yakiniku", "yakiniku", 2800.1, "Main Course");
        Food mainCourse2 = new Food("M2", "unagi", "unagi", 2800.1, "Main Course");
        Food mainCourse3 = new Food("M3", "ramen", "ramen", 2800.1, "Main Course");
        ////////////////////////////////////////////////////////////////////////////
        Food desserts1 = new Food("D1", "mochi", "mochi", 2800.1, "Desserts");
        Food desserts2 = new Food("D2", "dorayaki", "dorayaki", 2800.1, "Desserts");
        Food desserts3 = new Food("D3", "anmitsu", "anmitsu", 2800.1, "Desserts");
        //////////////////////////////////////////////////////////////////////////
        Food beverages1 = new Food("B1", "sake", "sake", 2800.1, "Beverages");
        Food beverages2 = new Food("B2", "hojicha", "hojicha", 2800.1, "Beverages");
        Food beverages3 = new Food("B3", "ramune", "ramune", 2800.1, "Beverages");
        //////////////////////////////////////////////////////////////////////////
        JSONObject edamame = new JSONObject();
        edamame.put("idNumber", appetizer1.getIdNumber());
        edamame.put("name", appetizer1.getName());
        edamame.put("description", appetizer1.getDescription());
        edamame.put("price", appetizer1.getPrice());
        edamame.put("category", appetizer1.getCategory());
        foodList.add(edamame);
        //////
        JSONObject gyoza = new JSONObject();
        gyoza.put("idNumber", appetizer2.getIdNumber());
        gyoza.put("name", appetizer2.getName());
        gyoza.put("description", appetizer2.getDescription());
        gyoza.put("price", appetizer2.getPrice());
        gyoza.put("category", appetizer2.getCategory());
        foodList.add(gyoza);
        //////
        JSONObject yakitori = new JSONObject();
        yakitori.put("idNumber", appetizer3.getIdNumber());
        yakitori.put("name", appetizer3.getName());
        yakitori.put("description", appetizer3.getDescription());
        yakitori.put("price", appetizer3.getPrice());
        yakitori.put("category", appetizer3.getCategory());
        foodList.add(yakitori);
        ///////////////////////////////////////////////////////////////
        JSONObject yakiniku = new JSONObject();
        yakiniku.put("idNumber", mainCourse1.getIdNumber());
        yakiniku.put("name", mainCourse1.getName());
        yakiniku.put("description", mainCourse1.getDescription());
        yakiniku.put("price", mainCourse1.getPrice());
        yakiniku.put("category", mainCourse1.getCategory());
        foodList.add(yakiniku);
        //////
        JSONObject unagi = new JSONObject();
        unagi.put("idNumber", mainCourse2.getIdNumber());
        unagi.put("name", mainCourse2.getName());
        unagi.put("description", mainCourse2.getDescription());
        unagi.put("price", mainCourse2.getPrice());
        unagi.put("category", mainCourse2.getCategory());
        foodList.add(unagi);
        /////////
        JSONObject ramen = new JSONObject();
        ramen.put("idNumber", mainCourse3.getIdNumber());
        ramen.put("name", mainCourse3.getName());
        ramen.put("description", mainCourse3.getDescription());
        ramen.put("price", mainCourse3.getPrice());
        ramen.put("category", mainCourse3.getCategory());
        foodList.add(ramen);
        //////////////////////////////////////////////////////////
        JSONObject mochi = new JSONObject();
        mochi.put("idNumber", desserts1.getIdNumber());
        mochi.put("name", desserts1.getName());
        mochi.put("description", desserts1.getDescription());
        mochi.put("price", desserts1.getPrice());
        mochi.put("category", desserts1.getCategory());
        foodList.add(mochi);
        /////////
        JSONObject dorayaki = new JSONObject();
        dorayaki.put("idNumber", desserts2.getIdNumber());
        dorayaki.put("name", desserts2.getName());
        dorayaki.put("description", desserts2.getDescription());
        dorayaki.put("price", desserts2.getPrice());
        dorayaki.put("category", desserts2.getCategory());
        foodList.add(dorayaki);
        ////////////
        JSONObject anmitsu = new JSONObject();
        anmitsu.put("idNumber", desserts3.getIdNumber());
        anmitsu.put("name", desserts3.getName());
        anmitsu.put("description", desserts3.getDescription());
        anmitsu.put("price", desserts3.getPrice());
        anmitsu.put("category", desserts3.getCategory());
        foodList.add(anmitsu);
        /////////////////////////////////////////////
        JSONObject sake = new JSONObject();
        sake.put("idNumber", beverages1.getIdNumber());
        sake.put("name", beverages1.getName());
        sake.put("description", beverages1.getDescription());
        sake.put("price", beverages1.getPrice());
        sake.put("category", beverages1.getCategory());
        foodList.add(sake);
        /////////
        JSONObject hojicha = new JSONObject();
        hojicha.put("idNumber", beverages2.getIdNumber());
        hojicha.put("name", beverages2.getName());
        hojicha.put("description", beverages2.getDescription());
        hojicha.put("price", beverages2.getPrice());
        hojicha.put("category", beverages2.getCategory());
        foodList.add(hojicha);
        /////////
        JSONObject ramune = new JSONObject();
        ramune.put("idNumber", beverages3.getIdNumber());
        ramune.put("name", beverages3.getName());
        ramune.put("description", beverages3.getDescription());
        ramune.put("price", beverages3.getPrice());
        ramune.put("category", beverages3.getCategory());
        foodList.add(ramune);
        ////////
        this.baseJSONObject.put("Menu", foodList);

//        System.out.println(this.baseJSONObject.toJSONString());
//        Para que prueben que se leen todos
    }

    //Aqui se crea el archivo JSON
    public void writeJSON() {
        try {
            FileWriter writer = new FileWriter(new File("Menu.json"));
            writer.write(this.baseJSONObject.toJSONString());
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            System.out.println("Error creating file");
        }
    }

    //Aqui se cnvierte de archivo JSON a un toString para ser trabajado en tablas
    public void readJSON() {
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader(new File("Menu.json"));
            Object menu = parser.parse(reader);
            JSONObject baseMenu = (JSONObject) menu;
            JSONArray menuArray = (JSONArray) baseMenu.get("Menu");
            for (Object objMenu : menuArray) {
                JSONObject menuJSON = (JSONObject) objMenu;
                Food food = new Food();
                food.setIdNumber((String) menuJSON.get("idNumber"));
                food.setName((String) menuJSON.get("name"));
                food.setDescription((String) menuJSON.get("description"));
                food.setPrice((double) menuJSON.get("price"));
                food.setCategory((String) menuJSON.get("category"));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error reading file");
        } catch (IOException ex) {
            System.out.println("Input/output error");
        } catch (ParseException ex) {
            System.out.println("Error parsing file");
        }
    }
}
