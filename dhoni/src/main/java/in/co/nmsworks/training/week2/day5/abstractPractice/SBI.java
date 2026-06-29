package in.co.nmsworks.training.week2.day5.abstractPractice;

public class SBI extends Bank{

    private float rateOfInterest;

    public SBI(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    public void setRateOfInterest(float rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public double getRateOfInterest() {
        return rateOfInterest;
    }

}
