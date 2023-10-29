package CreationalPatterns.Factory;

public class VisaCard implements IPaymentCard {

    @Override
    public String getName() {
        return "Visa Card";
    }

    @Override
    public String getProvider() {
        return "Visa";
    }
}
