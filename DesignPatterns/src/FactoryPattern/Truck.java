package FactoryPattern;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by Truck on Road");
    }
}
