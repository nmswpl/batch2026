package in.co.nmsworks.training.week2.day5;

public abstract class Bank {

//    private double rateOfInterest;

    double calculateYearlyInterest(double principal)
    {
        return (principal*getRateOfInterest())/100;
    }

    public abstract double getRateOfInterest() ;


}

