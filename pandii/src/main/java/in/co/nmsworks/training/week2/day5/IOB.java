package in.co.nmsworks.training.week2.day5;

public class IOB extends Bank{

    private double rate;

    public IOB(double rate) {
        this.rate = rate;
    }

    @Override
    double rateOfInterest() {
        return rate;
    }
}
