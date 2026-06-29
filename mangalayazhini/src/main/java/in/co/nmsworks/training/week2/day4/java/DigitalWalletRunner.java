package in.co.nmsworks.training.week2.day4.java;

public class DigitalWalletRunner {
    public static void main(String[] args) {
        Coin myEarnings = new Coin();
        myEarnings.setDenomination(1000);


        DigitalWallet myWallet = new DigitalWallet();
        myWallet.setMyCoins(myEarnings);

        myWallet.getMyCoins();
        myWallet.carry();package in.co.nmsworks.training.week2.day4.java;

public class DigitalWalletRunner {
    public static void main(String[] args) {
        Coin myEarnings = new Coin();
        myEarnings.setDenomination(1000);


        DigitalWallet myWallet = new DigitalWallet();
        myWallet.setMyCoins(myEarnings);

        myWallet.getMyCoins();
        myWallet.carry();

        myWallet.makePayment(450);
        myWallet.makePayment(200);
        myWallet.makePayment(300);
        myWallet.makePayment(75);

        myWallet.getMyCoins();
    }
}


        myWallet.makePayment(450);
        myWallet.makePayment(200);
        myWallet.makePayment(300);
        myWallet.makePayment(75);

        myWallet.getMyCoins();
    }
}
