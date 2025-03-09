package ProtoTypeDesignPattern.PTDPInterfaceScenario;

import java.util.HashMap;

public class VehicleRegistry {

    private static final HashMap<String,Vehicle> map = new HashMap();

    static {
        map.put("Car" , new Car("Toyota",120));
        map.put("Bus" , new Bus(50));
    }

    public static Vehicle getVehicle(String type){
        return map.get(type).clone();
    }
}

/*Read Me :
Instead of creating new instances manually, we store pre-configured vehicle instances in a registry and return a clone when needed.
Why use a registry?
Avoids repetitive object creation.
Provides a single place to manage prototypes.
Clients can request a vehicle type without worrying about object instantiation.
This approach is useful when object creation is expensive (e.g., complex initialization, database queries, etc.).
*/

