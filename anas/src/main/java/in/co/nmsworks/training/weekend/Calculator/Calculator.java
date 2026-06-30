package in.co.nmsworks.training.weekend.Calculator;

class Calculator {

    void performCalculation(int a, int b, Computable operation) {

        int result = operation.compute(a, b);

        System.out.println("Result = " + result);
    }
}
