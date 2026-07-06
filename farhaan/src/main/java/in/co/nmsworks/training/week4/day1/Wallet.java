package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account {
    int transactionLimit ;
    int initialBalance ;

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

    public Wallet(int transactionLimit, int initialBalance) {
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
            if (initialBalance > amount) {
                System.out.println(" The amount " + amount  + " has been deposited");
                initialBalance -= Math.abs(amount);
                return initialBalance;
            } else {
                System.out.println("There is not enough amount");
                return initialBalance;
            }
        }
        else {
            System.out.println("The amount exceeded transaction limit");
            return initialBalance;
        }
    }

    @Override
    public int deposit(int amount) {
        if (transactionLimit > amount) {
            initialBalance += amount;
            System.out.println("The amount " + amount + " has been deposited");
            return initialBalance;
        } else {
            System.out.println("The amount exceeded transaction limit");

            return initialBalance;
        }
    }
}
