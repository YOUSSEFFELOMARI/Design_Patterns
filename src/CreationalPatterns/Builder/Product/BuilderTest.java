package CreationalPatterns.Builder.Product;

public class BuilderTest {
    public static void main(String[] args) {
        Director director=new Director();
        IBuilder carBuilder=new Car("Jeep");
        IBuilder motoCycleBuilder= new MotoCycle("Suzuki");

        //making car
        director.construct(carBuilder);
        Product car=carBuilder.GetVehicle();
        System.out.println(car.Show());
        //making MotoCycle
        director.construct(motoCycleBuilder);
        Product moto=motoCycleBuilder.GetVehicle();
        System.out.println(moto.Show());
    }
}
