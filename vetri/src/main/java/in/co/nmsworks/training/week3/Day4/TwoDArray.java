package in.co.nmsworks.training.week3.Day4;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        TwoDArray ta = new TwoDArray();
        System.out.println("____________Wave Traversal__________");
        ta.waveTraversal();
        System.out.println("\n");

        System.out.println("\n");
        System.out.println("_____________BOUNDARY Traversal_______________");
        ta.boundaryTraversal();
    }

    private void boundaryTraversal() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10, 11, 12},
                {13, 14, 15, 16}
        };
        int rowLength = array.length;
        int colLength = array.length;

        for (int col = 0; col < 4; col++) {
            System.out.print(array[0][col] + " ");
        }

        for (int row = 1; row <rowLength; row++) {
            System.out.print(array[row][colLength-1]+" ");
        }

        for (int col= rowLength-2; col >=0; col--) {
            System.out.print(array[colLength-1][col]+" ");
        }

        for (int row = colLength-2; row >=0 ; row--) {
            System.out.print(array[row][0]+" ");
        }

    }

    private void waveTraversal() {
        int[][] waveArray = new int[3][3];
        int counter = 1;
        for (int i = 0; i < waveArray.length; i++) {
            for (int j = 0; j < waveArray[i].length; j++) {
                waveArray[i][j] = counter;
                counter++;
            }
            //System.out.println();
        }
        System.out.println(Arrays.deepToString(waveArray));
        int col = waveArray.length;
        int row = waveArray[0].length;
        for (int column = 0; column < col; column++) {
            if (column % 2 == 0) {
                for (int rows = 0; rows < row; rows++) {
                    System.out.print(waveArray[rows][column] + " ");
                }
            } else {
                for (int rows = row - 1; rows >= 0; rows--) {
                    System.out.print(waveArray[rows][column] + " ");
                }
            }
            //System.out.println();

        }
    }
}

