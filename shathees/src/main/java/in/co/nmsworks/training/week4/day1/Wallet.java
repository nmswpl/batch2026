package in.co.nmsworks.training.week4.day1;

public class Wallet implements Account{
    int balance;
    int limit;

    public Wallet(int balance, int limit) {
        this.balance = balance;
        this.limit = limit;
    }

    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        if (amount < balance) {
            balance -= amount;
        } else if (balance < amount) {
            System.out.println("invalid input ");
            return balance;
        } else if (limit() < amount) {
            System.out.println("limit exceeds ");
            return balance;

        }
        return balance;

    }

    @Override
    public int deposit(int amount) {
        if (limit()<amount){
            System.out.println("limit exceeds ");
            return balance;

        }
        balance = balance + amount ;
        return balance;

    }
}
