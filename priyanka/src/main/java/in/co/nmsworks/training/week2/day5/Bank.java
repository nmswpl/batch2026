package in.co.nmsworks.training.week2.day5;

public abstract class Bank {

    public void calculateYearlyInterest(int principal){
        int interset = (principal * 1 * rateOfInterest())/100;
        System.out.println(interset);
    }
    public abstract int rateOfInterest();
}
