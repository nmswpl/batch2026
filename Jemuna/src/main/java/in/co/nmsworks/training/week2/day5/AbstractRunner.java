package in.co.nmsworks.training.week2.day5;

public class AbstractRunner {
    public static void main(String[] args) {
        bank();
    }

    private static void bank() {
        SBI sbi = new SBI();
        sbi.calculateYearlyInterest(2000);

        IOB iob = new IOB();
        iob.calculateYearlyInterest(3000);

        KVB kvb = new KVB();
        kvb.calculateYearlyInterest(4000);

    }
}
