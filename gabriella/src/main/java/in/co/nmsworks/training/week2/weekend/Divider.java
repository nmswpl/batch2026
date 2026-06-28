package in.co.nmsworks.training.week2.weekend;

public class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if (b == 0){
            return -1;
        } else {
            return a/b;
        }
    }
}
