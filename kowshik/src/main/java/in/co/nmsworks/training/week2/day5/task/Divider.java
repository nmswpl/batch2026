package in.co.nmsworks.training.week2.day5.task;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if (b == 0) {
            System.out.println("Divisor cannot be zero. Invalid input!");
            return -1;
        }

        return (a/b);
    }
}
