package in.co.nmsworks.training.week2.day6;

public class Multiplier implements Computable{
    public void compute(int a, int b) {
        int result = a * b;
        System.out.println("The Multiplication of a and b is : "+result);
    }

}
