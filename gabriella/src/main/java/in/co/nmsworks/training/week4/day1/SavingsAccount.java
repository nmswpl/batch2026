package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account{
    private Integer balance = 0;
    private Integer limit = 0;

    public SavingsAccount() {
    }

    public SavingsAccount(Integer balance, Integer limit) {
        this.balance = balance;
        this.limit = limit;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override

    public Integer getLimit() {
        return limit;
    }

    @Override
    public Integer deposit(Integer amount) {
        if (amount > getLimit()){
            System.out.println("Amount exceeds limit");
        } else {
            balance += amount;
        }
        return balance;
    }

    @Override
    public Integer withdraw(Integer amount) {
        if (amount > getLimit()){
            System.out.println("Amount exceeds limit");
        } else {
            balance = balance - amount;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "balance=" + balance +
                ", limit=" + limit +
                '}';
    }
}
