package in.co.nmsworks.training.week2.day4.java;

public class DigitalWallet extends PocketItem{
    // Inhertied Attributes
    // color
    // price

    private Coin myCoins ;

    public Coin getMyCoins() {
        System.out.println("The Digital wallet has Rs. "+myCoins.getDenomination());
        return myCoins;
    }

    public void setMyCoins(Coin myCoins) {
        this.myCoins = myCoins;
    }

    public void makePayment(Integer amount){
        myCoins.spent(amount);
    }

    public void carry(){
        System.out.println("Items is carried by the Digital Wallet.");
    }


}
