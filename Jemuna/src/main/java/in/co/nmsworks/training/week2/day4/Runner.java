package in.co.nmsworks.training.week2.day4;

public class Runner {
    public static void main(String[] args) {

        textBook();
        digitalCoinPocket();

    }

    private static void digitalCoinPocket() {

        Coin coins = new Coin(9000);
        DigitalWallet digiWallet = new DigitalWallet(coins);
        digiWallet.color="Pink";
        System.out.println(digiWallet);
        digiWallet.makePayment();
        digiWallet.carry();
    }

    private static void textBook() {

        Textbook textbook = new Textbook("Java Programming");
        SchoolBag sb=new SchoolBag("WildCraft",130,textbook);
        System.out.println(sb);
        sb.open();
        sb.study();
    }
}
