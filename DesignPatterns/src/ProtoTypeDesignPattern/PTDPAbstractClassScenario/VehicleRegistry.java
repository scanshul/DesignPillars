package ProtoTypeDesignPattern.PTDPAbstractClassScenario;

import java.util.HashMap;

public class VehicleRegistry {

    private static final HashMap<String, ProtoTypeDesignPattern.PTDPAbstractClassScenario.Vehicle> map = new HashMap();

    static {
        map.put("Car" , new Car("Toyota",120));
        map.put("Bus" , new Bus(50));
    }

    public static Vehicle getVehicle(String type){
        return map.get(type).clone();
    }
}



