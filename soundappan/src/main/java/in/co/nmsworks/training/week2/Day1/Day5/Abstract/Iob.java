package in.co.nmsworks.training.week2.Day1.Day5.Abstract;

public class Iob extends BankAccount{
    public double getIob_Interest() {
        return iob_Interest;
    }

    public void setIob_Interest(double iob_Interest) {
        this.iob_Interest = iob_Interest;
    }

    public Iob(double principal, double iob_Interest) {
        super(principal);
        this.iob_Interest = iob_Interest;
    }

    public double iob_Interest;

    @Override
    public double getRateOfInterest() {
        return iob_Interest;
    }
}
