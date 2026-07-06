package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account{

    private double balance;

    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public int limit() {
        return 15000;
    }

    @Override
    public int withdraw(int amount) {
        amount = -amount;
        if ((amount > limit())) {
            System.out.println("Amount exceeds than savings account daily limit! Enter value less than Rs " + limit());
            return -1;
        }
        if ((amount > balance)) {
            System.out.println("Amount exceeds than available balance of savings account!");
            return -1;
        }

        balance-= amount;
        System.out.println("Withdrawn : Rs " + amount + ". Available balance in savings account : " + balance);
        return (int) balance;
    }

    @Override
    public int deposit(int amount) {
        if ((amount > limit())) {
            System.out.println("Amount exceeds than savings account daily limit! Enter value less than Rs " + limit());
            return -1;
        }

        balance += amount;
        System.out.println("Deposited : Rs " + amount + ". Available balance in savings account : " + balance);
        return (int) balance;
    }
}
