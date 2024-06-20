package services;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import model.Order;

public class CalculatingEmployeeService {
    public static int getEmployeeRequire(List<Order> orders) {
        return orders.stream().flatMap(e -> e.getEmployeeOfProducts().stream())
                .mapToInt(e -> e.getEmployeeRequire()).max().getAsInt();
    }

    public static long timeDistance(Date d1, Date d2) {
        long timeBetween = Math.abs(d1.getTime() - d2.getTime());
        long time = TimeUnit.DAYS.convert(timeBetween, TimeUnit.MINUTES);
        return time;
    }
}
