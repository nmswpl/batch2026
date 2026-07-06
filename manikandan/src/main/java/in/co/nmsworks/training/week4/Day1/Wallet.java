package in.co.nmsworks.training.week4.Day1;

public class Wallet implements Account {
    private int balance;
    private final int transactionLimit;

    public Wallet(int startingBalance, int transactionLimit) {
        this.balance = startingBalance;
        this.transactionLimit = transactionLimit;
    }

    @Override
    public int limit() {
        return this.transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Error: Withdrawal amount exceeds the transaction limit of " + transactionLimit);
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance. Available: " + balance);
        } else {
            balance -= amount;
        }
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Error: Deposit amount exceeds the transaction limit of " + transactionLimit);
        } else {
            balance += amount;
        }
        return balance;
    }
}
