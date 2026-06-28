package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    public void calculateYearlyInterest(Long principal){
        Double simpleInterest = (double) ((principal * 1 * getRateOfInterest() ) / 100);
        System.out.println(simpleInterest);
    }
    public abstract float getRateOfInterest() ;
}

