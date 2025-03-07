package AbstractFactory.FurnitureFactory;

public class ModernTable implements Table{
    @Override
    public void use() {
        System.out.println("Modern Table");
    }
}
