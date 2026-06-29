package in.co.nmsworks.training.week2.day5;

public abstract class Bank {

    public Double calYearlyInterest(Double principle){
        Double simpleInterest =  (principle * getRateOfInterest())/100.0 ;
        return simpleInterest;
    }

    public abstract Double getRateOfInterest();

}
