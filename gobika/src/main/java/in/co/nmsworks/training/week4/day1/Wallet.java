package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account{
    private Integer balance ;
    private Integer limit;

    public Wallet(Integer balance, Integer limit) {
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public int limit() {
        return this.limit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount > balance && amount > limit()){
            System.err.println("Invalid amount");
        }
        else {
            balance -= amount;
        }
        return balance;
    }

    @Override
    public int deposit(int amount) {
        if (amount > limit){
            System.err.println("Invalid amount");
        }
        else {
            balance += amount;
        }
        return balance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
