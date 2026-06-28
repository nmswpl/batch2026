package in.co.nmsworks.training.week2.day5;

public class SBI extends Bank{
    private double rate;

    public SBI(double rate) {
        this.rate = rate;
    }

    @Override
    double rateOfInterest() {
        return rate;
    }
}
