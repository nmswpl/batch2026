package in.co.nmsworks.training.week2.day4;

public class Coin {
    private int denomination;

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
        System.out.println(this.denomination);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "denomination=" + denomination +
                '}';
    }
}
