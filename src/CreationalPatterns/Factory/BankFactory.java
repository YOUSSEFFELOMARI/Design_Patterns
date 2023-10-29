package CreationalPatterns.Factory;

public class BankFactory implements IBankFactory{
    @Override
    public IBank getBank(String bankCode) {
        return switch (bankCode) {
            case "1111" -> new BankA();
            case "2222" -> new BankB();
            default -> null;
        };
    }

    @Override
    public IPaymentCard getPaymentCard(String cardNum) {
        return switch (cardNum) {
            case "1111" -> new VisaCard();
            case "2222" -> new MasterCard();
            default -> null;
        };
    }
}
