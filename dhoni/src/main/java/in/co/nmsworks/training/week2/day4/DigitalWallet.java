package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem{
    private Coin coin;

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

    public void makePayment(){
        System.out.print("Payment successful! Spent a coin of value : ");
        coin.spend();
    }

    @Override
    public String toString() {
        return "DigitalWallet{" +
                "coin=" + coin +
                '}';
    }
}
