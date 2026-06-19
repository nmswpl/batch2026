package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class ControlStructureProblems {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        largestOfThree(63,3,5);
        checkNumberSign(97);
        checkAlpha('a');
        sumOfNaturalSeries();
        factorial(5);
        multiples(6);
        fibonacci(10);
        lowerAlphaPrinter();
        countDigits(1345);
        exponent();
        builtInExponent();
        checkPrime();
        factorsOfANumber();

        int res = recursiveFactorial(5);
        System.out.println("Factorial =  " + res);

        frequencyOfChar();
        countStats();
    }

    public static void largestOfThree(int first, int second, int third){
        if(first < second && first < third){
            if (second > third){
                System.out.println(second + " is Largest");
            }else{
                System.out.println(third + " is Largest");
            }
        }else{
            System.out.println(first + " is Largest");
        }
    }

    public static void checkNumberSign(int num){
        if (num > 0){
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        }
    }

    public static void checkAlpha(char ch){
        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is an Alphabet");
        }else{
            System.out.println(ch + " is not an Alphabet");
        }
    }

    public static void sumOfNaturalSeries(){
        System.out.println("Enter a number : ");
        int range = in.nextInt();

        int sum = 0;
        for (int i = 0; i < range; i++) {
            sum += i + 1;
        }

        System.out.println("Sum = " + sum);
    }

    public static void factorial(int num){
        int fact = 1;
        int i = 1;
        while(i <= num){
            fact *= i;
            i++;
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }
    
    public static void multiples(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void fibonacci(int range){
        System.out.println("Fibonacci Series till " + range + " terms : ");
        
        int f0 = 0;
        int f1 = 1;

        System.out.print("0, 1, ");

        for (int i = 0; i < range - 2; i++) {
            int fn = f1 + f0;
            System.out.print(fn + ", ");
            f0 = f1;
            f1 = fn;
        }
    }

    public static void lowerAlphaPrinter(){
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (97 + i) + "\t");
        }
    }

    public static void countDigits(int number){
        int count = 0;
        while(number > 0){
            number /= 10;
            count++;
        }
        System.out.println("\nNumber of Digits : " + count);
    }

    public static void exponent(){
        System.out.println("Enter Base : ");
        int base = in.nextInt();
        System.out.println("Enter Power : ");
        int power = in.nextInt();

        int result = 1;

        for (int i = 0; i < power; i++) {
            result *= base;
        }

        System.out.println("Answer = " + result);
    }

    public static void builtInExponent(){
        System.out.println("Enter Base : ");
        int base = in.nextInt();
        System.out.println("Enter Power : ");
        int power = in.nextInt();

        System.out.println("Answer = " + (int)Math.pow(base, power));
    }

    public static void checkPrime(){
        System.out.println("Enter a number : ");
        int n = in.nextInt();

        for (int i = 2; i * i <= n; i++) {
            if(n % i == 0){
                System.out.println(n + " is not a Prime Number");
                return;
            }
        }
        System.out.println(n + " is a Prime Number");
    }

    public static void factorsOfANumber(){
        System.out.println("Enter a number : ");
        int n = in.nextInt();

        System.out.print("Factors of " + n + " : ");
        for (int i = 1; i <= n / 2; i++) {
            if(n % i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    public static int recursiveFactorial(int num){
        if (num <= 1) return 1;
        return num * recursiveFactorial(num - 1);
    }

    public static void frequencyOfChar(){
        System.out.println("Enter a Statement : ");
        String txt = in.nextLine().toLowerCase();

        int[] freq = new int[256];
        for (int i = 0; i < txt.length(); i++) {
            freq[txt.charAt(i)]++;
        }

        System.out.println("Enter a char : ");
        char ch = in.nextLine().charAt(0);

        System.out.println("Freq = " + freq[ch]);
    }

    public static void countStats(){
        System.out.println("Enter a Statement : ");
        String txt = in.nextLine().toLowerCase();

        int vowel = 0, cons = 0, digit = 0, space = 0;

        for (char ch : txt.toCharArray()) {
            if (ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u'){
                    vowel++;
                }else {
                    cons++;
                }
            }else{
                if (ch >= '0' && ch <= '9')
                    digit++;
                else if (ch == ' ') {
                    space++;
                }
            }
        }

        System.out.println("V : " + vowel);
        System.out.println("C : " + cons);
        System.out.println("D : " + digit);
        System.out.println("S : " + space);
    }
}
