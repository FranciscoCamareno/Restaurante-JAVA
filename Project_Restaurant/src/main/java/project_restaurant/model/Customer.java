
package project_restaurant.model;


public class Customer {

    private String idNumber;
    private String userName;
    private String password;
    private String eMail;
    public static final String[] CUSTOMER_LABELS = {"Identificación", "Nombre", "Contraseña", "Dirección"};
    public static final int SIZE_CUSTOMER = CUSTOMER_LABELS.length;

    public Customer() {
    }

    public Customer(String idNumber, String userName, String password, String eMail) {
        this.idNumber = idNumber;
        this.userName = userName;
        this.password = password;
        this.eMail = eMail;
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

    public void setUserName(String userName) {
        this.userName = userName;
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


    public String getData(int index) {
        switch (index) {
            case 0:
                return idNumber;
            case 1:
                return userName;
            case 2:
                return password;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Información de Cliente{" + "Identificación=" + idNumber + ", Nombre=" + userName + ", Contraseña=" + password + ", Correo=" + eMail +'}';
    }

}
