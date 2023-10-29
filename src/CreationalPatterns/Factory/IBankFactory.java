package CreationalPatterns.Factory;

public interface IBankFactory {

    IBank getBank(String bankCode);
    IPaymentCard getPaymentCard(String cardNum);
}
