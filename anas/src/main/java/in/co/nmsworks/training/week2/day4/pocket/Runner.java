package in.co.nmsworks.training.week2.day4.pocket;

public class Runner {
    public static void main(String[] args) {
        DigitalWallet d1 = new DigitalWallet();
        d1.carry();
        Coin c1 = new Coin(1000);
        d1.setC(c1);

        d1.makePayment();

    }
}
