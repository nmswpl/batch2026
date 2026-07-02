package in.co.nmsworks.training.week3.day4;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int row = 4,column = 4;
        int[][] array = twoDimensionalArray.createArray(row,column);
        twoDimensionalArray.waveTraversal(array, row, column);
        twoDimensionalArray.borderTraversal(array, row, column);
    }

    private void borderTraversal(int[][] array, int row, int column) {
        System.out.println();
        for(int i = 0; i < column; i++){
            System.out.print(array[0][i] +" ");
        }
        for (int i = 1; i < row; i++){
            System.out.print(array[i][column-1]+" ");

        }
        for(int i = row-2; i >= 0; i-- ){
            System.out.print(array[column-1][i] +" ");
        }
        for (int i = row-2; i > 0; i--){
            System.out.print(array[i][0]+" ");
        }
    }

    private void waveTraversal(int[][] array, int row, int column) {
        for (int j = 0; j < column; j++){
            if (j % 2 == 0){
                for(int i = 0; i < row; i++){
                    System.out.print(array[i][j]+" ");
                }

            }
            else{
                for (int i = row-1; i >= 0; i--){
                    System.out.print(array[i][j]+" ");
                }

            }
        }
    }

    private int[][] createArray(int row, int col) {
        int value = 1;
        int[][] array = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                array[i][j] = value;
                value++;

            }

        }
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.print(array[i][j]+ " ");

            }
            System.out.println();
        }return array;
    }
}
