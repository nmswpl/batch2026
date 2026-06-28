package in.co.nmsworks.week2.day5;

public class MainBank {
    public static void main(String[] args) {
        Sbi sbi = new Sbi();
        sbi.calculateYearlyInterest(15000);

        Kvb kvb = new Kvb();
        kvb.calculateYearlyInterest(15000);

        Iob iob = new Iob();
        iob.calculateYearlyInterest(15000);
    }
}
