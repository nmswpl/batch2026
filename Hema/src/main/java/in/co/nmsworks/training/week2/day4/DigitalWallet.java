package in.co.nmsworks.training.week2.day4;

public class DigitalWallet extends PocketItem{

    private Coin coin;

    public DigitalWallet(Coin coin) {
        this.coin = coin;
    }

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public void makePayment()
    {
        System.out.print("Payment successful!");
        coin.spend();
        System.out.println(coin.getDenomination());
    }
}
