package ProtoTypeDesignPattern.PTDPAbstractClassScenario;

import ProtoTypeDesignPattern.PTDPInterfaceScenario.VehicleRegistry;

public abstract class Vehicle implements Cloneable {

    public abstract void showDetails();

    @Override
    protected Vehicle clone(){
        try {
            return (Vehicle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone Not Support : " + e);
        }
    }
}
