package in.co.nmsworks.training.week2.day5;

public class SBIBank extends Bank {

    @Override
    public int rateOfInterest() {
        return 10;
    }

    public static void main(String[] args) {
        SBIBank sbi = new SBIBank();
        sbi.calculateYearlyInterest(10000);
    }
}
