package in.co.nmsworks.training.week2.day5;

public class BankAbs {
    public static void main(String[] args) {
        SBI sbi=new SBI(8);
        IOB iob=new IOB(9);
        TMB tmb=new TMB(7.5);
        iob.calInterest(10000.0);
        sbi.calInterest(10000.0);
        tmb.calInterest(10000.0);

    }
}
