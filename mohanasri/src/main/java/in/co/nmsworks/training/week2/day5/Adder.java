package in.co.nmsworks.training.week2.day5;

public class Adder implements Computable{


    @Override
    public int compute(int a, int b){
        System.out.println("Addition");
       return a + b;
    }
}
