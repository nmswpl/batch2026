package in.co.nmsworks.training.week2.day4.pocket;

public class Coin {
    private int denomination;

    public Coin(int denomination) {
        this.denomination = denomination;
    }

    public void spend(){
        System.out.println("the amount spend is " + denomination);

    }
}
