package in.co.nmsworks.training.week2.day6;

public class Divider implements Computable {
    @Override
    public int compute(int a, int b) {
        if(b==0){
            System.out.println("Division by zero is not possible");
            return -1;
        }
        else{
            int quotient = a/b;
            System.out.println(a + " / " + b + " = " + quotient);
            return quotient;
        }

    }
}
