package in.co.nmsworks.training.week2.day5.abstractPractice;

public class IOB extends Bank{
    private float rateOfInterest;

    public IOB(float rateOfInterest) {
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
