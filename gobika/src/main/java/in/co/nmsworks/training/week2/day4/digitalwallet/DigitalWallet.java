package in.co.nmsworks.training.week2.day4.digitalwallet;

public class DigitalWallet extends PocketItem{
    private Coin coin;
    public DigitalWallet(String color, Coin coin) {
        super(color);
        this.coin = coin;
    }
    public void makePayment(){
        coin.spend();
    }
}
