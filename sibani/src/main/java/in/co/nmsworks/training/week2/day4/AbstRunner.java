package in.co.nmsworks.training.week2.day4;

public class AbstRunner {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        System.out.println("SBI BANK : ");
        sbi.calculateYearlyInterest(500000L);
        KVB kvb = new KVB();
        System.out.println("KVB BANK : ");
        kvb.calculateYearlyInterest(500000L);
        IOB iob = new IOB();
        System.out.println("IOB BANK : ");
        iob.calculateYearlyInterest(500000L);

    }

}
