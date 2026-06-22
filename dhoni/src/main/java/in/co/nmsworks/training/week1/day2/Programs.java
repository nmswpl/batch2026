package in.co.nmsworks.training.week1.day2;

import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
        //findLargestOfThreeNumbers();
        //isPositiveOrNegativeNumber();
        //isAlphabet();
        //sumOfNaturalNumbers();
        //factorialOfNumberByForLoop();
        //factorialOfNumberByWhileLoop();
        //generateMultiplicationTable();
        //generateFibonacciSeries();
        //printAlphabets();
        //countNumberOfDigits();
        //powerOfNumberUsingForLoop();
        //isPrimeNumber();
        //findFactors();
        //int ans = factorialUsingRecursion(6);
        //System.out.println(" Factorial of 6: "+ans);
        //findFrequencyOfCharacters();
        countLetterTypes();


    }

    public static void findLargestOfThreeNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int b = scanner.nextInt();
        System.out.println("Enter number 3: ");
        int c = scanner.nextInt();

        if (a > b && a > c){
            System.out.println(a + " is the Largest number");
        }
        else if (b > a && b > c){
            System.out.println(b + " is the Largest number");
        }
        else{
            System.out.println(c + " is the Largest number");
        }
    }

    public static void isPositiveOrNegativeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is positive");
        } else if(num < 0) {
            System.out.println(num + " is negative");
        }
        else{
            System.out.println(num + " is neutral");
        }
    }

    public static void isAlphabet(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character : ");
        char c = scanner.nextLine().charAt(0);

        if( c >= 'a' && c <= 'z'|| c >= 'A' && c <= 'Z'){
            System.out.println(c + " is an Alphabet");
        }
        else{
            System.out.println(c + " is not Alphabet");
        }
    }

    public static void sumOfNaturalNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = scanner.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++){
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }

    public static void factorialOfNumberByForLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        long fact = 1;

        if(num == 0 || num == 1){
            System.out.println("factorial of "+ num +" = 1");
        }
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }

        System.out.println("factorial of "+ num +" = "+fact);
    }

    public static void factorialOfNumberByWhileLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();
        long fact = 1;
        int i = 1;

        if(num == 0 || num == 1){
            System.out.println("factorial of "+ num +" = 1");
        }

        while( i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("factorial of "+ num +" = "+fact);
    }

    public static void generateMultiplicationTable(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " * " + num + " = " + (i*num));
        }
    }

    public static void generateFibonacciSeries(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        System.out.println("Fibonacci Series till "+ num +" terms");
        if(num == 0){
            System.out.println("0");
        }
        if(num == 1){
            System.out.println("1");
        }

        int a = 0, b = 1;
        System.out.print("0 1 ");

        for(int i = 2; i < num; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void printAlphabets(){
        for(char c = 'a'; c <= 'z'; c++){
            System.out.print((char) c);
            System.out.print(" ");
        }
    }

    public static void countNumberOfDigits(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        System.out.println("Number of Digits : "+ count);
    }

    public static void powerOfNumberUsingForLoop(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base number : ");
        int num = scanner.nextInt();
        System.out.print("Enter power number : ");
        int power = scanner.nextInt();

        if(power == 0){
            System.out.println("Answer = " + 1);
        }

        if(power == 1){
            System.out.println("Answer = " + num);
        }

        int ans = 1;
        for (int i = 1; i < power; i++){
            ans = ans * num;
        }
        System.out.println("Answer = " + ans);
    }

    public static void powerOfNumberUsingInbuiltFunction(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base number : ");
        int num = scanner.nextInt();
        System.out.print("Enter power number : ");
        int power = scanner.nextInt();

        double ans = Math.pow(num, power);
        System.out.println("Answer = " + ans);
    }

    public static void isPrimeNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        for(int i = 2; i < num; i++){
            if(num%i == 0){
                System.out.println(num + " is Not a Prime Number");
                return;
            }
        }
        System.out.println(num + " is a Prime Number" );
    }

    public static void findFactors(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        System.out.print("Factors of "+num+" are: ");
        for(int i = 1; i <= num; i++){
            if(num%i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static int factorialUsingRecursion(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return factorialUsingRecursion(n-1) * n;
    }

    public static void findFrequencyOfCharacters(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Statement : ");
        String Line = scanner.nextLine();
        int count = 0;

        for(int i = 0;i < Line.length();i++){
            if(Line.charAt(i) == 'e'){
                count++;
            }
        }
        System.out.print("ABC of e : "+ count);
    }

    public static void countLetterTypes(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Statement : ");
        String Line = scanner.nextLine();
        int v = 0;
        int c = 0;
        int d = 0;
        int s = 0;
        char[] arr = Line.toCharArray();


        for(char k : arr){
            if(k >= 'a' && k <= 'z' || k >= 'A' && k<= 'Z'){
                if(k == 'A' || k == 'E' || k == 'I' || k == 'O' || k == 'U' ||
                        k =='a' || k == 'e' || k == 'i' || k == 'o' || k == 'u' ) {
                    v++;
                }
                else{
                    c++;
                }
            }
            else if(k <= '0' || k >= '9'){
                d++;
            }
            else{
                s++;
            }
        }

        System.out.println("Vowels : " + v);
        System.out.println("Consonants : " + c);
        System.out.println("Digits : " + d);
        System.out.println("Space : "+ s);

    }



}
