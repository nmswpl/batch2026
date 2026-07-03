package in.co.nmsworks.training.week3.day4;

public class TwoDArrayPractice {
    public static void main(String[] args) {
        TwoDArrayPractice twoDArrayPractice=new TwoDArrayPractice();
        int [][] num={{1,2,3},{4,5,6},{7,8,9}};
        twoDArrayPractice.traverseBoundary(num);
        twoDArrayPractice.waveTraversal(num);
    }

    private void waveTraversal(int[][] num) {

        for (int i = 0; i < num.length; i++) {
            if(i%2==0) {
                for (int j = 0; j < num[0].length; j++) {
                    System.out.print(num[j][i] + " ");
                }
            }
            else {
                for (int j = num[0].length-1; j >= 0; j--) {
                    System.out.print(num[j][i] + " ");
                }
            }


        }
    }

    private void traverseBoundary(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Case 1: Single Row Matrix
        if (rows == 1) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[0][j] + " ");
            }
            System.out.println();
            return;
        }

        // Case 2: Single Column Matrix
        if (cols == 1) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][0] + " ");
            }
            System.out.println();
            return;
        }

        // Case 3: Standard 2D Matrix (Clockwise Traversal)

        // 1. Print top row (left to right)
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] + " ");
        }

        // 2. Print right column (top to bottom, skipping corners)
        for (int i = 1; i < rows - 1; i++) {
            System.out.print(matrix[i][cols - 1] + " ");
        }

        // 3. Print bottom row (right to left)
        for (int j = cols - 1; j >= 0; j--) {
            System.out.print(matrix[rows - 1][j] + " ");
        }

        // 4. Print left column (bottom to top, skipping corners)
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(matrix[i][0] + " ");
        }

        System.out.println();
    }

}
