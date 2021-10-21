import java.io.IOException;

public interface BankWorkers {

    boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException;



}
