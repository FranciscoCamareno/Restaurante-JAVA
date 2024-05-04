/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;

import java.util.ArrayList;

/**
 *
 * @author anaag
 */

public class CustomerArray {    
    private int posicion;
    private ArrayList<Customer> customerList;

    public CustomerArray() {
        customerList=new ArrayList();
    }
    
    public String add(Customer customer){
        if(customerList.add(customer)){
          return "El cliente fue registrado satisfactoriamente";  
        }
           return "Error al registrar el cliente";
    }

    public Customer find(String idNumber){
        for(int index=0; index<customerList.size(); index++){
            if(customerList.get(index).getIdNumber().equalsIgnoreCase(idNumber)){
            return customerList.get(index);
            }
        }
        return null;
    }
    
    public void remove(){
        customerList.remove(posicion);
    }
    
      public String[][] getDataTable(){
        String [][] matriz = new String[customerList.size()][Customer.SIZE_CUSTOMER];
        for(int fila = 0; fila<matriz.length; fila++){
            for(int columna = 0; columna<matriz[fila].length; columna++){
                matriz[fila][columna]=customerList.get(fila).getData(columna);
            }
        }
        return matriz;
    }
    
    @Override
    public String toString() {
        String datos="Los datos del cliente son: \n";
        for(int cliente=0; cliente<customerList.size(); cliente++){
            datos+=customerList.get(cliente).toString()+"\n";
        }
        return datos;
    } 
    
}
