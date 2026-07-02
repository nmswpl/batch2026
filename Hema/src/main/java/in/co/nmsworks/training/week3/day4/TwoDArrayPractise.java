package in.co.nmsworks.training.week3.day4;

public class TwoDArrayPractise {
    public static void main(String[] args) {
        waveTraversal(3, 3);
        boundaryTraversal(4,4);
    }

    private static void boundaryTraversal(int index1, int index2) {
        int number = 1;
        int[][] twoDArray = new int[index1][index2];

        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < index2; j++) {
                twoDArray[i][j] = number++;
            }
        }

        System.out.println("\nBoundary Traversal : ");
        for (int i = 0; i < index2; i++) {
            System.out.print(twoDArray[0][i] + " ");
        }

        for (int i = 1; i < index1; i++) {
            System.out.print(twoDArray[i][3]+" ");
        }
        for (int i = index2 - 2; i >= 0; i--) {
            System.out.print(twoDArray[3][i] + " ");
        }
        for (int i = index1-2; i > 0 ; i--) {
            System.out.print(twoDArray[i][0]+" ");
        }



    }

    private static void waveTraversal(int index1, int index2) {
        int number = 1;

        int[][] twoDArray = new int[index1][index2];

        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < index2; j++) {
                twoDArray[i][j] = number++;
            }
        }
        System.out.println("Given 2D Array : \n");
        for (int i = 0; i < index1; i++) {
            for (int j = 0; j < index2; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nWave Traversal : ");

        for (int i = 0; i < index1; i++) {

            if (i % 2 == 0)
            {
                for (int j = 0; j < index2; j++) {

                    System.out.print(twoDArray[j][i] + " ");

                }
            }

            else
            {
                for (int j = 2; j >= 0; j--) {
                    System.out.print(twoDArray[j][i] + " ");
                }
            }
        }

        System.out.println();
        
    }
}
