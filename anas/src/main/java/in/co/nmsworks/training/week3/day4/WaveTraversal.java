package in.co.nmsworks.training.week3.day4;

public class WaveTraversal {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printWaveTraversal(arr);
    }

    public static void printWaveTraversal(int[][] arr) {

        int rows = arr.length;
        int cols = arr[0].length;

        for (int col = 0; col < cols; col++) {

            if (col % 2 == 0) {

                for (int row = 0; row < rows; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {

                for (int row = rows - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
