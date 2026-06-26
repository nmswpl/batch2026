package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    public int n=1;
    public abstract double getRateOfInterest();

    public void calculateyearlyInterset(double principalAmount){
        double rate = getRateOfInterest();
        double interestYear = principalAmount*n*rate;
        System.out.println("The interset per year "+interestYear);

    }

}
