package in.co.nmsworks.training.week3.day4;

public class WaveTraversal {
    public static void main(String[] args) {
        WaveTraversal waveTraversal = new WaveTraversal();
        waveTraversal.traverseTwoDimensionalArray();
    }

    private void traverseTwoDimensionalArray() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        if (arr == null || arr.length == 0) {
            System.out.println("Enter Valid Array ");
        }
        int row = arr.length;
        int col = arr[0].length;
        for ( int j = 0; j < col; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < row; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
