package in.co.nmsworks.training.week2.weekend;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if (b == 0){
            System.err.println("Denominator Cant be Zero");
            return 0;
        }
        return a / b;
    }

    @Override
    public String toString() {
        return "Divider";
    }
}
