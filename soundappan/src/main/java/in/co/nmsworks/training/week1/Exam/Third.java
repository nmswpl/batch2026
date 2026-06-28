package in.co.nmsworks.training.week1.Exam;

/**
 * 3. Given a 3 digit number, write a program to print the hundred position value in words.
 * E.g 1: Input : 542 Output : Five. E.g 2: Input : 777 Output : Seven.
 */
public class Third {
    public static void main(String[] args) {
        int value = 542;
        int hund = value / 100;
        System.out.println("The number is :");
        if (hund == 1) {
            System.out.println("One");
        } else if (hund == 2) {
            System.out.println("Two");
        } else if (hund == 3) {
            System.out.println("Three");
        } else if (hund == 4) {
            System.out.println("Four");
        } else if (hund == 5) {
            System.out.println("Five");
        } else if (hund == 6) {
            System.out.println("Six");
        } else if (hund == 7) {
            System.out.println("Seven");
        } else if (hund == 8) {
            System.out.println("Eight");
        } else if (hund == 9) {
            System.out.println("Nine");
        } else {
            System.out.println("Zero");
        }
    }
}
