package in.co.nmsworks.training.week2.Day1.Day5.Abstract;

public class Sbi extends BankAccount{
private double sbi_Interest;

    public Sbi(double principal, double sbi_Interest) {
        super(principal);
        this.sbi_Interest = sbi_Interest;
    }

    @Override
    public double getRateOfInterest() {
        return sbi_Interest;
    }

    public double getSbi_Interest() {
        return sbi_Interest;
    }

    public void setSbi_Interest(double sbi_Interest) {
        this.sbi_Interest = sbi_Interest;
    }
}
