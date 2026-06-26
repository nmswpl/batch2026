package in.co.nmsworks.training.week2.day4;

public class Runner {
    public static void main(String[] args) {
        String bagName = "roshan";
        SchoolBag schoolBag = new SchoolBag(5,bagName,new TextBook("Java Programming"));
        System.out.println(schoolBag);

        String walletColor = "red";
        DigitalWallet digitalWallet = new DigitalWallet(walletColor,new Coin(100));
        digitalWallet.carry();
        digitalWallet.makePayment();
    }

}

