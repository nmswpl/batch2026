package in.co.nmsworks.training.week2.weekendpractice;

public class Adder implements Computable{

    @Override
    public int compute(int a, int b) {
        return a+b;
    }

    @Override
    public String toString() {
        return "Adder{}";
    }
}
