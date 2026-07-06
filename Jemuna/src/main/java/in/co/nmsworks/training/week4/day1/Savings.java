package in.co.nmsworks.training.week4.day1;

public class Savings implements Account{
    int availableBalance =500;
    @Override
    public int limit() {
        int maxLimit = 50000;
        return maxLimit;
    }

    @Override
    public int withdraw(int amount) {
        if(amount<=limit() && amount<=availableBalance){
            availableBalance -= amount;
            System.out.println("An amount of "+amount+" withdrawn successfully...");
            System.out.println("Available Balance :"+availableBalance);
        }
        return availableBalance;
    }

    @Override
    public int deposit(int amount) {
        if(amount<=limit()){
            availableBalance += amount ;
            System.out.println("An amount of "+amount+" has been deposited into your account Successfully...");
            System.out.println("Available Balance :"+availableBalance);
        }
        return availableBalance;
    }
}
