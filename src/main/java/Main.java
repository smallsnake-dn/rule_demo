import model.Employee;
import model.EmployeeForRoute;
import model.EmployeeOfProduct;
import model.Order;
import model.Route;
import model.RouteCoordinator;

import org.drools.core.ObjectFilter;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;

import drools.DroolsCondition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        KieContainer kieContainer = KieServices.get().getKieClasspathContainer();
        KieSession session = kieContainer.newKieSession("promotion");
        session.fireAllRules();

        // List<Route> routes = new ArrayList<>();
        // Route r = new Route();
        // List<Integer> l = new ArrayList<>();
        // l.add(1);
        // l.add(2);
        // l.add(3);

        // r.setSkillRequire(l);

        // List<Integer> l2 = new ArrayList<>();
        // l2.add(1);
        // l2.add(2);

        // System.out.println("compare: " + DroolsCondition.compare(l, l2));

        // Employee employee = new Employee();
        // Employee employee2 = new Employee();
        // Employee employee3 = new Employee();
        // employee.setSkillRequire(l);
        // employee2.setSkillRequire(l);
        // employee3.setSkillRequire(l2);

        // session.insert(r);
        // session.insert(employee);
        // session.insert(employee2);
        // session.insert(employee3);

        // printAllProduct(session);


        // Global
        
        Map<String, String> m = new HashMap<>();

        session.setGlobal("mapGlobal", m);
        


        System.out.println("long :: " + (Long.MAX_VALUE + 1));

        EmployeeOfProduct e = new EmployeeOfProduct();
        EmployeeOfProduct e2 = new EmployeeOfProduct();
        EmployeeOfProduct e3 = new EmployeeOfProduct();
        e.setEmployeeRequire(2);
        e2.setEmployeeRequire(2);
        e3.setEmployeeRequire(4);

        List<EmployeeOfProduct> l = new ArrayList<>();
        l.add(e);
        l.add(e2);
        l.add(e3);

        Order o = new Order();
        o.setEmployeeOfProducts(l);

        List<Order> lo = new ArrayList<>();
        lo.add(o);

        RouteCoordinator r = new RouteCoordinator();
        r.setRouteId("123");
        r.setMaxHour(-1);
        r.setStartTime(new Date());
        r.setEndTime(new Date());
        r.setOrders(lo);

        System.out.println("*****");

        session.insert(r);
        System.out.println("*****");
        // printAllProduct(session);

        // session.delete(prFh);
        session.fireAllRules();


        System.out.println(m);

        Collection<EmployeeForRoute> rs = (Collection<EmployeeForRoute>) session.getObjects(new ObjectFilter() {

            @Override
            public boolean accept(Object object) {
                return object instanceof EmployeeForRoute;
            }

        });

        rs.forEach(rss -> System.out.println(rss.getRouteId()));

        session.dispose();
    }

    // public static void printAllProduct(KieSession session) {
    // QueryResults results = session.getQueryResults("list_all_product");
    // for ( QueryResultsRow row : results ) {
    // Product product = ( Product ) row.get( "$product" );
    // System.out.println(product);
    // }
    // }
}
