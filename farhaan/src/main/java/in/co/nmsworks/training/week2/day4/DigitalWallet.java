package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem{
        public Coin coin;
        public void makePayment(){
            coin.spend();
        }

    public DigitalWallet(String color, Coin coin) {
        super(color);
        this.coin = coin;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }
}
