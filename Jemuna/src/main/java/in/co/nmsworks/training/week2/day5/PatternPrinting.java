package in.co.nmsworks.training.week2.day5;

public class PatternPrinting {

    public static void main(String[] args) {
        rightTriangle();
        invertedRightTriangle();
        leftAlignTriangle();
        invertedLeftAlignedTriangle();
        fullpyramid();
        numbericPatternOne();
        numbericPatternTwo();
        alphabetPatternThree();

    }

    private static void alphabetPatternThree() {
        System.out.println("Alphabet pattern printing");
        char n= 'G';
        for (char i = 'A'; i <= n ; i++) {
            for (char j = 'A' ; j <=i; j++) {
                System.out.print(i);
            }
            System.out.println(" ");

        }
    }

    private static void numbericPatternTwo() {
        System.out.println("Numeric Pattern Printing 2");
        int n = 7;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i+1 ; j++) {
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }

    private static void numbericPatternOne() {
        System.out.println("Numeric Pattern Printing 2");
        int n = 7;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    private static void fullpyramid() {
        System.out.println("Full pyramid Pattern Printing");
        int n = 5;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1 ; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

    }

    private static void invertedLeftAlignedTriangle() {
        int rows = 7;
        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <rows; j++) {
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    private static void leftAlignTriangle() {
        int rows=5;
        System.out.println("Left Align Triangle");
        for (int i = 0; i <rows; i++) {
            for (int j = rows-1; j >=0 ; j--) {
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    private static void invertedRightTriangle() {
        int rows = 5;
        System.out.println("Inverted Right Triangle");
        for (int i = rows ; i >=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    private static void rightTriangle() {
        System.out.println("Right Triangle");
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
