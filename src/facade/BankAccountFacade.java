package facade;

public class BankAccountFacade {

    private Authorization authorization;
    private Transaction transaction;
    private WelcomeToBank welcomeToBank;

    public BankAccountFacade(String accountNo, String accountPin) {
        this.authorization = new Authorization();
        authorization.setAccountNo(accountNo);
        authorization.setAccountPin(accountPin);
        this.transaction = new Transaction();
        this.welcomeToBank = new WelcomeToBank();
    }


    public void deposit(int amount, String accountNo, String accountPin) {
        if (!authorization.authorize(accountNo,accountPin)) {
            System.out.println("Authorization failed! Please pass valid credentials!");
        } else {
            transaction.depositMoney(amount);
        }
    }

    public void withdraw(int amount, String accountNo, String accountPin) {
        if (!authorization.authorize(accountNo,accountPin)) {
            System.out.println("Authorization failed! Please pass valid credentials!");
        } else {
            transaction.withdrawMoney(amount);
        }
    }
}
