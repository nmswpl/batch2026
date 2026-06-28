package in.co.nmsworks.training.week2.day5.abstractPractice;

public class AbstractRunner {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.calculateYearlyInterest(7000);

        IOB iob = new IOB();
        iob.calculateYearlyInterest(7000);

        KVB kvb = new KVB();
        kvb.calculateYearlyInterest(7000);
    }
}
