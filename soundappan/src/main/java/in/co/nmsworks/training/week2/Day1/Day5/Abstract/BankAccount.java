package in.co.nmsworks.training.week2.Day1.Day5.Abstract;

public abstract class BankAccount {
    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public BankAccount(double principal) {
        this.principal = principal;
    }

    private double principal;

    public abstract double getRateOfInterest();
    public double calculateInterestForYear(){
        return (principal*getRateOfInterest())/100;
    }
}
