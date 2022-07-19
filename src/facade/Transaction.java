package facade;

public class Transaction {

    private long amount;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void depositMoney(long amount) {
        this.amount += amount;
        System.out.println("Transaction Successful! Current Account Balance: " + this.amount);
    }

    public void withdrawMoney(long amount) {
        if (amount > this.amount) {
            System.out.println("Transaction Failed!You don't have enough funds for this transaction! " +
                    "Current account balance: " + this.amount);
        } else {
            this.amount -= amount;
            System.out.println("Transaction Successful! Current account balance: " + this.amount);
        }
    }
}
