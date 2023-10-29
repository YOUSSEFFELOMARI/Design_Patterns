package CreationalPatterns.Builder.Product;

public class Director {

    IBuilder Builder;

    public void construct(IBuilder iBuilder){
        Builder=iBuilder;
        iBuilder.StartUpOperations();
        iBuilder.BuildBody();
        iBuilder.InsertWheels();
        iBuilder.AddHeadlights();
        iBuilder.EndOperations();
    }
}
