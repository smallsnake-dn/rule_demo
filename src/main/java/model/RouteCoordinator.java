package model;

import java.util.Date;
import java.util.List;

public class RouteCoordinator {
    String routeId;
    Date startTime;
    Date endTime;
    int maxHour;
    List<Order> orders;
    
    public String getRouteId() {
        return routeId;
    }
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
    public Date getStartTime() {
        return startTime;
    }
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    public Date getEndTime() {
        return endTime;
    }
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
    public int getMaxHour() {
        return maxHour;
    }
    public void setMaxHour(int maxHour) {
        this.maxHour = maxHour;
    }
    public List<Order> getOrders() {
        return orders;
    }
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    
}
