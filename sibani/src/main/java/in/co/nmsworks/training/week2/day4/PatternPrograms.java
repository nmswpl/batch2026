package in.co.nmsworks.training.week2.day4;

public class PatternPrograms {
    public static void main(String[] args) {
        PatternPrograms patternPrograms = new PatternPrograms();
        patternPrograms.rightTriangle(7);
        patternPrograms.invertedRightTriangle(5);
        patternPrograms.leftTriangle(5);
        patternPrograms.invertedLeftTriangle(5);
        patternPrograms.fullPyramid(5);
        patternPrograms.numericPattern1(7);
        patternPrograms.numericPattern2(7);
        patternPrograms.alphabetPattern();
    }

    private void alphabetPattern() {
        System.out.println("Alphabet Pattern");
        for (char i = 'A'; i <= 'G' ; i++) {
            for ( char j = 'A'; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private void numericPattern2(int n) {
        System.out.println("Numeric Pattern 2");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private void numericPattern1(int n) {
        System.out.println("Numeric Pattern 1");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    private void fullPyramid(int n) {
        System.out.println("Full Pyramid");
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int l = 1; l <= i ; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void invertedLeftTriangle(int n) {
        System.out.println("Inverted Left Triangle");
        for (int i = n; i >= 1; i--){
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void leftTriangle(int n) {
        System.out.println("Left Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
                for (int k = 0; k < i; k++) {
                    System.out.print("* ");
                }
            System.out.println();
        }
    }

    private void invertedRightTriangle(int n) {
        System.out.println("Inverted Right Triangle");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    private void rightTriangle(int n) {
        System.out.println("Right Triangle : ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
