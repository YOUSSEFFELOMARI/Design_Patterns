package CreationalPatterns.Builder.Product;

public interface IBuilder {

    void StartUpOperations();
    void BuildBody();
    void InsertWheels();
    void AddHeadlights();
    void EndOperations();

    Product GetVehicle();
}
