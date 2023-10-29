package CreationalPatterns.Builder.Product;

public class Car implements IBuilder{
    private String brandName;
    private Product product;

    public Car(String brandName) {
        this.brandName = brandName;
        this.product = new Product();
    }

    @Override
    public void StartUpOperations() {
        product.add("Car Model name:"+this.brandName);
    }

    @Override
    public void BuildBody() {
        product.add("body of car was added");

    }

    @Override
    public void InsertWheels() {
        product.add("wheels are added");
    }

    @Override
    public void AddHeadlights() {
        product.add("Headlights are added");
    }

    @Override
    public void EndOperations() {

    }

    @Override
    public Product GetVehicle() {
        return product;
    }

}
