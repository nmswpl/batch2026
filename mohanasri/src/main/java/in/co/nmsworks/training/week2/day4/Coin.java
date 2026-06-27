package in.co.nmsworks.training.week2.day4;

public class Coin {
    int denomination;
    void spend(int value){
        System.out.println("Payment successful! Spent a coin of value: "+ value);
    }

    public Coin() {
    }

    public Coin(int denomination) {
        this.denomination = denomination;
    }


    @Override
    public String toString() {
        return "Coin{" +
                "denomination=" + denomination +
                '}';
    }
}

