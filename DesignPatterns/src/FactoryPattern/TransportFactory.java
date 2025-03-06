package FactoryPattern;

public class TransportFactory {

    public static Transport getTransportObject(String transportType){

        if (transportType.equals("TRUCK")){
            return new Truck();
        } else if (transportType.equals("SHIP")) {
            return new Ship();
        }
        throw new IllegalArgumentException("Invalid transport type: " + transportType);
    }
}
