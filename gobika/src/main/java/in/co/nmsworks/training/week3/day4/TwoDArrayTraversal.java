package in.co.nmsworks.training.week3.day4;

public class TwoDArrayTraversal {
    public static void main(String[] args) {
        TwoDArrayTraversal traversal = new TwoDArrayTraversal();
        traversal.waveTraversal();
        traversal.boundaryTraversal();
    }

    private void boundaryTraversal() {
        int[][] twoDArray = {{1, 2, 3, 4}, {5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
        System.out.println("\nBoundary traversal : ");
        for (int i = 0; i < twoDArray[0].length; i ++ ) {
            System.out.print(twoDArray[0][i]+" ");
        }
        for (int i = 1; i < twoDArray.length; i++) {
            System.out.print(twoDArray[i][twoDArray[i].length-1]+" ");
        }
        for (int i = twoDArray.length-2; i > 0; i--) {
            System.out.print(twoDArray[twoDArray.length-1][i]+" ");
        }
        for (int i = twoDArray.length-1; i > 0 ; i--) {
            System.out.print(twoDArray[i][0]+" ");
        }

    }

    private void waveTraversal() {
        int[][] twoDArray = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        for (int i = 0; i < twoDArray.length; i++) {
            if (i % 2 == 0){
                for (int j = 0; j < twoDArray[i].length; j++) {
                    System.out.print(twoDArray[j][i]+" ");
                }
            }
            else {
                for (int j = twoDArray.length-1; j >= 0; j--) {
                    System.out.print(twoDArray[j][i]+" ");
                }
            }
        }
    }
}

