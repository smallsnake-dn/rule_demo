package model;

public class EmployeeOfProduct {
    String productId;
    String serviceId;
    int employeeRequire;
    public String getProductId() {
        return productId;
    }
    public String getServiceId() {
        return serviceId;
    }
    public int getEmployeeRequire() {
        return employeeRequire;
    }
    public void setProductId(String productId) {
        this.productId = productId;
    }
    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    public void setEmployeeRequire(int employeeRequire) {
        this.employeeRequire = employeeRequire;
    }

    
}
