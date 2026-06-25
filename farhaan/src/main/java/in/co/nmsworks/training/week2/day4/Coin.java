package in.co.nmsworks.training.week2.day4;

public class Coin {
    public int denomination;
    public void spend(){
        System.out.println("Spent a coin of value..." + getDenomination());
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public Coin(int denomination) {
        this.denomination = denomination;
    }
}
