package in.co.nmsworks.training.week2.day4;

public class Runner {
    public static void main(String[] args) {

        SchoolBag bag = new SchoolBag("Wildcraft", "Java Programming");
        System.out.println(bag.getMaxWeight());
        bag.open();
        bag.study();
        System.out.println(bag.getTextbook());
        System.out.println();

        Coin coin = new Coin(20);
        DigitalWallet wallet = new DigitalWallet(coin);
        wallet.setColor("brown");
        wallet.carry();
        wallet.makePayment();
        System.out.println(wallet);
    }
}
