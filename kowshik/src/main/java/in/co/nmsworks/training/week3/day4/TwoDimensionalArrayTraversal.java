package in.co.nmsworks.training.week3.day4;

public class TwoDimensionalArrayTraversal {
    public static void main(String[] args) {
        TwoDimensionalArrayTraversal arrayTraversal = new TwoDimensionalArrayTraversal();

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        arrayTraversal.printArrayTraversal(arr);
        arrayTraversal.printWaveTraversal(arr);
        arrayTraversal.printBoundaryTraversal(arr);
    }

        public void printBoundaryTraversal(int[][] arr) {

            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(arr[0][col] + " ");
            }

            for (int row = 1; row < arr.length; row++) {
                System.out.print(arr[row][arr[0].length-1] + " ");
            }

            for (int col = arr[0].length - 2; col >= 0; col--) {
                System.out.print(arr[arr.length - 1][col] + " ");
            }

            for (int row = arr.length - 2; row >= 1; row--) {
                System.out.print(arr[row][0] + " ");
            }

    }


    private void printWaveTraversal(int[][] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }

        boolean isTopToBottom = true;

        for (int col = 0; col < arr.length; col++) {
            if (isTopToBottom) {
                for (int row = 0; row < arr[0].length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
                isTopToBottom = false;
            }
            else {
                for (int row = arr[0].length-1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
                isTopToBottom = true;
            }
        }
    }

    private void printArrayTraversal(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
