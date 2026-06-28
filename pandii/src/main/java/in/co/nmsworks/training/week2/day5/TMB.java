package in.co.nmsworks.training.week2.day5;

public class TMB extends Bank{

    private double rate;

    public TMB(double rate) {
        this.rate = rate;
    }

    @Override
    double rateOfInterest() {
        return rate;
    }
}
