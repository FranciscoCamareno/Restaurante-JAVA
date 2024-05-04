/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author fcama
 */
public class CustomerJSON {
    JSONObject baseObjectJSON;
    private Customer customer;
    
    
    public CustomerJSON() {
    this.baseObjectJSON = new JSONObject();
    }
    
    
    public void addCustomerJSON(Customer customer){
        JSONObject registroUsuario = new JSONObject();
        registroUsuario.put("identificación", customer.getIdNumber());
        registroUsuario.put("nombre", customer.getUserName());
        registroUsuario.put("contraseña", customer.getPassword());
        registroUsuario.put("correo", customer.geteMail());
        
        this.baseObjectJSON.put("User", registroUsuario);
        // Guardar el objeto JSON en un archivo
        try (FileWriter file = new FileWriter("registroUsuario.json")) {
            file.write(this.baseObjectJSON.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            System.out.println("Error creating file");
        }
        
    }
    
}
