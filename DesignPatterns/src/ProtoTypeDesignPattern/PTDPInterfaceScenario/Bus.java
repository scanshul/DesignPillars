package ProtoTypeDesignPattern.PTDPInterfaceScenario;

public class Bus implements Vehicle{

    private int capacity;


    public Bus(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Vehicle clone() {
        return new Bus(this.capacity);
    }

    @Override
    public void showDetails() {
        System.out.println("Bus capacity : " + capacity);
    }
}
