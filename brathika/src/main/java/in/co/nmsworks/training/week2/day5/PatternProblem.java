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

    private void fullPyramid(int row) {
        for (int i = 0; i < row; i++) {
            for (int j = row; j > i ; j--) {
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

    private void invertedLeftAlignedTriangle(int row) {
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void leftAlignedTriangle(int row) {

        for (int i = 1; i <= row ; i++) {
            for (int j = row; j > i; j--) {
                System.out.print("  ");

            }

            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void rightTriangle(int row) {
        for (int i = 0; i <= row; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void invertedRightTriangle(int row) {
        for (int i = row; i >= 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
