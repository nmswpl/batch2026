package in.co.nmsworks.training.week2.day5;

public class PatternProgram {
    public static void main(String[] args) {
        rightTriangle(3);
        System.out.println();

        invertedRightTriangle(3);
        System.out.println();

        leftAlignedTriangle(3);
        System.out.println();

        invertedLeftAligned(3);
        System.out.println();

        fullPyramid(10);
    }

    private static void fullPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int k = 1; k <= (i*2)-1; k++) {
                System.out.print("* ");
            }

            for (int j = n-i; j > 0; j--) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    private static void invertedLeftAligned(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void leftAlignedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void invertedRightTriangle(int n) {
        for (int i = n; i > 0 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
