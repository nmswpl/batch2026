package in.co.nmsworks.training.week2.day5;

public class PatternProblem {
    public static void main(String[] args) {
        PatternProblem pp = new PatternProblem();
        pp.invertedRightTriangle(5);
        pp.rightTriangle(5);
        System.out.println();
        pp.leftAlignedTriangle(5);
        System.out.println();
        pp.invertedLeftAlignedTriangle(5);
        pp.fullPyramid(5);
    }

    private void fullPyramid(int number1) {
        for (int i = 0; i < number1; i++) {
            for (int j = number1; j > i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void invertedLeftAlignedTriangle(int number1) {
        for (int i = 0; i < number1; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < number1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void leftAlignedTriangle(int number1) {

        for (int i = 1; i <= number1 ; i++) {
            for (int j = number1; j > i; j--) {
                System.out.print("  ");

            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void rightTriangle(int number1) {
        for (int i = 0; i <= number1; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void invertedRightTriangle(int number1) {
        for (int i = number1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
