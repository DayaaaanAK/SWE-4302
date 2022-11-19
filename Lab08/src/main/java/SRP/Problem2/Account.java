package SRP.Problem2;

public class Account {
    String accountID;
    long balance;

    public long getBalance() {
        return balance;
    }

    public void credit(long amount)
    {
        this.balance += amount;
    }

    public  void debit(long amount)
    {
        this.balance -= amount;
    }
}
