package ProtoTypeDesignPattern.PTDPAbstractClassScenario;


import ProtoTypeDesignPattern.PTDPInterfaceScenario.Vehicle;

public class Car extends ProtoTypeDesignPattern.PTDPAbstractClassScenario.Vehicle {

    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public void showDetails() {
        System.out.println("Scenario 2 : "  + "Brand : " + brand + "  and speed is : " + speed);
    }
}
