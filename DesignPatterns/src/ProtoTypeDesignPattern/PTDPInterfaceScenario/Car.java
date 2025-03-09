package ProtoTypeDesignPattern.PTDPInterfaceScenario;


public class Car implements Vehicle{

    private String brand;
    private int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public Vehicle clone() {
        return new Car(this.brand,this.speed);
    }

    @Override
    public void showDetails() {
        System.out.println("Brand : " + brand + "  and speed is : " + speed);
    }
}
