package in.co.nmsworks.training.week2practices;

class Divider implements Computable{
    @Override
    public int compute(int a, int b) {
        if(b==0) {
            return 0;
        }
        return a/b;
    }

}
