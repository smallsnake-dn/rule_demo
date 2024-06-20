package model;

public class EmployeeForRoute {
    String routeId;
    int numberOfEmployee;
    int numberOfDriver;


    
    public EmployeeForRoute(String routeId, int numberOfEmployee, int numberOfDriver) {
        this.routeId = routeId;
        this.numberOfEmployee = numberOfEmployee;
        this.numberOfDriver = numberOfDriver;
    }
    public String getRouteId() {
        return routeId;
    }
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }
    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }
    public int getNumberOfDriver() {
        return numberOfDriver;
    }
    public void setNumberOfDriver(int numberOfDriver) {
        this.numberOfDriver = numberOfDriver;
    }

    
}
