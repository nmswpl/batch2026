package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    public int year =1;
    public abstract double getRateOfInterest();

    public void calculateYearlyInterest(double principalAmount){
        double rate = getRateOfInterest();
        double interestYear = principalAmount* year *rate;
        System.out.println("The interset per year "+interestYear);

    }

}
