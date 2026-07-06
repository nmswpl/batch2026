package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account {
    private int balance;
    private int transactionLimit;

    public Wallet(int balance, int transactionLimit) {
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    @Override
    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Withdrawal exceeds transaction limit.");
            return balance;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return balance;
        }

        balance -= amount;
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if (amount > transactionLimit) {
            System.out.println("Deposit exceeds transaction limit.");
            return balance;
        }

        balance += amount;
        return balance;
    }
}