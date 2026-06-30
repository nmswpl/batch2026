package in.co.nmsworks.training.weekend.Calculator;

interface Computable {
    int compute(int a, int b);
}


// Adder class
class Adder implements Computable {

    public int compute(int a, int b) {
        return a + b;
    }
}
