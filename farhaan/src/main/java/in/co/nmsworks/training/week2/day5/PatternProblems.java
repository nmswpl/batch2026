package in.co.nmsworks.training.week2.day5;

public class PatternProblems {
    public static void main(String[] args) {
        printRightTriangle(7);
        System.out.println("_________________________");
        printInvertedRightTriangle(7);
        System.out.println("_________________________");
        printLeftAlignedTriangle(6);
        System.out.println("_________________________");
        printInvertedLeftTriangle(3);
        System.out.println("_________________________");
        printPyramid(5);
    }

    private static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2*i) + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printInvertedLeftTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void printLeftAlignedTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printRightTriangle(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printInvertedRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
