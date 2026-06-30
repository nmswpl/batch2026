package in.co.nmsworks.training.weekend.Calculator;

class Divider implements Computable {

    public int compute(int a, int b) {

        if(b == 0) {
            System.out.println("Cannot divide by zero");
            return -1;
        }

        return a / b;
    }
}
