/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_restaurant.model;

/**
 *
 * @author anaag
 */
public class Customer {
    private String idNumber;
    private String userName;
    private String password;
    private String eMail;
//    private String address;

    public Customer() {
    }

    public Customer(String idNumber, String userName, String password, String eMail) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;
//        this.address = address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }

    @Override
    public String toString() {
        return "Información de Cliente{" + "Identificación=" + idNumber + ", Nombre=" + userName + 
                ", Contraseña=" + password + ", Correo=" + eMail +'}';
    }    
    
    
}
