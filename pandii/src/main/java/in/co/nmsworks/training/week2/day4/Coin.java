package in.co.nmsworks.training.week2.day4;

public class Coin {


    private int denomination;

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public Coin(int denomination) {
        this.denomination = denomination;
    }

    void spend()
    {
        System.out.println("Spend a coin value of "+denomination);
    }



}
