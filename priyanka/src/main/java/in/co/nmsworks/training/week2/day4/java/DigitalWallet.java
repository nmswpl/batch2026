package in.co.nmsworks.training.week2.day4.java;


public class DigitalWallet extends PocketItem {

    Coin coin;

    public Coin getCoin() {
        return coin;
    }

    public void setCoin(Coin coin) {
        this.coin = coin;
    }

    public DigitalWallet(Coin coin) {
        this.coin = new Coin(coin.getDenomination());
    }

    public void makePayment(){
        coin.spend();
    }


}
