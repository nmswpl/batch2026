package in.co.nmsworks.training.week1.day2;

public class ProgrammingPracticePatterns {

    public static void main(String[] args) {

        // 9
        System.out.println("Largest = " + greaterInThree(1, 4, 6));

        // 10
        System.out.println("5 is " + positiveNegativeChecker(5));

        // 11
        isAlphabet('*');
        isAlphabet('A');

        // 12
        sumOfNaturalNumbers(100);

        // 13
        factorialFor(10);

        // 14
        factorialWhile(5);

        // 15
        multiplicationTable(5);

        // 16
        fibonacciSeries(10);

        // 17
        printLowercaseAlphabet();

        // 18
        countDigits(1543);

        // 19
        powerUsingLoop(2, 3);

        // 20
        powerUsingPow(2, 3);

        // 21
        checkPrime(29);

        // 22
        findFactors(60);

        // 23
        System.out.println("Result of 6 = " + factorialRecursion(6));

        // 24
        characterFrequency("This website is awesome.", 'e');

        // 25
        countVowelsConsonantsDigitsSpaces("This website is aw3som3.");
    }

    // 9. Largest among three numbers
    public static int greaterInThree(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    // 10. Positive or Negative
    public static String positiveNegativeChecker(int num) {
        if (num > 0) {
            return "Positive";
        } else if (num < 0) {
            return "Negative";
        }
        return "Zero";
    }

    // 11. Check Alphabet
    public static void isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }

    // 12. Sum of Natural Numbers
    public static void sumOfNaturalNumbers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }

    // 13. Factorial using for loop
    public static void factorialFor(int num) {
        long fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }

    // 14. Factorial using while loop
    public static void factorialWhile(int num) {
        int i = 1;
        long fact = 1;

        while (i <= num) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }

    // 15. Multiplication Table
    public static void multiplicationTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    // 16. Fibonacci Series
    public static void fibonacciSeries(int terms) {

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series till " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    // 17. Print lowercase alphabet
    public static void printLowercaseAlphabet() {

        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println();
    }

    // 18. Count digits
    public static void countDigits(int num) {

        int count = 0;

        while (num != 0) {
            num /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }

    // 19. Power using for loop
    public static void powerUsingLoop(int base, int power) {

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= base;
        }

        System.out.println("Answer = " + result);
    }

    // 20. Power using Math.pow()
    public static void powerUsingPow(int base, int power) {

        double result = Math.pow(base, power);

        System.out.println("Answer = " + (int) result);
    }

    // 21. Prime Number
    public static void checkPrime(int num) {

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // 22. Factors of a number
    public static void findFactors(int num) {

        System.out.print("Factors of " + num + " are: ");

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }

    // 23. Factorial using recursion
    public static int factorialRecursion(int num) {

        if (num == 0 || num == 1) {
            return 1;
        }

        return num * factorialRecursion(num - 1);
    }

    // 24. Frequency of character
    public static void characterFrequency(String str, char target) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Frequency of " + target + " = " + count);
    }

    // 25. Count vowels, consonants, digits and spaces
    public static void countVowelsConsonantsDigitsSpaces(String str) {

        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            else if (ch == ' ') {
                spaces++;
            }
        }

        System.out.println("V: " + vowels);
        System.out.println("C: " + consonants);
        System.out.println("D: " + digits);
        System.out.println("W: " + spaces);
    }
}