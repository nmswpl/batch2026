package in.co.nmsworks.week3.day4;

public class TwoDArray {
    public static void main(String[] args) {
        waveTraversal();
        boundaryTraversal();

    }

    private static void boundaryTraversal() {

        System.out.println("Boundary Traversal");
        int[][] b = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int j = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print(b[0][i] + " ");
        }

        for (int i = 1; i < 4; i++) {
            System.out.print(b[i][3] + " ");
        }

        for (j = 2; j >= 0; j--) {
            System.out.print(b[3][j] + " ");
        }

        for (int i = 2; i >= 1; i--) {
            System.out.print(b[i][0] + " ");
        }
    }


    private static void waveTraversal() {

        System.out.println("Wave Traversal");
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < 3; i++) {
            System.out.print(a[i][0] + " ");
        }
        for (int i = 2; i >= 0; i--) {
            System.out.print(a[i][1] + " ");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i][2] + " ");
        }
    }
}
