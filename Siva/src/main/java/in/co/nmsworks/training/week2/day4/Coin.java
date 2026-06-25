package in.co.nmsworks.training.week2.day4;

public class Coin {
    protected Integer denomination;

    public Coin() {
    }

    public Coin(Integer denomination) {
        this.denomination = denomination;
    }

    public Integer getDenomination() {
        return denomination;
    }

    public void setDenomination(Integer denomination) {
        this.denomination = denomination;
    }

    protected void spend() {
        System.out.println("Payment successful! Spent a coin of value: "+denomination);
    }
}
