package CreationalPatterns.Factory;

public class BankA implements IBank{
    @Override
    public String withDraw() {
        return "Your request is Bank A";
    }
}
