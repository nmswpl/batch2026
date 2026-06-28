package in.co.nmsworks.training.week2.day5;

public class BankRunner {
    public static void main(String[] args) {
        SBIBank sbi = new SBIBank();
        sbi.calculateYearlyInterest(10000);

        KVBBank kvb = new KVBBank();
        kvb.calculateYearlyInterest(10000);

        BoBBank bob = new BoBBank();
        bob.calculateYearlyInterest(10000);
    }
}
