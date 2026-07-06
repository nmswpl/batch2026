package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account {
    int transactionLimit ;
    int initialBalance ;
    int currentBalance = initialBalance;

    public int getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(int transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public SavingsAccount(int transactionLimit, int initialBalance) {
        this.transactionLimit = transactionLimit;
        this.initialBalance = initialBalance;
    }

    @Override
    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        if(transactionLimit > amount) {
            if (currentBalance > amount) {
                System.out.println(" The amount " + amount  + " has been deposited");
                currentBalance -= Math.abs(amount);
                return currentBalance;
            } else {
                System.out.println("There is not enough amount");
                return currentBalance;
            }
        }
        else {
            System.out.println("The amount exceeded transaction limit");
            return currentBalance;
        }
    }

    @Override
    public int deposit(int amount) {
        if (transactionLimit > amount) {
            currentBalance += amount;
            currentBalance += initialBalance;
            System.out.println("The amount " + amount + " has been deposited");
            return currentBalance;
        } else {
            System.out.println("The amount exceeded transaction limit");
            return currentBalance;
        }
    }
}
