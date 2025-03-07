package AbstractFactory.FurnitureFactory;

public class ModernChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Modern Chair");
    }
}
