package CreationalPatterns.Factory;

public class BankB implements IBank{
    @Override
    public String withDraw() {
        return "Your request is Bank B";
    }
}
