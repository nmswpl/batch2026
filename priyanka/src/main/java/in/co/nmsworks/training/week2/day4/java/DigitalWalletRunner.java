package in.co.nmsworks.training.week2.day4.java;

public class DigitalWalletRunner {
    public static void main(String[] args) {
        Coin coin = new Coin(40);
        DigitalWallet wallet = new DigitalWallet(coin);
        wallet.setColor("Yellow");
        wallet.carry();
        wallet.makePayment();
    }
}
