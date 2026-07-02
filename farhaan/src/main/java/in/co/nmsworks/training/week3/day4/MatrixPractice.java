package in.co.nmsworks.training.week3.day4;

public class MatrixPractice {
    public static void main(String[] args) {
        MatrixPractice matrix = new MatrixPractice();
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrix.printWaveTraversal(array,array.length,array[0].length);
        System.out.println();
        int[][] newArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        matrix.boundaryTraversal(newArray,newArray.length,newArray[0].length);
    }

    private void boundaryTraversal(int[][] newArray, int rowSize, int columnSize) {
        int i, j=0;
        for (i = 0; j < rowSize; j++){
            System.out.print(newArray[i][j] + " ");
        }
        for (j = 3,i = 1; i < columnSize; i++){
            System.out.print(newArray[i][j] + " ");
        }
        for(i = 3, j =2; j >= 0; j--){
            System.out.print(newArray[i][j] + " ");
        }
        for (i = 2, j = 0; i >= 1; i--) {
            System.out.print(newArray[i][j] + " ");
        }
    }

    private void printWaveTraversal(int[][] array, int rowSize, int columnSize) {
        int i,j = 0;
        for (i = 0; i < rowSize; i++) {
            if(j % 2 == 0){
                for (int k = 0; k <columnSize; k++) {
                    System.out.print(array[k][i] + " ");
                }
                j++;
            }
            else {
                for (int k = columnSize-1; k >=0; k--) {
                    System.out.print(array[k][i] + " ");
                }
                j++;
            }
        }
    }
}
