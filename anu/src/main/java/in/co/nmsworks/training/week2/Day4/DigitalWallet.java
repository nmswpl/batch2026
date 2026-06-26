package in.co.nmsworks.training.week2.Day4;

public class DigitalWallet extends PocketItem{
    private Coin coin;

    public DigitalWallet(String color, Coin coin) {
        super(color);
        this.coin = coin;
    }

    public void makePayment(){
        coin.spend();
    }

    @Override
    public String toString() {
        return "DigitalWallet{" + "\n" +
                "coin=" + coin + "\n" +
                ", color='" + color + '\'' +
                '}';
    }
}
