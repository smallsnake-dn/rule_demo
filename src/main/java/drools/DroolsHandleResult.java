package drools;

import java.util.Collection;

import org.drools.core.ObjectFilter;
import org.kie.api.runtime.KieSession;

import model.EmployeeForRoute;

public class DroolsHandleResult {
    public static Object getData (KieSession session) {
        Collection<? extends Object> rs =  session.getObjects();
        return rs;
    }
}
