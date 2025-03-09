package ProtoTypeDesignPattern.PTDPInterfaceScenario;

public class CallerPoint {
    public static void main(String[] args) {
        Vehicle clonedCar = VehicleRegistry.getVehicle("Car");
        clonedCar.showDetails();

        Vehicle clonedBus = VehicleRegistry.getVehicle("Bus");
        clonedBus.showDetails();
    }
}
