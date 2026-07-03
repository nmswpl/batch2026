package in.co.nmsworks.training.week3.day4;

public class BoundaryTraversal {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printBoundary(arr);
    }

    public static void printBoundary(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;


        for (int col = 0; col < cols; col++) {
            System.out.print(arr[0][col] + " ");
        }


        for (int row = 1; row < rows; row++) {
            System.out.print(arr[row][cols - 1] + " ");
        }


        for (int col = cols - 2; col >= 0; col--) {
            System.out.print(arr[rows - 1][col] + " ");
        }


        for (int row = rows - 2; row >= 1; row--) {
            System.out.print(arr[row][0] + " ");
        }
    }
}