package in.co.nmsworks.week2.day5;

public abstract class Bank {
    double simpleInterest;

    abstract double rateOfInterest();

    public void calculateYearlyInterest(double principle) {
        simpleInterest = (principle * 1 * rateOfInterest()) / 100;
        System.out.println("The Interest is :" + simpleInterest);
        System.out.println();
    }
}
