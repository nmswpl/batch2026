package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account{
    int balance = 0 ;

    public SavingsAccount(int balance) {
        this.balance = balance;
        System.out.println("Savings Account. Initial balance: "+balance);

    }

    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public int withdraw(int amount) {
        if((-(amount)>limit())||(-(amount)>balance)){
            System.out.println("amount exceeds transaction limit or insufficient money");
            return balance;
        }
        balance = balance + amount;
        System.out.println("Amount withdrawed: "+-(amount));
        System.out.println("Current balance: " + balance);

        return balance;
    }

    @Override
    public int deposit(int amount) {
        if(amount>limit()){
            System.out.println("exceeds transaction");
            return balance;
        }
        balance=balance+amount;
        System.out.println("Amount deposited: "+ amount);
        System.out.println("Current balance: " + balance);

        return balance;
    }
}
