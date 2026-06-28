package in.co.nmsworks.training.week2.weekendpractice;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if (b == 0){
            System.err.println("div by zero error....");
            return 0;
        }
        return  a/b;
    }

    @Override
    public String toString() {
        return "Divider{}";
    }
}
