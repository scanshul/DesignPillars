package ProtoTypeDesignPattern.PTDPAbstractClassScenario;

public class CallerPoint {
    public static void main(String[] args) {
        ProtoTypeDesignPattern.PTDPAbstractClassScenario.Vehicle clonedCar = ProtoTypeDesignPattern.PTDPAbstractClassScenario.VehicleRegistry.getVehicle("Car");
        clonedCar.showDetails();

        Vehicle clonedBus = VehicleRegistry.getVehicle("Bus");
        clonedBus.showDetails();
    }
}
