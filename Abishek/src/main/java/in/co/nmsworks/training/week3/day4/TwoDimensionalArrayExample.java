package in.co.nmsworks.training.week3.day4;

public class TwoDimensionalArrayExample {

        public static void main(String[] args) {
            TwoDimensionalArrayExample td = new TwoDimensionalArrayExample();
            td.printWaveTraversal();
            td.printBoundryTraversal();
        }

        private void printBoundryTraversal() {
            int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

            for (int i = 0; i < arr[0].length; i++) {
                System.out.print(arr[0][i]+" ");
            }

            for (int i = 1; i < arr.length; i++) {
                System.out.print(arr[i][arr[0].length-1]+" ");
            }

            for (int i = arr[0].length - 2; i >= 0; i--) {
                System.out.print(arr[arr.length-1][i]+" ");
            }

            for (int i = arr.length - 2; i >= 1; i--) {
                System.out.print(arr[i][0]+" ");
            }
        }

        private void printWaveTraversal() {
            int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            for (int i = 0; i < arr[0].length; i++) {
                if (i %2 == 0) {
                    for (int j = 0; j < arr.length; j++) {
                        System.out.print(arr[j][i]+" ");
                    }
                }
                else {
                    for (int j = arr.length - 1; j >= 0; j--) {
                        System.out.print(arr[j][i]+" ");
                    }
                }
            }
            System.out.println();
        }
}
