package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account{
    Integer transactionLimit = 20000;
    Integer initialBalance = 5000;

    @Override
    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        Integer balance = initialBalance;
        if (amount < balance && amount < limit()) {
            balance -= amount;
            System.out.println(balance);
            initialBalance = balance;
            System.out.println(amount+" Amount withdrawed successfully");
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
            System.out.println(amount+" Amount deposited successfully");

        }

        return balance;
    }
}
