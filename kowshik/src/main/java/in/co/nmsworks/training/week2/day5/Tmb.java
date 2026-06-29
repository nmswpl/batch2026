package in.co.nmsworks.training.week2.day5;

public class Tmb extends Bank{

    public Tmb(String bankName) {
        super(bankName);
    }

    @Override
    public double getRateOfInterest() {
        return 7.5;
    }
}
