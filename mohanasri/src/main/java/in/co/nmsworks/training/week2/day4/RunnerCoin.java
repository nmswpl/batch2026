package in.co.nmsworks.training.week2.day4;

public class RunnerCoin {
    public static void main(String[] args) {
//        PocketItem pi = new PocketItem();
//        System.out.println(pi);
        DigitalWallet dw = new DigitalWallet("Gold", new Coin(10));
        dw.carry();
        dw.makePayment(500);

    }
}
