package in.co.nmsworks.training.week4.day1;

public class Savings implements Account {

    private final int limit = 50000 ;
    private int balance = 500 ;

    public int getLimit() {
        return limit;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdrawn(int amount) {
        if(amount <= getLimit() && amount <= getBalance()){
            balance -= amount;
            System.out.println("An amount of "+amount+" has been withdrawn\nAvailable Balance : "+getBalance());
        }
        else if(amount>=balance) {
            System.out.println("Insufficient Balance...\n"+"Available Balance : "+getBalance());
        }
        else{
            System.out.println("Withdrawn Limit exceeded...");
        }
        return getBalance();
    }

    @Override
    public int deposit(int amount) {
        if(amount<=limit()){
            balance+=amount;
            System.out.println("An amount of "+amount+" has been deposited in your account\nAvailable Balance : "+balance);
        }
        else{
            System.out.println("Deposit Limit Exceeded... ");
        }
        return getBalance();
    }
}
