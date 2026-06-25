package in.co.nmsworks.training.week2.day3.inheritance;

public class DigitalWallet extends PocketItem{
    Coin coin;

    public DigitalWallet(Coin coin) {
        this.coin = coin;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    void makePayment(){
        coin.spend();
    }

    @Override
    public String toString() {
        return "DigitalWallet{" +
                "coin=" + coin + super.toString() +
                '}';
    }
}
