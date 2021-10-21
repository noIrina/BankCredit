

public class BankWorker implements BankWorkers {
    public boolean checkClientForCredit(BankClient bankClient) throws BadCreditHistoryException, ProblemWithLawException {
        if (bankClient.bad.equals("Bad")) {
            throw new BadCreditHistoryException();
        } else if (bankClient.bad.equals("Problem with law")) {
            throw new ProblemWithLawException();
        }
        return true;
    }
}
