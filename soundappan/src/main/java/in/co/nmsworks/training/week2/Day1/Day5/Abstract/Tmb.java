package in.co.nmsworks.training.week2.Day1.Day5.Abstract;

public class Tmb extends BankAccount{
    private double twb_Interest;

    public double getTwb_Interest() {
        return twb_Interest;
    }

    public void setTwb_Interest(double twb_Interest) {
        this.twb_Interest = twb_Interest;
    }

    public Tmb(double principal, double twb_Interest) {
        super(principal);
        this.twb_Interest = twb_Interest;
    }

    @Override
   public double getRateOfInterest() {
        return twb_Interest;
    }
}
