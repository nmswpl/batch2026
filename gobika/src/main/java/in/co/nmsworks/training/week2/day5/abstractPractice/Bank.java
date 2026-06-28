package in.co.nmsworks.training.week2.day5.abstractPractice;

public abstract class Bank {
    public void calculateYearlyInterest(long principle){

        double simpleInterest = (double) (principle * rateOfInterest()) /100;
        System.out.println("Simple Interest is : "+simpleInterest);
    }

    public abstract int rateOfInterest();


}
