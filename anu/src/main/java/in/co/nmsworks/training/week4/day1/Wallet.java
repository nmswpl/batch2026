package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account {
    private int balance;
    private int transactionLimit;


    public Wallet(int startingBalance, int transactionLimit) {
        this.balance = startingBalance;
        this.transactionLimit = transactionLimit;
    }

    @Override
    public int deposit(int amount) {
        if (amount > limit()) {
            System.out.println("exceeds transaction limit.");
            return balance;
        }
        balance += amount;
        return balance;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > limit()) {
            System.out.println(" exceeds transaction limit.");
            return  balance ;
        }
        balance -= amount;
        return balance;
    }

    @Override
    public int limit() {
        return this.transactionLimit;
    }

    public int getBalance() {
        return balance;
    }
}

