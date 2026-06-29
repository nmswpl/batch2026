package in.co.nmsworks.training.week2.Day1.Day4.School.Digital;

public class DigitalWallet {
    private Coin coin;

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public DigitalWallet(Coin coin) {
        this.coin = coin;
    }
    public void makePayment(){
        coin.spend();
    }

    @Override
    public String toString() {
        return "DigitalWallet{" +
                "coin=" + coin +
                '}';
    }
}
