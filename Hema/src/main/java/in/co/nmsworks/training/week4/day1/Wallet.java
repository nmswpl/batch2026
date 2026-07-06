package in.co.nmsworks.training.week4.day1;

public class Wallet extends DefaultAccount {

    public Wallet(Integer initialBalance, Integer transactionLimit) {
        this.setInitialBalance(initialBalance);
        this.setTransactionLimit(transactionLimit);
        setBalance(initialBalance);
    }


}
