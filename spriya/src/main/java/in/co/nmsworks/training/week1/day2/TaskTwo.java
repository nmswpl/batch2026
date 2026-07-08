package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        System.out.println("The number is:" + n);
        add();
        multiply();
        quotientAndRemainder();
        swapValue();
        evenOrOdd();
        vowelOrConsonant();
        largest();
        positiveOrNegative();
        sumOfNumbers();
        factorial();
        fact();
        multiplyTable();
        fibonacci();
        alpha();
        countInteger();
        powerOfNumber();
        findPrime();
        findFactor();
        checkAlpha();
        int res = recursion(5);
        System.out.println("The factorial using recursion is: " + res);
        sc.close();
    }

    public static void add() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter two numbers:");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("The sum is:" + (num1 + num2));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void multiply() {
        float num1 = 2.0f;
        float num2 = 3.0f;
        System.out.println("The product is:" + (num1 * num2));
    }

    public static void quotientAndRemainder() {
        int num1 = 20;
        int num2 = 3;
        System.out.println("Quotient:" + (num1 / num2));
        System.out.println("Remainder:" + (num1 % num2));
    }

    public static void swapValue() {
        int num1 = 10;
        int num2 = 20;
        System.out.println("--Before Swap--");
        System.out.println("First number:" + num1);
        System.out.println("Second number:" + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("--After Swap--");
        System.out.println("First number:" + num1);
        System.out.println("Second number:" + num2);
    }

    public static void evenOrOdd() {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter number to find even or odd:");
            int num1 = sc.nextInt();
            if (num1 % 2 == 0) {
                System.out.println(num1 + "is even");
            } else {
                System.out.println(num1 + "is odd");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void vowelOrConsonant() {

        char character = 'a';
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println(character + " is vowel");
        } else {
            System.out.println(character + " is consonant");
        }
    }

    public static void largest() {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is largest number");
        } else {
            System.out.println(num3 + " is largest number");
        }
    }

    public static void positiveOrNegative() {
        int num = -10;

        if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    public static void sumOfNumbers() {

        try (Scanner sc = new Scanner(System.in)) {


            System.out.println("Enter number to find sum of first N natural numbers:");
            int num = sc.nextInt();
            int res = 0;
            for (int i = 0; i <= num; i++) {
                res += i;
            }
            System.out.println("Sum: " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void factorial() {


        try (Scanner sc = new Scanner(System.in)) {


            System.out.println("Enter number to find factorial");
            int num = sc.nextInt();
            int res = 1;

            for (int i = num; i > 0; i--) {
                res *= i;

            }

            System.out.println("Factorial of " + num + "is: " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void fact() {


        try (Scanner sc = new Scanner(System.in)) {


            System.out.println("Enter number to find factorial");
            int num = sc.nextInt();
            int res = 1;
            int i = num;
            while (i > 0) {

                res *= i;
                i--;
            }
            System.out.println("Factorial of " + num + "is :" + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void multiplyTable() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " =" + (5 * i));
        }
    }

    public static void fibonacci() {
        System.out.println("Fibonacci Series till 10 terms:");
        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + "," + num2 + ",");
        for (int i = 0; i < 8; i++) {
            int c = num1 + num2;
            num1 = num2;
            num2 = c;
            System.out.print(c + ",");
        }

    }

    public static void alpha() {
        int num = 97;

        for (int i = 0; i < 26; i++) {
            char c = (char) num;
            System.out.print(c + " ");
            num++;
        }
    }

    public static void countInteger() {
        System.out.println("Enter number to count digits:");

        try (Scanner sc = new Scanner(System.in)) {


            int num = sc.nextInt();
            int count = 0;
            while (num > 0) {
                int res = num % 10;
                num /= 10;
                count++;
            }
            System.out.println("No of Digits:" + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void powerOfNumber() {
        System.out.println("Enter base number:");

        try (Scanner sc = new Scanner(System.in)) {


            int base = sc.nextInt();
            System.out.println("Enter Power");
            int power = sc.nextInt();
            int res = 1;
            for (int i = 0; i < power; i++) {
                res *= base;
            }
            System.out.println("Answer: " + res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void findPrime() {
        System.out.print("Enter a number: ");

        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if (num <= 1) {
                System.out.println(num + " is not a prime number");
                return;
            }

            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void findFactor() {
        System.out.println("Factors of 60 are: ");
        for (int i = 1; i <= 60; i++) {
            if (60 % i == 0) {
                System.out.print(i + " ");
            }
        }
    }


    public static void checkAlpha() {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter Alphabet:");
            char character = sc.next().charAt(0);

            int num1 = (int) character;
            int num2 = num1 - 97;
            int num3 = num1 - 65;

            if (num2 >= 0 && num2 <= 25) {
                System.out.println(character + " is Alphabet");
            } else if (num3 >= 0 && num3 <= 25) {
                System.out.println(character + " is Alphabet");
            } else {
                System.out.println(character + " is not Alphabet");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int recursion(int number) {

        if (number == 0 || number == 1) {
            return number;
        } else {
            return number * recursion(number - 1);
        }


    }

}
