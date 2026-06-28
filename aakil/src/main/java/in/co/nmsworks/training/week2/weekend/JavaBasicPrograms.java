package in.co.nmsworks.training.week2.weekend;

public class JavaBasicPrograms {
    public static void main(String[] args) {
        computeQuotientAndRemainder(6, 1);
        multiplyFloats(1.5, 1.5);
        printMultiples(7);
        factorial(5);
        largestOfThree(23, 19, 45);

        numericPattern(5);
        invertedNumericPattern(5);
        starPattern(5);
        alphaPattern(7);
    }

    private static void alphaPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print((char)('A' + i));
            }
            System.out.println();
        }
    }

    private static void starPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedNumericPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }

    private static void numericPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    private static void largestOfThree(int first, int second, int third) {
        System.out.println("LARGEST OF 3 :: ");
        if(first > second && first > third){
            System.out.println(first);
        }else {
            if (second > third)
                System.out.println(second);
            else
                System.out.println(third);
        }
    }

    private static void factorial(int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= i + 1;
        }
        System.out.println("FACTORIAL :: " + res);
    }

    private static void printMultiples(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    private static void multiplyFloats(double num1, double num2) {
        System.out.println(num1 * num2);
    }

    private static void computeQuotientAndRemainder(int numerator, int denominator) {
        System.out.println("QUOTIENT :: " +  (numerator / denominator));
        System.out.println("REMAINDER :: " + (numerator % denominator));
    }
}
