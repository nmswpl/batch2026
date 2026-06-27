package in.co.nmsworks.training.week2.day5;

public class Multiplier implements Computable{
    @Override
    public int compute(int a, int b){
        System.out.println("Multiplication");
        return a * b;
    }
}
