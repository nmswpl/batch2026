package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account{
    private int balance=0;
    private int limit=100000;

    public SavingsAccount() {
    }

    public SavingsAccount(int balance, int limit) {
        this.balance = balance;
        this.limit = limit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String
    toString() {
        return "SavingsAccount{" +
                "balance=" + balance +
                ", limit=" + limit +
                '}';
    }

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount<balance){
            balance=getBalance()-amount;
        }

        return balance;
    }

    @Override
    public int deposit(int amount) {
        balance=getBalance()+amount;
        return balance;
    }
}
