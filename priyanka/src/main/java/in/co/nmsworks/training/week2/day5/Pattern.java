package in.co.nmsworks.training.week2.day5;

public class Pattern {
    public static void main(String[] args) {
        rightTriangle(5);
        System.out.println();
        invertedRightTriangle(5);
        System.out.println();
        leftTriangle(5);
        System.out.println();
        invertedLeftTriangle(5);
        System.out.println();
        pyramid(5);
        numericPattern1(5);
        numericPattern2(5);
        alphabetPattern1(5);
    }

    public static void alphabetPattern1(int n) {
        char character = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            character++;
            System.out.println();
        }
    }

    public static void numericPattern2(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void numericPattern1(int n) {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void pyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = i; s < n-1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedLeftTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void leftTriangle(int n) {
        for(int i = 0; i < n; i++){
            for (int s = i; s < n-1; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void invertedRightTriangle(int n) {
        for (int i = n; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
