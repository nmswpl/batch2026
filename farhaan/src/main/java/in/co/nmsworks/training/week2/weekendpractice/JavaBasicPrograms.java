package in.co.nmsworks.training.week2.weekendpractice;

public class JavaBasicPrograms {
    public static void main(String[] args) {
        printQuotientAndRemainder(36,5);
        multiplyFloatNumbers(3.5, 9.3);
        printMultiplicationTable(7);
        printFactorial(5);
        findLargestAmongThree(118, 236, 94);
        numericLeftTriangle(9);
        numericRightTriangle(8);
        printStarPattern(6);
        printAlphabetPattern('E');
    }

    private static void printAlphabetPattern(char rows) {
        for (char i = 'A'; i <= rows; i++) {
            for (char j = 'A'; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    private static void printStarPattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void numericRightTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows-i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }

    private static void numericLeftTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    private static void findLargestAmongThree(int first, int second, int third) {
        if (first > second && first > third) {
            System.out.println(first + " is largest");
        } else if (second > first && second > third) {
            System.out.println(second + " is Largest");
        } else {
            System.out.println(third + " is Largest");
        }
    }

    private static void printFactorial(Integer number) {
        Integer factorial = 1;
        for (Integer i = 2; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("The Factorial of " + number + " is :: " + factorial);
    }

    private static void printMultiplicationTable(Integer number) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }

    private static void multiplyFloatNumbers(double firstNumber, double secondNumber) {
        System.out.println("The Multiplication of the Two Numbers are :: " + firstNumber*secondNumber);
    }

    private static void printQuotientAndRemainder(Integer numerator, Integer denominator) {
        System.out.println("The Quotient is :: " + numerator/denominator + " The Remainder is :: " + numerator%denominator);
    }

}
