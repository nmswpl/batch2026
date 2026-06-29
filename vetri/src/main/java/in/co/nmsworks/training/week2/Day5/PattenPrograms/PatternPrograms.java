package in.co.nmsworks.training.week2.Day5.PattenPrograms;

public class PatternPrograms {

    public static void main(String[] args) {
        System.out.println("--- Pattern Programs ---");
        rightTriangle(7);
        invertedRightTriangle(7);
        leftAlignedTriangle(7);
        invertedLeftAlignedTriangle(7);
        pyramid(7);
        numericalNumberPattern(7);
        numericalNumberPatternReverse(7);
        alphabeticPattern(7);

        System.out.println("\n--- 1) Quotient and Remainder ---");
        computeQuotientAndRemainder(25, 4);

        System.out.println("\n--- 2) Multiply Two Floating-Point Numbers ---");
        multiplyFloatingNumbers(1.5f, 2.0f);

        System.out.println("\n--- 3) Multiples of 7 ---");
        multiplesOfSeven();

        System.out.println("\n--- 4) Factorial Program (Example: 5!) ---");
        factorialProgram(5);

        System.out.println("\n--- 5) Largest Among Three Numbers ---");
        findLargest(12, 45, 23);
    }

    private static void rightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("rightTriangle Completed\n");
    }

    private static void invertedRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("invertedRightTriangle Completed\n");
    }

    private static void leftAlignedTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("leftAlignedTriangle Completed\n");
    }

    private static void invertedLeftAlignedTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Inverted-leftAlignedTriangle Completed\n");
    }

    private static void pyramid(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Pyramid Completed\n");
    }

    private static void numericalNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println("NumericalPattern 1 completed\n");
    }

    private static void numericalNumberPatternReverse(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
        System.out.println("NumericalPattern 2 completed\n");
    }

    private static void alphabeticPattern(int n) {
        char alp = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alp + " ");
            }
            alp++;
            System.out.println("");
        }
        System.out.println("Alphabetic Pattern 2 completed\n");
    }

    // 1) Write a program to compute Quotient and Remainder in Java
    public static void computeQuotientAndRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient=" + quotient);
        System.out.println("Remainder=" + remainder);
    }

    // 2) Write a program to Multiply Two Floating-Point Numbers
    public static void multiplyFloatingNumbers(float num1, float num2) {
        float result = num1 * num2;
        System.out.println("The Result is: " + result);
    }

    // 3) Multiples of 7 Program in Java
    public static void multiplesOfSeven() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }

    // 4) Factorial Program in Java
    public static void factorialProgram(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

    // 5) Write a program to Find Largest Among Three numbers using if..else statement
    public static void findLargest(int a, int b, int c) {
        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println("The largest number among " + a + ", " + b + ", and " + c + " is: " + largest);
    }
}