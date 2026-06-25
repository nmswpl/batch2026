package in.co.nmsworks.training.week2.day4;

public class WalletRunner {
    public static void main(String[] args) {
        Coin coin = new Coin(100);
        DigitalWallet wallet = new DigitalWallet(50, "Black");
        wallet.setColor("Gray");
        wallet.setCoin(coin);
        wallet.carry();
        wallet.makePayment();
    }
}
