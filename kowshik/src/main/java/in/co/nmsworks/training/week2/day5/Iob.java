package in.co.nmsworks.training.week2.day5;

public class Iob extends Bank {

    public Iob(String bankName) {
        super(bankName);
    }

    @Override
    public double getRateOfInterest() {
        return 7.5;
    }
}
