package in.co.nmsworks.training.week2.Day1.Day4.School.Digital;

public class Runner {
    public static void main(String[] args) {
        DigitalWallet d1=new DigitalWallet(new Coin(5));
        PocketItem p1=new PocketItem(new Coin(10),"Red");
        p1.carry();
        d1.makePayment();
    }


}
