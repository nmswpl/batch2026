package in.co.nmsworks.training.week2.weekendPractise;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if(b==0){
            System.out.println("Division by zero is impossible!");
            return 0;
        }

        return a/b;
    }
}
