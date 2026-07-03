package in.co.nmsworks.training.week3.day4;

public class TwoDimensionalArrayTraversal {
    public static void main(String[] args) {
        TwoDimensionalArrayTraversal twoDimensionalArrayTraversal = new TwoDimensionalArrayTraversal();
        int[][] numArray = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Wave traversal");
        twoDimensionalArrayTraversal.waveTraversal(numArray);
        System.out.println();
        System.out.println("Boundary traversal:");
        int[][] numArray2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        twoDimensionalArrayTraversal.boundaryTraversal(numArray2);
    }

    private void boundaryTraversal(int[][] numArray) {
        for (int col = 0; col < numArray[0].length; col++){
            System.out.print(numArray[0][col] + " ");
        }
        for (int row = 1; row < numArray.length-1; row++){
            System.out.print(numArray[row][numArray.length-1] + " ");
        }
        for (int col = numArray[0].length-1; col >= 0; col--){
            System.out.print(numArray[numArray.length-1][col] + " ");
        }
        for (int row = numArray.length-2; row >= 1; row--){
            System.out.print(numArray[row][0] + " ");
        }
    }

    private void waveTraversal(int[][] numArray) {
        for (int col = 0; col < numArray[0].length; col++){
            if (col % 2 == 0){
                for (int row = 0; row < numArray.length; row++){
                    System.out.print(numArray[row][col]  + " ");
                }
            } else {
                for (int row = numArray.length - 1; row >= 0; row--){
                    System.out.print(numArray[row][col] + " ");
                }
            }
        }
    }
}
