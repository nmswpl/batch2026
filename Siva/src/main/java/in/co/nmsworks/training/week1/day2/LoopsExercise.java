package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class LoopsExercise {



    public static void main(String[] args) {
        int ans = findLargestNumber();
        System.out.println("Greatest Number is : "+ans);
        findPositiveOrNegative();
        checkAlphabet();
        findSumOfNaturalNumbers();
        findFactorialOfNumberUsingForLoop();
        findFactorialOfNumberUsingWhileLoop();
        generateMultiplicationTable();
        printFibonacciSeries();
        printLowerCaseAlphabet();
        printNumberOfDigits();
        calculatePowerOfANumberUsingForLoop();
        calculatePowerOfANumberUsingPow();
        checkPrimeOrNot();
        findFactors();
        System.out.println("Result : "+findFactorialUsingRecursion(6));
//        getFrequencyOfACharacter();
    }
    
    public static int findLargestNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any 3 Different Numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        if ( number1 > number2 && number1 > number3 ){
            return number1;
        }
        else if ( number2 > number1 && number2 > number3 ){
            return number2;
        }
        return number3;
    }

    public static void findPositiveOrNegative(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        if ( number >= 0){
            System.out.println("Given Number is Positive!");
        }
        else {
            System.out.println("Given Number is Negative!");
        }
    }

    public static void checkAlphabet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch+" is an alphabet.");
        }
        else {
            System.out.println(ch+" is not an alphabet.");
        }
    }

    public static void findSumOfNaturalNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= number; i++){
            sum += i;
        }
        System.out.println("Sum = "+sum);
    }

    public static void findFactorialOfNumberUsingForLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        long answer = 1;
        for (int i = 2; i <= number; i++){
            answer *= i;
        }
        System.out.println("Factorial of "+number+" = "+answer);
    }

    public static void findFactorialOfNumberUsingWhileLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        long answer = 1;
        while ( number > 1 ){
            answer *= number;
            number -= 1;
        }
        System.out.println("Factorial of "+number+" = "+answer);
    }

    public static void generateMultiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        for ( int i = 1; i <= 10; i++){
            System.out.println(number+" * "+i+" = "+(i*number));
        }
    }

    public static void printFibonacciSeries(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        int a = 0, b = 1, c;
        System.out.println("Fibonacci Series till "+number+" terms:");
        System.out.print(a+", "+b+", ");
        for ( int i = 2; i <= number; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(c+", ");
        }
    }

    public static void printLowerCaseAlphabet(){
        System.out.println();
        for ( int i = 0; i < 26; i++){
            System.out.print((char)i+97+" ");
        }
    }

    public static void printNumberOfDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        int count = 0;
        while ( number != 0){
            count++;
            number /= 10;
        }
        System.out.println("Number of Digits : "+count);
    }

    public static void calculatePowerOfANumberUsingForLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base Number");
        int number = scanner.nextInt();
        System.out.println("Enter Power");
        int power = scanner.nextInt();
        long answer = 1;
        for ( int i = 1; i <= power; i++){
            answer *=number;
        }
        System.out.println("Answer = " + answer);
    }

    public static void calculatePowerOfANumberUsingPow(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base Number");
        int number = scanner.nextInt();
        System.out.println("Enter Power");
        int power = scanner.nextInt();
        double answer = Math.pow(number, power);
        System.out.println("Answer = "+answer);
    }

    public static void checkPrimeOrNot(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        for ( int i = 2; i < number; i++){
            if (number %2 == 0){
                System.out.println(number+" is not a Prime Number");
                return;
            }
        }
        System.out.println(number+" is a Prime Number");
    }

    public static void findFactors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int number = scanner.nextInt();
        System.out.println("Factors of "+number+" are : ");
        for ( int i = 1; i <= number; i++){
            if ( number %i == 0 ){
                System.out.println(i+" ");
            }
        }
    }

    public static long findFactorialUsingRecursion(int number){
        if ( number == 1) return number;
        return number * findFactorialUsingRecursion(number-1);
    }

//    public static void getFrequencyOfACharacter(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter Statement");
//        String str = x.nextLine();
//        System.out.println("Enter any Character");
//        char ch = scanner.next().charAt(0);
//        int count = 0;
//        for (char c : s){
//            if (ch == c)
//                count++;
//        }
//        System.out.println("Frequency of "+ch+" is "+count);
//    }
//    public stat
}
