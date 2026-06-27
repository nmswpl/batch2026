package in.co.nmsworks.training.week2.day5;

public class RunnerBank {
    public static void main(String[] args) {
        Canara canara = new Canara();
        System.out.println(canara.calculateInterest(20000));
        StateBank sbi = new StateBank();
        System.out.println(sbi.calculateInterest(50000));
        KarurVysya kvb = new KarurVysya();
        System.out.println(kvb.calculateInterest(50000));

    }
}
