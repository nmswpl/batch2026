package in.co.nmsworks.training.week1.day2;
import java.lang.Math;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();
        int largestNum = largestOfThree(firstNum, secondNum , thirdNum);
        System.out.println("The largest of the three numbers is: " + largestNum);

        System.out.println("Enter a number to check if it positive or negative: ");
        int posNum = scanner.nextInt();
        boolean positive = checkPositive(posNum);
        System.out.println("The given number is positive: " + positive);

        System.out.println("Enter a character: ");
        char alpha = scanner.next().charAt(0);
        boolean alphabet = checkAlphabet(alpha);
        System.out.println("The given character is an alphabet: " + alphabet);

        System.out.println("Enter a natural number: ");
        int naturalNumber = scanner.nextInt();
        int resNaturalNumbers = sumNaturalNumbers(naturalNumber);
        System.out.println("Sum of first " + naturalNumber + " numbers is: " + resNaturalNumbers);

        System.out.println("Enter a natural number: ");
        int factNumber = scanner.nextInt();
        int resFactFor = factorialFor(factNumber);
        System.out.println("Factorial is: " + resFactFor);

        System.out.println("Enter a number: ");
        int whileFact = scanner.nextInt();
        int resFactWhile = factorialWhile(whileFact);
        System.out.println("Factorial of 5 is " + resFactWhile);

        System.out.println("Enter a number: ");
        int mulNumber = scanner.nextInt();
        System.out.println("Multiplication table: ");
        multiplicationTable(mulNumber);

        System.out.println("Enter a number: ");
        int fibNumber = scanner.nextInt();
        fibonacciSeries(fibNumber);

        System.out.println("Lowercase alphabet: ");
        printLowercase();
        System.out.println(" ");

        System.out.println("Enter a number: ");
        int countNumber = scanner.nextInt();
        int resDigits = countDigits(countNumber);
        System.out.println("Total no.of digits = " + resDigits);

        int resPow = power(2, 3);
        System.out.println("2^3 is: " + resPow);
        System.out.println("2^3 is: " + Math.pow(2, 3));

        boolean resPrime = isPrime(7);
        System.out.println("7 is prime: " + resPrime);

        findFactors(60);

        int resFactRec = factorialRecursion(6);
        System.out.println("Factorial of 6 is: " + resFactRec);


    }

    //  9. Largest of three numbers
    public static int largestOfThree(int firstNum, int secondNum, int thirdNum){
        int largest = firstNum;
        if (secondNum > thirdNum && secondNum > firstNum){
            largest = secondNum;
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            largest = thirdNum;
        }
        return largest;
    }

    // 10. Check if a number is positve or negative
    public static boolean checkPositive(int num){
        return num > 0;
    }

    // 11. Check if character is alphabet or not
    public static boolean checkAlphabet(char ch){
        int chToNum = (int) ch;
        if (65 <= chToNum && ch <= 122){
            return true;
        } else {
            return false;
        }
    }

    // 12. Sum of natural numbers using for loop
    public static int sumNaturalNumbers(int num){
        int res = 0;
        for (int i = 1; i <= num; i++){
            res += i;
        }
        return res;
    }

    // 13. Factorial using for loop
    public static int factorialFor(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        return fact;
    }

    // 14. Factorial using while loop
    public static int factorialWhile(int num){
        int fact = 1;
        int i = 1;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact;
    }

    // 15. Multiplication table using for loop
    public static void multiplicationTable(int num){
        for (int i = 1; i <= 10; i++){
            int val = num*i;
            System.out.println(num + " * " + i + " = " + val);
        }
    }

    // 16. Fibonacci series using for loop
    public static void fibonacciSeries(int num){
        int a = 0;
        int b = 1;
        System.out.print("1, ");
        for (int i = 2; i <= num; i++){
            int val = a + b;
            System.out.print(val + ", ");
            a = b;
            b = val;
        }
        System.out.println(" ");
    }


    // 17. Lowercase alphabets using fir loop
    public static void printLowercase(){
        for (int i = 97; i <= 122; i++){
            char ch = (char) i;
            System.out.print(ch + " ");
        }
    }

    // 18. No.of digits using while loop
    public static int countDigits(int num){
        int count = 1;
        while (num != 1){
            num = num / 10;
            count++;
        }
        return count;
    }

    // 19. Power of number using for loop
    public static int power(int base, int pow){
        int res = base;
        for (int i = 1; i < pow; i++){
            res *= base;
        }
        return res;
    }

    // 20. Power of number using pow() function
    // 21. Chwck prime number using for loop
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    // 22. Find factors of positive integer
    public static void findFactors(int num){
        System.out.println("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    // 23. Find factorial using recursion
    public static int factorialRecursion(int num){
        if (num <= 1){
            return 1;
        }
        int fact = num * factorialRecursion(num-1);
        return fact;
    }

}
