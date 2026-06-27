package in.co.nmsworks.training.week2.Practice;

public class Divider implements Computable{
    @Override
    public void compute(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return;
        }
        int c = a / b;
        System.out.println("Divider of " + a + " and " + b + " is  : " + c);
    }
}
