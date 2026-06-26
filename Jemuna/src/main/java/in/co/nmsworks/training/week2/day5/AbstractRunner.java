package in.co.nmsworks.training.week2.day5;

public class AbstractRunner {
    public static void main(String[] args) {
        bank();
    }

    private static void bank() {
        SBI sbi = new SBI();
        sbi.calculateyearlyInterset(2000);

        IOB iob = new IOB();
        iob.calculateyearlyInterset(3000);

        KVB kvb = new KVB();
        kvb.calculateyearlyInterset(4000);

    }
}
