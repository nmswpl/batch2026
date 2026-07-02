package in.co.nmsworks.training.week3.day4;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        twoDimensionalArray.waveTraversal();
        twoDimensionalArray.clockWiseBoundaries();
    }

    private void clockWiseBoundaries() {
        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[0][j]+" ");
        }
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i][3]+" ");
        }
        for (int j = array.length-2; j >= 0 ; j--) {
            System.out.print(array[3][j]+" ");
        }
        for (int i = array.length-2; i > 0 ; i--) {
            System.out.print(array[i][0]+" ");
        }
    }

    private void waveTraversal() {
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int j = 0; j < array.length; j++) {
            if(j%2 == 0){
                for (int i = 0; i < array.length; i++){
                    System.out.print(array[i][j]+" ");
                }
            }
            else{
                for (int i = array.length-1; i >= 0; i--){
                    System.out.print(array[i][j]+" ");
                }
            }
        }
        System.out.println();
    }
}
