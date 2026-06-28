package in.co.nmsworks.training.week2.day5.abstractPractice;

public class PatternProblem {
    public static void main(String[] args) {

        //printRightTriangle(6);
        //printInvertedTriangle(6);
        //printLeftAlignedTriangle(6);
        //printInvertedLeftAlignedTriangle(6);
        //printFullPyramid(6);
    }

    private static void printFullPyramid(int n) {
        System.out.println("Full Pyramid");
        for(int i = 0; i < n; i++){
            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= 2*(i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printInvertedLeftAlignedTriangle(int n) {
        System.out.println("Inverted Left Aligned Triangle");
        for(int i = 0; i < n; i++){
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (n-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printLeftAlignedTriangle(int n) {
        System.out.println("Left Aligned Triangle");
        for(int i = 0; i < n; i++){
            for (int k = 0; k < (n-i); k++) {
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    private static void printInvertedTriangle(int n) {
        System.out.println("Inverted Triangle");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printRightTriangle(int n) {
        System.out.println("Right Triangle");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

}
