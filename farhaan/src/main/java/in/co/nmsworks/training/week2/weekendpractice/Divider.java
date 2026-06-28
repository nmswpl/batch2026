package in.co.nmsworks.training.week2.weekendpractice;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if(b == 0)
        {
            System.out.println("The denominator is zero");
            return 0;
        }
        else {
            return a/b;
        }
    }

    @Override
    public String toString() {
        return "Divider";
    }
}
