package in.co.nmsworks.training.week2.day4;

public class Coin {

    public Coin() {
    }

    public Coin(int denomination) {
        this.denomination = denomination;
    }

    private int denomination;

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public void spend()
    {
        System.out.print("Spent a coin of value...");
    }
}
