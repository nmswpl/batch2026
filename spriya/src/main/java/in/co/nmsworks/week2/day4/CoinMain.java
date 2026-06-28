package in.co.nmsworks.week2.day4;

public class CoinMain {
    public static void main(String[] args) {
        Coin c=new Coin();
        DigitalWallet d=new DigitalWallet();
        System.out.println("Putting a "+(d.color="brown")+"  wallet into your pocket");
        d.makePayment();
    }
}
