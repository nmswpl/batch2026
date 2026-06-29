package in.co.nmsworks.training.week2.day5.pattern;

public class PatternPrinting {
    public static void main(String[] args) {
        rightTriangle();
        invertedRightTriangle();
        leftAlignedTriangle();
        invertedLeftAlignedTriangle();
        fullPyramid();
    }

    private static void fullPyramid() {
        int n = 5;
        System.out.println("-----------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    private static void invertedLeftAlignedTriangle() {
        int n = 5;
        System.out.println("-----------------------------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    private static void leftAlignedTriangle() {
        int n = 5;
        System.out.println("-----------------------------");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedRightTriangle() {
        int n = 5;
        System.out.println("-----------------------------");
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void rightTriangle() {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
