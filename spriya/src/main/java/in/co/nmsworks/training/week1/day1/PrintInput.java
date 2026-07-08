package in.co.nmsworks.training.week1.day1;

import java.util.Scanner;

public class PrintInput {
    public static void main(String[] args) {

        multiply();
        swapValue();
        oddOrEven();
        vowelOrConsonant();
        quotientAndRemainder();
        add();
        asciiValue();

    }

    public static void add() {

        try (Scanner sc = new Scanner(System.in);) {

            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Sum:" + (a + b));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void multiply() {

        float a = 3.0f;
        float b = 3.0f;
        System.out.println("The product is:" + (a * b));
    }

    public static void quotientAndRemainder() {
        int a = 11;
        int b = 5;
        System.out.println("Quotient:" + (a / b));
        System.out.println("Remainder:" + (a % b));
    }

    public static void swapValue() {

        int a = 10;
        int b = 20;
        System.out.println("-Before swap--");
        System.out.println("First number:" + a);
        System.out.println("Second number:" + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("--After swap--");
        System.out.println("First number:" + a);
        System.out.println("Second number:" + b);
    }

    public static void oddOrEven() {

        try (Scanner sc = new Scanner(System.in);) {

            System.out.println("Enter number:");
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + "is odd");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void vowelOrConsonant() {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter char:");
            char c = sc.next().charAt(0);
            if (c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void asciiValue() {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter char:");
            char c = sc.next().charAt(0);
            int val = (int) c;
            System.out.println("Ascii value:" + val);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
