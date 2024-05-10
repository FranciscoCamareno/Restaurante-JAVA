
package project_restaurant.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import netscape.javascript.JSObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class CustomerArray {

    private int posicion;
    private JSONObject baseJSONcustomer;
    private ArrayList<Customer> customerList;
    private File archivoCustomer;

    public CustomerArray() {
        customerList = new ArrayList();
        archivoCustomer = new File("customers.json");
        this.readJSON();
    }

    public String add(Customer customer) {
        if (customerList.add(customer)) {
            this.writeJSON();
            return "El cliente fue registrado satisfactoriamente";
        }
        return "Error al registrar el cliente";
    }

    public int find(String idNumber) {
        for (int index = 0; index < customerList.size(); index++) {
            if (customerList.get(index).getIdNumber().equalsIgnoreCase(idNumber)) {
                return index;
            }
        }
        return 0;
    }
    
    public boolean findPassword(int posicion, String password){
       boolean result = false;
       if(customerList.get(posicion).getPassword().equalsIgnoreCase(password)){
           result = true;
       }
       return result;
    }

    public void remove() {
        customerList.remove(posicion);
    }

    public String[][] getDataTable() {
        String[][] matriz = new String[customerList.size()][Customer.SIZE_CUSTOMER];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = customerList.get(fila).getData(columna);
            }
        }
        return matriz;
    }

    @Override
    public String toString() {
        String datos = "Los datos del cliente son: \n";
        for (int cliente = 0; cliente < customerList.size(); cliente++) {
            datos += customerList.get(cliente).toString() + "\n";
        }
        return datos;
    }
    
    //METODO ESCRIBIR JSON
    public void writeJSON() {
        JSONArray arrayCustomer = new JSONArray();
        baseJSONcustomer = new JSONObject();

        for (Customer customer : customerList) {
            JSONObject objJSONcustomer = new JSONObject();
            objJSONcustomer.put("id", customer.getIdNumber());
            objJSONcustomer.put("UserName", customer.getUserName());
            objJSONcustomer.put("Password", customer.getPassword());
            objJSONcustomer.put("eMail", customer.geteMail());

            arrayCustomer.add(objJSONcustomer);
            
        }
        this.baseJSONcustomer.put("CustomerList", arrayCustomer);
        
        try {
            FileWriter write = new FileWriter(archivoCustomer);
            write.write(this.baseJSONcustomer.toJSONString());
            write.flush();
            write.close();
        } catch (IOException ex) {
            System.err.println("Error creating file");
        }
    
    }
    
    //METODO LEER JSON
    public void readJSON(){
        JSONParser parser = new JSONParser();
        try {
            FileReader read = new FileReader(archivoCustomer);
            Object obj= parser.parse(read);
            this.baseJSONcustomer =(JSONObject) obj;
            JSONArray arregloJSON = (JSONArray) this.baseJSONcustomer.get("CustomerList");
            for(Object object : arregloJSON){
                JSONObject objCustomer=(JSONObject) object;
                Customer customer= new Customer();
                customer.setIdNumber((String) objCustomer.get("id"));
                customer.setPassword((String) objCustomer.get("Password")); 
                customer.setUserName((String) objCustomer.get("UserName"));
                customer.seteMail((String) objCustomer.get("eMail"));
                customerList.add(customer);
            }
        } catch (FileNotFoundException ex) {
             System.err.println("Error reading file");
        } catch (IOException ex) {
             System.err.println("Error reading file");
        } catch (ParseException ex) {
             ex.printStackTrace();
        }
    }            
    
    /////////////
    public void rewriteJSON() {
    JSONArray arrayCustomer = new JSONArray();
    baseJSONcustomer = new JSONObject();

    for (Customer customer : customerList) {
        JSONObject objJSONcustomer = new JSONObject();
        objJSONcustomer.put("id", customer.getIdNumber());
        objJSONcustomer.put("UserName", customer.getUserName());
        objJSONcustomer.put("Password", customer.getPassword());
        objJSONcustomer.put("eMail", customer.geteMail());

        arrayCustomer.add(objJSONcustomer);
    }
    this.baseJSONcustomer.put("CustomerList", arrayCustomer);

    try {
        FileWriter write = new FileWriter(archivoCustomer);
        write.write(this.baseJSONcustomer.toJSONString());
        write.flush();
        write.close();
    } catch (IOException ex) {
        System.err.println("Error creating file");
    }
}


}
