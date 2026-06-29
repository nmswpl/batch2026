package in.co.nmsworks.training.week2.day5;

public class Patterns {
    public static void main(String[] args) {
        Patterns p = new Patterns();
        System.out.println("-------------------------------------");
        p.printRightAngleTraingle(7);
        System.out.println("-------------------------------------");
        p.printInvertedRightAngleTraingle(7);
        System.out.println("-------------------------------------");
        p.printAlignedTraingle(7);
        System.out.println("-------------------------------------");
        p.printInvertedAlignedTraingle(7);
        System.out.println("-------------------------------------");
        p.printFullPyramid(7);
        System.out.println("-------------------------------------");
        p.printNumericPattern1(7);
        System.out.println("-----------------------------------");
        p.printNumericPattern2(7);
        System.out.println("-----------------------------------");
        p.printStarPattern(7);
        System.out.println("-----------------------------------");
        p.printAlphabetPattern(7);
    }
    private void printAlphabetPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((char) (i+64)) + " ");
            }
            System.out.println();
        }
    }

    private void printStarPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void printNumericPattern2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i+1; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private void printNumericPattern1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    private void printInvertedAlignedTraingle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printFullPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printAlignedTraingle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printInvertedRightAngleTraingle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private void printRightAngleTraingle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
