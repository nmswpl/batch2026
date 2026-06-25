package in.co.nmsworks.training.week2.day4;

public class Runner {
    public static void main(String[] args) {
        SchoolBag schoolBag1 = new SchoolBag();
        schoolBag1.setMaxWeight(20);
        System.out.println("School Bag's Max weight = "+ schoolBag1.getMaxWeight());
        schoolBag1.open();
        schoolBag1.study();

        Coin coin1 = new Coin(20);
        DigitalWallet digitalWallet = new DigitalWallet(coin1);
        digitalWallet.setColor("Brown");
        System.out.println("Putting the " + digitalWallet.getColor() + " wallet into your Wallet...");
        digitalWallet.carry();
        digitalWallet.makePayment();
    }
}
