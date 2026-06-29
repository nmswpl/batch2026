package in.co.nmsworks.training.week2.day6.library;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if(b == 0){
            System.out.println("Division by zero is not allowed");
            return 0;
        }
        return a/b;
    }
}
