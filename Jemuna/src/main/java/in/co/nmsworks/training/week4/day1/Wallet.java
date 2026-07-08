package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account {

    int limit = 50000;
    int balance = 500 ;

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
        if(amount<=limit() && amount<=balance){
            balance-=amount;
            System.out.println("An amount of "+amount+" has been withdrawn\nAvailable Balance : "+balance);
        }
        else if(amount>balance) {
            System.out.println("Insufficient Balance...\n"+"Available Balance : "+balance);
        }
        else{
            System.out.println("Withdrawn Limit exceeded...");
        }
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if(amount<=limit()){
            balance+=amount;
            System.out.println("An amount of "+amount+" has been deposited in your account\nAvailable Balance : "+balance);
            return balance;
        }
        else{
            System.out.println("Deposit Limit Exceeded... ");
        }
        return balance;
    }
}
