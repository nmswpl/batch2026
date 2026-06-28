package in.co.nmsworks.training.week2.weekend;

public class Multiplier implements Computable{
    @Override
    public int compute(int a, int b) {
        return a * b;
    }

    @Override
    public String toString() {
        return "Multiplier";
    }
}
