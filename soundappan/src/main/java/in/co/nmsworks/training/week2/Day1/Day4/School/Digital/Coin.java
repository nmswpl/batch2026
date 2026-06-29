package in.co.nmsworks.training.week2.Day1.Day4.School.Digital;

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

    public void spend(){
        System.out.println("Spent a coin of value " +denomination);
    }

    @Override
    public String toString() {
        return "Coin{" +
                "denomination=" + denomination +
                '}';
    }
}
