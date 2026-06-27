package in.co.nmsworks.training.week2.day5;

public class BankRunner {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        IOB iob = new IOB();
        KVB kvb = new KVB();
        System.out.println("SBI Simple Interest: " + sbi.calculateYearlyInterest(50000));
        System.out.println("SBI Simple Interest: " + iob.calculateYearlyInterest(50000));
        System.out.println("SBI Simple Interest: " + kvb.calculateYearlyInterest(50000));
    }
}
