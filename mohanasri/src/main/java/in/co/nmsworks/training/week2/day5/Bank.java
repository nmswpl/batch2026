package in.co.nmsworks.training.week2.day5;

public abstract class Bank {
    public abstract float rateOfInterest();
    public float calculateInterest(float principle){
        return (principle * 1 * rateOfInterest());
    }

}
