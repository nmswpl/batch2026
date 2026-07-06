package in.co.nmsworks.training.week4.day1;

public class SavingsAccount implements Account{
    int initialBalance = 1000;
    int limit = 50000;


    @Override
    public int limit() {
        return limit;
    }

    @Override
    public int withdraw(int amount) {
        if(amount > limit && amount > initialBalance){
            System.out.println("Can't withdraw ");
            return initialBalance;
        }
        else {
            initialBalance = initialBalance - amount;
            System.out.println(amount + " Withdrawed");
            System.out.println("Available balance : " + initialBalance);
            return initialBalance;
        }
    }

    @Override
    public int deposit(int amount) {
        if (amount > limit) {
            System.out.println("Can't deposit");
            return initialBalance;
        } else {
            initialBalance += amount;
            System.out.println(amount+ " Amount deposited successfully!!");

            return initialBalance;
        }
    }
}
