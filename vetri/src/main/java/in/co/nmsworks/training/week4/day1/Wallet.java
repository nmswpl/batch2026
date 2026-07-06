package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account {

    private int balance = 0;
    private final int limit = 20000;

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int deposit(int amount) {

        if (balance + amount <= limit) {
            balance += amount;
        } else {
            System.out.println("Wallet limit exceeded.");
        }

        return balance;
    }

    @Override
    public int withdraw(int amount) {

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient wallet balance.");
        }

        return balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}