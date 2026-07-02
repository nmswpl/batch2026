package in.co.nmsworks.training.week3.day4;

public class TwoDArray {
    public static void main(String[] args) {
        TwoDArray array = new  TwoDArray();
        array.printWaveTraversal();
        System.out.println();
        array.printBoundaryTraversal();
    }

    private void printBoundaryTraversal() {
        int r=4,c=4 ,index=0;
        int[][] boundary = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int j = 0; j < c; j++) {
            System.out.print(boundary[0][j] + " ");
        }
        for (int i = 1; i < r; i++) {
            System.out.print(boundary[i][c- 1] + " ");
        }
        for (int j = c - 2; j >= 0; j--) {
            System.out.print(boundary[r - 1][j] + " ");
        }
        for (int i = r - 2; i >= 1; i--) {
            System.out.print(boundary[i][0] + " ");
        }
    }

    private void printWaveTraversal() {
        int r=3 ,c=3 ,index = 0;
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int j = 0; j < matrix[0].length; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            else {
                for (int i = matrix.length - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
