package in.co.nmsworks.training.week2.day4;

public class ContainerRunner {
    public static void main(String[] args) {
        Coin c=new Coin(10);
        DigitalWallet dg=new DigitalWallet(c);

        dg.setColor("Brown");
        dg.carry();
        dg.makePayment();
        BagRunner();
    }

    private static void BagRunner() {
        TextBook tb=new TextBook("Java Programming");
        SchoolBag sc=new SchoolBag("Roshan",tb);

        sc.setMaxWeight(200.0);
        System.out.println(sc);
//        System.out.println(sc.getMaxWeight());

        sc.open();
        sc.study();
    }
}
