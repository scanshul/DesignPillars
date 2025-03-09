package ProtoTypeDesignPattern.PTDPAbstractClassScenario;

import ProtoTypeDesignPattern.PTDPInterfaceScenario.Vehicle;

public class Bus extends ProtoTypeDesignPattern.PTDPAbstractClassScenario.Vehicle {

    private int capacity;


    public Bus(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void showDetails() {
        System.out.println("Scenario 2 : "  + "Bus capacity : " + capacity);
    }
}
