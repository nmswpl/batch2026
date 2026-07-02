package in.co.nmsworks.training.week3.day4;

public class TwoDimensionArrayPractice {
    public static void main(String[] args) {
        TwoDimensionArrayPractice practice = new TwoDimensionArrayPractice();
        practice.waveTraversal();
        practice.boundaryTraversal();
    }

    private void boundaryTraversal() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        for (int i = 0; i < array[0].length; i++) {
            System.out.print(array[0][i]+" ");
        }
        int n = array[0].length;
        for (int i = 1; i < array.length; i++) {
            System.out.print(array[i][n-1]+" ");
        }
        int n1 = array.length;
        for (int i = array.length-2; i >= 0 ; i--) {
            System.out.print(array[n1-1][i]+" ");
        }
        for (int i = array.length-2; i > 0 ; i--) {
            System.out.print(array[i][0]+" ");
        }
    }

    private void waveTraversal() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < col; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < row; j++) {
                    System.out.print(array[j][i]+" ");
                }
            }
            else {
                for (int j = row -1; j >= 0 ; j--) {
                    System.out.print(array[j][i]+" ");
                }
            }

        }
        System.out.println();
    }
}
