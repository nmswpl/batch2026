package in.co.nmsworks.training.week2.day5;

public class AbstractRunner {
    public static void main(String[] args) {
        Sbi sbi = new Sbi();
        sbi.calculateYearlyInterest(500000L);
        Iob iob = new Iob();
        iob.calculateYearlyInterest(462000L);
        Kvb kvb = new Kvb();
        kvb.calculateYearlyInterest(56000L);

    }
}
