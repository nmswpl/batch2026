package in.co.nmsworks.training.week2.Day5;

public class abstractRunner {
    public static void main(String[] args) {
        Sbi sbi=new Sbi();
        Iob iob=new Iob();
        Kvb kvb=new Kvb();

        System.out.println("Rate Of Interest......");
        bankMethod(kvb);
        bankMethod(sbi);
        bankMethod(iob);

        System.out.println("Simple Interest for All Bank....");
        sbi.calculateYearlyInterest(10000);
        iob.calculateYearlyInterest(10000);
        kvb.calculateYearlyInterest(10000);
    }

    private static void bankMethod(Bank bank) {
        bank.rateOfInterest();
    }


}
