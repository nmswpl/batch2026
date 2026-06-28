package in.co.nmsworks.training.week2.day6;

public class PatternProblem {
    public static void main(String[] args) {
        printNumberRightTriangle(7);
        printReverseNumberTriangle(7);
        printAlphabetTriangle(7);
        printRightTriangle(7);
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

    private static void printAlphabetTriangle(int n) {
        System.out.println("Alphabet Triangle");
        char letter = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(letter);
            }
            System.out.println();
            letter++;
        }
        System.out.println();
    }

    private static void printReverseNumberTriangle(int n) {
        System.out.println("Reverse Number Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i) ; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void printNumberRightTriangle(int n) {
        System.out.println("Number Right Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
}
