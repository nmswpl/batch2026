package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    abstract double rateOfInterest();
    public double calculateYearlyInterest(Integer p){
        return (p*rateOfInterest())/100;
    }
}
