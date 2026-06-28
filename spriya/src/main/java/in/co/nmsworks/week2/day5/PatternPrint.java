package in.co.nmsworks.week2.day5;

public class PatternPrint {

    private static final int ROWS = 7;

    public void rightTriangle() {

        System.out.println("----Right Triangle----");


        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public void invertedRightTriangle() {

        System.out.println("----Inverted Right Triangle----");
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= (ROWS + 1) - i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public void leftAlignedTriangle() {
        System.out.println("----Left Aligned Triangle----");

        for (int i = 1; i <= ROWS; i++) {
            for (int s = 1; s <= (ROWS - i); s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public void invertedLeftAlignedTriangle() {
        System.out.println("---- Inverted Left Aligned Triangle----");

        for (int i = 1; i <= ROWS; i++) {
            for (int s = 1; s <= (i - 1); s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (ROWS - i) + 1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    public void fullPyramid() {
        System.out.println("----Full Pyramid----");

        for (int i = 1; i <= ROWS; i++) {
            for (int s = 1; s <= (ROWS - i); s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
