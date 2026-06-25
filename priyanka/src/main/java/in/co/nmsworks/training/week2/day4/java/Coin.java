package in.co.nmsworks.training.week2.day4.java;

public class Coin {
    private int denomination = 10;

    public Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public void spend(){
        System.out.println("Payment successful!! Spent a value: " + denomination);
    }

}
