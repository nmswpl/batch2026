package in.co.nmsworks.training.week2.day4;

public class Runner {
    public static void main(String[] args) {
//        manageSchoolBagExercise();
        manageDigitalWallet();
    }

    private static void manageDigitalWallet() {
        Coin coin = new Coin(10);
        DigitalWallet dw = new DigitalWallet(coin,"Black");
        dw.makePayment();
        dw.carry();
    }

    private static void manageSchoolBagExercise() {
        SchoolBag sb = new SchoolBag("American Tourist",new TextBook("Java Programming"),5.0);
        System.out.println(sb);
        sb.study();
        sb.open();
    }
}
