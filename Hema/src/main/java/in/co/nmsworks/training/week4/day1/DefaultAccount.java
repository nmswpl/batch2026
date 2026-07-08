package in.co.nmsworks.training.week4.day1;

public class DefaultAccount implements Account {

    private int initialBalance = 0;
    private int transactionLimit = 0;
    private int balance = 0;

    public DefaultAccount() {
    }

    public DefaultAccount(int initialBalance, int transactionLimit, int balance) {
        this.initialBalance = initialBalance;
        this.transactionLimit = transactionLimit;
        this.balance = balance;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public int getTransactionLimit() {
        return transactionLimit;
    }

    public int getBalance() {
        return balance;
    }

    public void setInitialBalance(Integer initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void setTransactionLimit(Integer transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {

        if( amount <= balance && amount <= transactionLimit)
        {
            balance = balance - amount;
        } else if (amount > transactionLimit) {
            System.out.println("Given amount exceeds transaction limit!\n Your transaction limit is : "+transactionLimit);

        } else
        {
            System.out.println("Insufficient balance!\n Your current balance is : "+balance);
        }
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if(amount > transactionLimit)
        {
            System.out.println("Given amount exceeds transaction limit!\n Your transaction limit is : "+transactionLimit);
        }
        else
        {
            balance = balance + amount;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "DefaultAccount{" +
                "initialBalance=" + initialBalance +
                ", transactionLimit=" + transactionLimit +
                ", balance=" + balance +
                '}';
    }
}
