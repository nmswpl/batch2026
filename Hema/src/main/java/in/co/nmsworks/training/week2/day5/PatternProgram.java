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
        System.out.println();

        numberRightTriangle(7);
        System.out.println();

        numberInvertedRightTriangle(7);
        System.out.println();

        starPattern1(7);
        System.out.println();

        alphabetPattern1(27);

    }

    private static void alphabetPattern1(int noOfRows) {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < noOfRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print( string.charAt( i%26 ) + " " );
            }
            System.out.println();
        }
    }

    private static void starPattern1(int noOfRows) {
        for (int i = 1; i <= noOfRows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void numberInvertedRightTriangle(int noOfRows) {
        for (int i = 1; i <= noOfRows ; i++) {
            for (int j = noOfRows; j >= i ; j--) {
                System.out.print(i + " ");

            }
            System.out.println();
        }
    }

    private static void numberRightTriangle(int noOfRows) {

        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private static void fullPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("* ");
            }

            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    private static void invertedLeftAligned(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n - i; j++) {
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
            for (int j = n - i; j > 0; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void invertedRightTriangle(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
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
