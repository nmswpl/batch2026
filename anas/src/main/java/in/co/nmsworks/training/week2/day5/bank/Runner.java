package in.co.nmsworks.training.week2.day5.bank;

public class Runner {
    public static void main(String[] args) {
        SbiBank sbi = new SbiBank();
        sbi.calculateYearlyInterest(100000,5);

        TmbBank tmb = new TmbBank();
        tmb.calculateYearlyInterest(100000,5);

        System.out.println(sbi);
        System.out.println(tmb);
    }
}
