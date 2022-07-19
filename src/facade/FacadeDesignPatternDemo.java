package facade;

public class FacadeDesignPatternDemo {

    public static void main(String[] args) {
        BankAccountFacade bankAccountFacade = new BankAccountFacade("12345","1234");
        bankAccountFacade.deposit(1000,"12345","1234");
        bankAccountFacade.withdraw(900,"12345","1234");
        bankAccountFacade.withdraw(200,"12345","1234");
        bankAccountFacade.deposit(2000,"12345","1234");
        bankAccountFacade.withdraw(1,"12345","12346");
    }
}
