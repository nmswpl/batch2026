package in.co.nmsworks.training.week2.day4;

public class Runner {
    public static void main(String[] args) {

        SchoolBag sb = new SchoolBag("Wildcard", new TextBook("social"));
        sb.open();
        sb.study();
        Coin c1 = new Coin(10);
        DigitalWallet dw = new DigitalWallet("Blue",c1);
        dw.carry();
        dw.makePayment();
    }
}
