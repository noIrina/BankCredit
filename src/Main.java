import java.io.IOException;
import java.math.BigInteger;

public class Main {


    public static void main(String[] args) {
        Main get = new Main();
        BankClient client1 = new BankClient("Bad");
        BankClient client2 = new BankClient("Problem with law");
        BankClient client3 = new BankClient("Good history");
        BankWorker employee = new BankWorker();

        System.out.println(get.getCreditForClient(employee, client1));
        System.out.println(get.getCreditForClient(employee, client2));
        System.out.println(get.getCreditForClient(employee, client3));

    }


    public boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
        } catch (ProblemWithLawException e) {
        }
        return false;
    }
}





