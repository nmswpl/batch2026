package in.co.nmsworks.training.week2.day5;

public abstract class Bank {


    protected Double calculateYearlyInterest(Double principle) {
        return (principle * getRateOfInterest()) / 100 ;
    }
    protected abstract Double getRateOfInterest();
}
