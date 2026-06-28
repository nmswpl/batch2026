package in.co.nmsworks.training.week2.day5;

public class PatternPrograms {
    public static void main(String[] args) {
        rightTriangle(7);
        invertedRightTriangle(4);
        leftAlignedTriangle(4);
        invertedLeftAlignedTriangle(3);
        fullPyramid(5);
        numericPattern(7);
        invertedNumericPattern(7);
        alphabeticPattern(5);

    }

    private static void alphabeticPattern(int num) {
        System.out.println("Alphabetic Pattern");
        char ch = 'A';
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch ++;
            System.out.println();
        }
    }

    private static void invertedNumericPattern(int num) {
        System.out.println("Inverted Numeric Pattern");
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i ; j--) {
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }

    private static void numericPattern(int n) {
        System.out.println("Numeric Pattern..");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private static void fullPyramid(int n) {
        System.out.println("Full Pyramid");
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void invertedLeftAlignedTriangle(int n) {
        System.out.println("Inverted Left-Aligned Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = i; k < n ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void leftAlignedTriangle(int n) {
        System.out.println("Left-Aligned Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = n; j >i ; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void invertedRightTriangle(int n) {
        System.out.println("Inverted Right Triangle");
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rightTriangle(int n) {
        System.out.println("Right Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
