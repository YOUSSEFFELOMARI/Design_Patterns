package CreationalPatterns.Builder.Product;

public class MotoCycle implements IBuilder {
    private String brandName;
    private Product product;

    public MotoCycle(String brandName) {
        this.brandName = brandName;
        this.product = new Product();
    }

    @Override
    public void StartUpOperations() {

    }

    @Override
    public void BuildBody() {
        product.add("body of MotoCycle was added");

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
        product.add("Car Model name:"+this.brandName);
    }

    @Override
    public Product GetVehicle() {
        return product;
    }

}
