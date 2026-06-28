package in.co.nmsworks.training.week2.day4.digitalwallet;

public class DigitalRunner {
    public static void main(String[] args) {
        DigitalWallet digitalWallet = new DigitalWallet("Red", new Coin(45));
        digitalWallet.makePayment();
        digitalWallet.carry();

    }
}
