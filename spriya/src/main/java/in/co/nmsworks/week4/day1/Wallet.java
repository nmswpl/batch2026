package in.co.nmsworks.week4.day1;

public class Wallet implements Account {

    private int limit;
    private int balance;


    public Wallet(int limit, int balance) {
        this.limit = limit;
        this.balance = balance;
    }

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        int newAmount = amount * (-1);
        if (newAmount > balance) {
            System.out.println("Amount exceeds balance ");
            return balance;
        }
        if (newAmount > limit()) {
            System.out.println("Amount exceeds Limit");
            return limit();
        }

        balance = balance - newAmount;
        return balance;
    }

    @Override
    public int deposit(int amount) {

        if (amount > limit()) {
            System.out.println("Amount exceeds Limit");
            return limit();
        }

        balance += amount;
        return balance;
    }
}
