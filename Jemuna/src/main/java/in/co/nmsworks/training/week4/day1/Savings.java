package in.co.nmsworks.training.week4.day1;


public class Savings implements Account {
    int limit;
    int balance = 500 ;

    public int getLimit() {
        return limit;
    }

    public int getBalance() {
        return balance;
    }


    @Override
    public int limit() {
        limit = 500;
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        if(amount<=limit && amount<=balance){
            balance-=amount;
            return balance;
        }
        else if(amount>balance) {
            System.out.println("Insufficient Balance...\n"+"Available Balance : "+balance);
        }
        else{
            System.out.println("Withdraw Limit exceeded...");
        }
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if(amount<=limit){
            balance+=amount;
            System.out.println("An amount of "+amount+" has been deposited in your account");
            return balance;
        }
        else{
            System.out.println("Limited Exceeded... ");
        }
        return balance;
    }
}

