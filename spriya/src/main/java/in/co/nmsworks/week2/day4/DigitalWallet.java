package in.co.nmsworks.week2.day4;

public class DigitalWallet extends PocketItem {

    Coin coin=new Coin();

    int denomination=10;


    public void makePayment(){
        coin.spend(denomination);
    }

}

