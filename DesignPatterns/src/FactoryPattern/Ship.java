package FactoryPattern;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivery by Ship on Water");
    }
}
