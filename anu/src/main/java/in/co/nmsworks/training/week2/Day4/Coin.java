package in.co.nmsworks.training.week2.Day4;

public class Coin {
    public int denomination;

    public Coin(int denomination) {
        this.denomination = denomination;
    }

    public void spend(){
        System.out.println("Spent a coin of value..." +"\n" );
    }

    @Override
    public String toString() {
        return "Coin{" + "\n" +
                "denomination=" + denomination + "\n" +
                '}';
    }
}
