package in.co.nmsworks.training.week2.day5.task;

public class PatternProgram {
    public static void main(String[] args) {

        leftAlignedTriangle(4);
        leftAlignedTriangleWithNumbers(4);
        leftAlignedTriangleWithAlphabets(4);
        invertedLeftAlignedTriangleWithNumbers(4);
    }

    static void leftAlignedTriangleWithNumbers(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void invertedLeftAlignedTriangleWithNumbers(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print((row+1) + " ");
            }
            System.out.println();
        }
    }

    static void leftAlignedTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void leftAlignedTriangleWithAlphabets(int n) {

        char c = 'A';
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(c + " ");
            }
            c++;
            System.out.println();
        }
    }
}
