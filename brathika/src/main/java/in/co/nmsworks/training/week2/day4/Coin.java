package in.co.nmsworks.training.week2.day4;

public class Coin {
    private Integer denomination;

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
    public void spends() {
        System.out.println("Spent a coin of value: "+denomination);
    }

}
