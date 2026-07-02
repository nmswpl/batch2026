package in.co.nmsworks.training.week3.day4.matrix;

public class MatrixPractice {
    public static void main(String[] args) {

        MatrixPractice runner = new MatrixPractice();

        int[][] waveMatrix = {{1,2,3},{4,5,6},{7,8,9}};
        runner.printWave(waveMatrix);

        int[][] boundaryMatrix = { {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        runner.printBoundary(boundaryMatrix);

    }

    private void printBoundary(int[][] boundaryMatrix) {
        int row = boundaryMatrix.length;
        int col = boundaryMatrix[0].length;

        System.out.println("boundary : ");

        for(int i = 0; i < row; i++){
            System.out.print(boundaryMatrix[0][i] + " ");
        }

        for (int j = 1; j < row; j++){
            System.out.print(boundaryMatrix[j][col-1] + " ");
        }

        if(row > 1){
            for(int i = col-1; i >= 0; i--){
                System.out.print(boundaryMatrix[row-1][i] + " ");
            }
        }

        if(col > 1){
            for(int j = row-2; j >= 1; j--){
                System.out.print(boundaryMatrix[j][0] + " ");
            }
        }
    }

    private void printWave(int[][] waveMatrix) {
        int row = waveMatrix.length;
        int col = waveMatrix[0].length;
        int count = 0;
        boolean down = true;

        System.out.println("wave: ");

        while(count < col){

            if(down){
                for(int i  = 0; i < col; i++){
                    System.out.print(waveMatrix[i][count] + " ");
                }
                down = false;
            }
            else{
                for(int i  = col-1; i >= 0; i--){
                    System.out.print(waveMatrix[i][count] + " ");
                }
                down = true;
            }
            count++;
        }

        System.out.println();
    }
}
