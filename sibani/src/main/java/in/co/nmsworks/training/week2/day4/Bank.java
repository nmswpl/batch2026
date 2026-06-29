package in.co.nmsworks.training.week2.day4;

public abstract class Bank {
    public void calculateYearlyInterest(Long principle){
        Double simpleInterest = (double) ((principle * 1 * getRateOfInterest()) / 100);
        System.out.println(" Yearly Simple Interest : " + simpleInterest);
    }

    protected abstract float getRateOfInterest();
}
