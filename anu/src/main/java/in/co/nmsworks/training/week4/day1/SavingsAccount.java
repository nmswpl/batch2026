package in.co.nmsworks.training.week4.day1;
public class SavingsAccount implements Account {
    private int balance;
    private int transactionLimit;

    public SavingsAccount(int balance, int transactionLimit) {
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    @Override
    public int deposit(int amount) {
        if (amount > limit()) {
            System.out.println("exceeds transaction limit.");
            return  balance;
        }
        balance += amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > limit()) {
            System.out.println(" exceeds transaction limit.");
            return balance;
        }
        balance -= amount;
        return balance;
    }

    @Override
    public int limit() {
        return this.transactionLimit;
    }


}