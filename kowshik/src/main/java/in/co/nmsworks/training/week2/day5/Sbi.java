package in.co.nmsworks.training.week2.day5;

public class Sbi extends Bank{

    public Sbi(String bankName) {
        super(bankName);
    }

    @Override
    public double getRateOfInterest() {
        return 7;
    }
}
