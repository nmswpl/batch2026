package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account{
    private Integer initialBalance = 0;
    private Integer transactionLimit;

    public SavingsAccount(Integer initialBalance, Integer transactionLimit) {
        this.initialBalance = initialBalance;
        this.transactionLimit = transactionLimit;
    }

    public Integer getInitialBalance() {
        return initialBalance;
    }

    public Integer getTransactionLimit() {
        return transactionLimit;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "initialBalance=" + initialBalance +
                ", transactionLimit=" + transactionLimit +
                '}';
    }

    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > limit()) {
            System.out.println("Transaction limit exceeded");
        }
        if (amount > initialBalance) {
            System.out.println("Insufficient balance");
        }

        return initialBalance -= amount;
    }

    @Override
    public int deposit(int amount) {
        if (amount > limit()) {
            System.out.println("Transaction limit exceeded");
        }
        System.out.println("Amount deposited : +" + amount);
        return initialBalance += amount;
    }
}
