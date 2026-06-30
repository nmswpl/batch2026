package in.co.nmsworks.training.week2.day5;

public class NestedFor {

    public static void main(String[] args) {

        rightTriangle();
        invertedRightTriangle();
        leftAllignedTriangle();
        invertedLeftTriangle();
        fullPyramid();
    }

    private static void fullPyramid() {

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2-1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedLeftTriangle() {
        for (int i = 1; i <=7 ; i++)
        {
            for (int j = 0; j <= 7-i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void leftAllignedTriangle() {

        for (int i = 1; i <=7 ; i++)
        {
            for (int j = 1; j <= 7-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void invertedRightTriangle() {

        for (int i = 6; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void rightTriangle() {

        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j <= i;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
