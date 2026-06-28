package in.co.nmsworks.week2.day6;

public class PatternExercise {

    private static final int ROWS = 7;

    public void patternOne() {
        System.out.println("---PATTERN ONE---");
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    public void patternTwo() {
        System.out.println("---PATTERN TWO---");
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= (ROWS - i) + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    public void patternThree() {
        System.out.println("---PATTERN THREE---");
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
        System.out.println();

    }

    public void patternFour() {
        System.out.println("---PATTERN FOUR---");
        char a = 'A';
        for (int i = 1; i <= ROWS; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
            }
            a++;
            System.out.println(" ");
        }
        System.out.println();
    }
}
