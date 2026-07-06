package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account{

    private double balance;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public int withdraw(int amount) {
        amount = -amount;
        if ((amount > limit())) {
            System.out.println("Amount exceeds than wallet daily limit! Enter value less than Rs " + limit());
            return -1;
        }
        if ((amount > balance)) {
            System.out.println("Amount exceeds than available balance of wallet!");
            return -1;
        }

        balance-= amount;
        System.out.println("Withdrawn : Rs " + amount + ". Available balance in wallet : " + balance);
        return (int) balance;
    }

    @Override
    public int deposit(int amount) {
        if ((amount > limit())) {
            System.out.println("Amount exceeds than wallet daily limit! Enter value less than Rs " + limit());
            return -1;
        }

        balance += amount;
        System.out.println("Deposited : Rs " + amount + ". Available balance in wallet : " + balance);
        return (int) balance;
    }
}
