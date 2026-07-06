package in.co.nmsworks.training.week4.day1;

public class SavingsAccount extends DefaultAccount{


    public SavingsAccount(Integer initialBalance, Integer transactionLimit) {
        this.setInitialBalance(initialBalance);
        this.setTransactionLimit(transactionLimit);
        setBalance(initialBalance);
    }

}
