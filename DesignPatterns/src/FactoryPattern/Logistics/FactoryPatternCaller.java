package FactoryPattern.Logistics;

public class FactoryPatternCaller {
    public static void main(String[] args) {
        Transport tf =  TransportFactory.getTransportObject("TRUCK");
        tf.deliver();

        Transport tf2 =  TransportFactory.getTransportObject("SHIP");
        tf.deliver();

    }
}
