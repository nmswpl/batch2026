package in.co.nmsworks.training.week2.day6;

public class Adder implements Computable{
    public void compute(int a, int b) {
        int result = a + b;
        System.out.println("The Addition of a and b is : "+result);
    }
}
