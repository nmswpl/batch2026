package in.co.nmsworks.training.week2.day4;

public class SchoolBagRunner {
    public static void main(String[] args) {
        bagRunner();
        coinRunner();
    }

    private static void coinRunner() {
        Coin coinObj = new Coin(5);
        DigitalWallet wallet = new DigitalWallet("Red",coinObj);
        wallet.setColor("Blue");
        wallet.carry();
        wallet.makePayment();
    }

    private static void bagRunner() {
        SchoolBag bag = new SchoolBag(2000,"Nike");
        bag.setBook(new Textbook("Java"));
        System.out.println(bag);
        bag.open();
        bag.study();
    }
}
