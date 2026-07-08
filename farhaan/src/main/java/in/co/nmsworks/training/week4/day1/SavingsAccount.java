package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account {
    int transactionLimit ;
    int balance;


    public SavingsAccount(int transactionLimit, int balance) {
        this.transactionLimit = transactionLimit;
        this.balance = balance;
    }

    @Override
    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        if(transactionLimit > amount) {
            if (balance > (amount * -1)) {
                System.out.println(" The amount " + amount  + " has been withdrawn");
                balance -= (amount * -1);
                return balance;
            } else {
                System.out.println("There is not enough amount");
                return balance;
            }
        }
        else {
            System.out.println("The amount exceeded transaction limit");
            return balance;
        }
    }

    @Override
    public int deposit(int amount) {
        if (transactionLimit > amount) {
            balance += amount;
            System.out.println("The amount " + amount + " has been deposited");
            return balance;
        } else {
            System.out.println("The amount exceeded transaction limit");

            return balance;
        }
    }

    @Override
    public int getBalance() {
        return balance;
    }
}
