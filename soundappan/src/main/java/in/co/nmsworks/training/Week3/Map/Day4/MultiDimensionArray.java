package in.co.nmsworks.training.Week3.Map.Day4;

public class MultiDimensionArray {
    public static void main(String[] args) {
        MultiDimensionArray array = new MultiDimensionArray();
        array.topAndBottomElement();
        array.BoundaryTraversal();
    }

    private void BoundaryTraversal() {
        System.out.println("2. Boundary Traversal");
        int [][]array={
                {1 , 2 , 3 , 4},
                {5 , 6 , 7 , 8},
                {9 , 10 , 11 , 12},
                {13 , 14 , 15 ,16}
        };
        int row = array.length;
        int col= array[0].length;
        for(int i=0;i< col;i++){
            System.out.print(array[0][i]+" ");
        }
        for(int j=1;j<row;j++){
            System.out.print(array[j][col-1]+" ");
        }
        for(int k=col-2;k>=0;k--){
            System.out.print(array[row-1][k]+" ");
        }
        for(int l=row-2;l>=1;l--){
            System.out.print(array[l][0]+" ");
        }
    }

    private void topAndBottomElement() {
        System.out.println("1. Wave Traversal");
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int row = array.length;
        int col = array[0].length;
        for (int i = 0; i < col; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < row; j++) {
                        System.out.print(array[j][i]+" ");
                    }
                }else {
                    for (int p = row - 1; p >= 0; p--) {
                        System.out.print(array[p][i]+" ");
                    }
                }
            }
        System.out.println();
        }
    }

