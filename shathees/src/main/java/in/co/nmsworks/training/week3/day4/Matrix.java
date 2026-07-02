package in.co.nmsworks.training.week3.day4;

public class Matrix {
    public static void main(String[] args) {
        int mat[][] ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("--------Wave----------");
        getWave(mat);
        System.out.println("---------Outer layer-----");
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        getOuterLeyar(matrix);
    }

    private static void getOuterLeyar(int[][] matrix) {
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;


        for (int i = colStart; i <= colEnd; i++) {
            System.out.print(matrix[rowStart][i] + " ");
        }
        rowStart++;


        for (int i = rowStart; i <= rowEnd; i++) {
            System.out.print(matrix[i][colEnd] + " ");
        }
        colEnd--;


        if (rowStart <= rowEnd) {
            for (int i = colEnd; i >= colStart; i--) {
                System.out.print(matrix[rowEnd][i] + " ");
            }
            rowEnd--;
        }


        if (colStart <= colEnd) {
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.print(matrix[i][colStart] + " ");
            }
            colStart++;
        }
    }



    private static void getWave(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[j][i]+" ");

                }
            }else {
                for (int j = mat[i].length -1; j >= 0 ; j--) {
                    System.out.print(mat[j][i]+" ");

                }

            }

        }
    }
}
