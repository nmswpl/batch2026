package in.co.nmsworks.training.week2.day4;

public class Coin {

    public int denomination;

    public Coin(int denomination) {
        this.denomination = denomination;
    }

    public void spend(){
        System.out.println("Spend a coin of value...");
    }
}
