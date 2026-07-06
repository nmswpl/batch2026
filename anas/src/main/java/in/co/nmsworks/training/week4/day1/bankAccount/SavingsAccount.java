package in.co.nmsworks.training.week4.day1.bankAccount;

public class SavingsAccount implements Account{

    int balance;
    int transactionLimit;


    public SavingsAccount(int balance, int transactionLimit) {
        this.balance = balance;
        this.transactionLimit = transactionLimit;
    }

    public int limit() {
        return transactionLimit;
    }

    @Override
    public int withdraw(int amount) {
        if(amount > limit()){
            System.out.println("transaction limit reached");
            return balance;
        }
        else if (amount > balance){
            System.out.println("amount exceeds balance");
            return balance;
        }
        else{
            balance -= amount;
            transactionLimit -= amount;
            return balance;
        }
    }

    @Override
    public int deposit(int amount) {
        if(amount > limit()){
            System.out.println("transaction limit reached");
            return balance;
        }

        else{
            balance += amount;
            transactionLimit -= amount;
            return balance;
        }
    }
}
