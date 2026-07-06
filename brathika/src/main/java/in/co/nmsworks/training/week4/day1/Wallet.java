package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account{
    Integer initialBalance = 500;
    Integer transactionLimit = 10000;

    public Wallet() {
    }

    public Wallet(Integer initialBalance, Integer transactionLimit) {
        this.initialBalance = initialBalance;
        this.transactionLimit = transactionLimit;
    }

    @Override
    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        Integer balance = initialBalance;
        if (amount < balance && amount < limit()) {
            balance = balance - amount;
            initialBalance = balance;
        } else if (amount > limit()) {
            System.out.println("Amount exceeds the transaction limit");

        } else {
            System.out.println("Insuffient balance");
        }
        return balance;
    }

    @Override
    public int deposit(int amount) {
        Integer balance = initialBalance;
        if (amount > limit()) {
            System.out.println("Amount exceed the transaction limit");
        }
        else {
             balance += amount;
            initialBalance = balance;

        }

        return balance;
    }
}
