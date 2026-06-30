package in.co.nmsworks.training.week2.weekendpractice;

public class Divider implements Computable{

    @Override
    public void compute(int a, int b) {
        if(a==0||b==0) {
            System.out.println("Cannot compute");
        }
        else {
            System.out.println("Division of "+a+" / "+b+" "+(a/b));
        }
    }
}
