package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account{
    private int balance;
    private int limit;

    public Wallet() {
    }

    public Wallet(int balance, int limit) {
        this.balance = balance;
        this.limit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > balance) {
            return Integer.MAX_VALUE;
        }
        if (amount > limit) {
            return Integer.MIN_VALUE;
        }
        balance -= amount;
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if (amount > limit) {
            return Integer.MIN_VALUE;
        }
        balance += amount;
        return balance;
    }
}
