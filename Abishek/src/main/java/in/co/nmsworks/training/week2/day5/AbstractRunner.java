package in.co.nmsworks.training.week2.day5;

public class AbstractRunner {
    public static void main(String[] args) {
        bankExample();

    }

    private static void bankExample() {
        Sbi s = new Sbi();
        System.out.println("Intrest of SBI: "+s.calculateIntrest(1000));
        Tmb t = new Tmb();
        System.out.println("Intrest of TMB: "+t.calculateIntrest(1000));
        Iob i = new Iob();
        System.out.println("Intrest of IOB: "+i.calculateIntrest(1000));
    }
}
