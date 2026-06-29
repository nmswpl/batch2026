package in.co.nmsworks.training.week2.day5;

public class PatternProgram {
    public static void main(String[] args) {

        printRightTriangle(5);
        printInvertedRightTriangle(5);
        printLeftAlignedTriangle(7);
        printInvertedLeftAlignedTriangle(7);
    }

    static void printRightTriangle(int noOfRows){
        for(int i = 1; i <= noOfRows; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void printInvertedRightTriangle(int noOfRows){
        for(int i = noOfRows; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printLeftAlignedTriangle(int noOfRows){

        for(int i = 1; i <= noOfRows; i++){
            for(int j = 1; j <= noOfRows-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void printInvertedLeftAlignedTriangle(int noOfRows){

        for (int i = 0; i < noOfRows; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }

            for (int k = 0; k < noOfRows-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
