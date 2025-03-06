package FactoryDesignPattern;

public class Truck implements Transport{
    @Override
    public void deliever() {
        System.out.println("Delivery by Truck on road");
    }
}
