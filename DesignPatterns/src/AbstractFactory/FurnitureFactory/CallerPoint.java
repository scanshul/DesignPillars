package AbstractFactory.FurnitureFactory;

public class CallerPoint {
    public static void main(String[] args) {
        FurnitureFactory ff1 = new ModernFurnitureFactory();
      Chair modernChair =  ff1.createChair();
       Table modernTable =  ff1.createTable();

       modernChair.sitOn();
       modernTable.use();


        FurnitureFactory ff2 = new VictorianFurnitureFactory();
        Chair victorianChair = ff2.createChair();
        Table victorianTable = ff2.createTable();

        victorianChair.sitOn();
        victorianTable.use();
    }
}
