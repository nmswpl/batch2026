package in.co.nmsworks.training.week2.day5;

public class Divider implements Computable {
    @Override
    public int compute(int a, int b) {
        System.out.println("Division");
        if (b == 0) {
            System.out.println("invalid data : ");
            return 0;
        }
        else
            return a / b;
    }
}
