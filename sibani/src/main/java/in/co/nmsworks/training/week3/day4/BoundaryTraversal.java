package in.co.nmsworks.training.week3.day4;

public class BoundaryTraversal {
    public static void main(String[] args) {
        BoundaryTraversal boundaryTraversal = new BoundaryTraversal();
        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };
        boundaryTraversal.printTwoDimensionalArray(arr);
    }

    private void printTwoDimensionalArray(int[][] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Enter Valid Matrix");
        }
        int row = arr.length;
        int col = arr[0].length;
        for (int j = 0; j < col; j++) {
            System.out.print(arr[0][j] + " ");
        }
        for (int i = 1; i < row; i++) {
            System.out.print(arr[i][col-1] + " ");
        }
        for (int j = col - 2; j >=0 ; j--) {
            System.out.print(arr[row-1][j] + " ");
        }
        for (int i = row - 2 ; i > 0 ; i--) {
            System.out.print(arr[i][0] + " ");
        }
    }
}
