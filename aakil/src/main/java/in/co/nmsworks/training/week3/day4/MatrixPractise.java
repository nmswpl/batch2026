package in.co.nmsworks.training.week3.day4;

public class MatrixPractise {
    public static void main(String[] args) {
        int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {12, 14, 15, 16}
        };
        waveTraversal(matrix);
        boundaryTraversal(matrixA);
    }

    private static void boundaryTraversal(int[][] matrix) {
        System.out.println();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m - 1; i++)
            System.out.print(matrix[0][i] + " ");
        for (int i = 0; i < m - 1; i++)
            System.out.print(matrix[i][n - 1] + " ");
        for (int i = m - 1; i > 0; i--)
            System.out.print(matrix[m - 1][i] + " ");
        for (int i = n - 1; i > 0; i--)
            System.out.print(matrix[i][0] + " ");

    }

    private static void waveTraversal(int[][] matrix) {
        int i = 0;
        int j = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        while (j < m){
            System.out.print(matrix[i][j] + " ");
            if(( i == 0 ) && ( j % 2 == 1)|| (i == n - 1 )&& (j % 2 == 0)){
                ++j;
            }else if (j % 2 == 0){
                i++;
            }else {
                i--;
            }
        }
    }
}
