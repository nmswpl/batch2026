package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    abstract double rateOfInterest();

    public void calInterest(double principal)
    {
        System.out.println((principal*1*rateOfInterest())/100);
    }

}
