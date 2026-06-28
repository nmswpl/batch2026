package in.co.nmsworks.training.week2.day5;

public class Pattern {
    public static void main(String[] args) {

        rightTriangle();
        invertedRightTriangle();
        leftAlignedTriangle();
        invertedLeftAlignedTriangle();
        pyramid();
        numericPattern();
        numericPattern2();
        alphabetPattern();
    }

    private static void alphabetPattern() {
        int n=6;
        char ch='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
    }

    private static void numericPattern2() {
        int n=6;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n-i ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void numericPattern() {
        int n=6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void pyramid() {
        int n=7;
        System.out.println("Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i*2) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void leftAlignedTriangle() {
        int noOfRows=6;
        System.out.println("Left Aligned Triangle");
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= noOfRows-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedLeftAlignedTriangle() {
        System.out.println("Inverted left aligned triangle");
        int noOfRows=6;
        for (int i = 1; i <= noOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = noOfRows; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedRightTriangle() {
        int n=5;
        System.out.println("Inverted Right Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rightTriangle() {
        int n=5;
        System.out.println("Right Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
