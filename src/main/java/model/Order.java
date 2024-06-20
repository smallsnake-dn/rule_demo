package model;

import java.util.List;

public class Order {
    List<String> addressDesribe;
    List<EmployeeOfProduct> employeeOfProducts;
    public List<String> getAddressDesribe() {
        return addressDesribe;
    }
    public List<EmployeeOfProduct> getEmployeeOfProducts() {
        return employeeOfProducts;
    }
    public void setAddressDesribe(List<String> addressDesribe) {
        this.addressDesribe = addressDesribe;
    }
    public void setEmployeeOfProducts(List<EmployeeOfProduct> employeeOfProducts) {
        this.employeeOfProducts = employeeOfProducts;
    }

    
}
