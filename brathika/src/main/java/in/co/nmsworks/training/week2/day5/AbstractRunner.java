package in.co.nmsworks.training.week2.day5;

public class AbstractRunner {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        s.calculateYearlyInterest(500000L);
        Iob s2 = new Iob();
        s2.calculateYearlyInterest(462000L);
        Kvb s3 = new Kvb();
        s2.calculateYearlyInterest(56000L);

    }
}
