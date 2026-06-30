package in.co.nmsworks.training.weekend.Pattern;

public class PatternProblems {

    public static void main(String[] args) {

        numericPattern1();
        System.out.println();

        numericPattern2();
        System.out.println();

        starPattern();
        System.out.println();

        alphabetPattern();
    }


    // Numeric Pattern 1
    static void numericPattern1() {

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }


    // Numeric Pattern 2
    static void numericPattern2() {

        for (int i = 1; i <= 7; i++) {

            for (int j = 7; j >= i; j--) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }


    // Star Pattern
    static void starPattern() {

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }


    // Alphabet Pattern
    static void alphabetPattern() {

        char ch = 'A';

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            ch++;
            System.out.println();
        }
    }
}

