package CreationalPatterns.Factory;

import java.util.Scanner;

public class FactoryTest {
    public static void main(String[] args) {
        String cardNumber,bankCode;
        IBankFactory bankFactory=new BankFactory();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Your CardNumber: ");
        cardNumber=scanner.nextLine();
        bankCode=cardNumber.substring(0,4);
        IBank bank=bankFactory.getBank(bankCode);
        IPaymentCard card= bankFactory.getPaymentCard(bankCode);
        System.out.println(bank != null ? bank.withDraw()+"\n"+ card.getProvider()+"\n"+card.getName() : "No Bank with that Number");
//        IBankFactory bankFactory2=new BankFactory2();
//        IBank bank2=bankFactory2.getBank(bankCode);
//        System.out.println(bank != null ? bank.withDraw() : (bank2 != null ? bank2.withDraw() : "No Bank with that Number"));
    }
}
