package facade;

public class Authorization {

    private String accountNo;

    private String accountPin;

    public String getAccountPin() {
        return accountPin;
    }

    public void setAccountPin(String accountPin) {
        this.accountPin = accountPin;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public boolean authorize(String accountNo, String accountPin) {
        if (this.accountNo.equals(accountNo) && this.accountPin.equals(accountPin)) {
            return true;
        } else {
            return false;
        }
    }
}
