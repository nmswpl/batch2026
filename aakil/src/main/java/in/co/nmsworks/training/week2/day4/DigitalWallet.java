package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem{
    private Coin coin;


    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public DigitalWallet(int weight, String color) {
        super(weight, color);
    }

    public void makePayment(){
        coin.spend();
    }
}
