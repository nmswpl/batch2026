package in.co.nmsworks.training.week2.day5;

public class ArrayAndStringPractice {
    public static void main(String[] args) {
        printEvenNumbers();
        calculateGrade(80);
        multiplyTwoArrays();
        positionOfAnElementInArray(41);
        vowelOrConsonant('i');
        multiplicationTables();
        squareOfArrayElements();
        hundredthPosition(777);
        divisibleBy();
        endingWithValue();
        biggestOfThreeNumbers(4, 34, 8);
        countOddElements();
        sumOfElementsInAnArray();
        countEvenElements();
        reverseArrayElements();
        System.out.println("\n Factorial of given number is : "+factorialUsingRecursion(5));
        largestElementInArray();
        noOfOccurrence(7);
        stringPalindrome();
        primeOrNotPrime(13);

    }

    private static void primeOrNotPrime(int num) {
        boolean isPrime = false;
        if ( num <= 1){
            isPrime = false;
        }
        if (num == 2 || num == 3){
            isPrime = true;
        }
        for (int j = 2; j <= Math.sqrt(num); j++) {

            if ( num % j == 0){
                isPrime = false;
                break;
            }
            else {
                isPrime = true;

            }
        }
        if (isPrime){
            System.out.println(num + " is a Prime Number");
        }
        else {
            System.out.println(num +" is not a Prime Number");
        }
    }

    private static void stringPalindrome() {
        String str = "madam";
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }

    private static void noOfOccurrence(int x) {
        int[] array = { 1, 3, 2, 7, 7, 3, 2, 3};
        int noOfOccurrence = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == x){
                noOfOccurrence ++;
            }
        }
        System.out.println("Number of Occurrence in the Array : "+ noOfOccurrence);
    }

    private static void largestElementInArray() {
        int[] array = { 12, 45, 83, 13, 89};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > array[i - 1]) && (array[i] > max)){
                max = array[i];
            }
        }
        System.out.println("Largest Element in the Array : "+ max);
    }

    private static int factorialUsingRecursion(int num) {
        if (num == 0 || num == 1){
            return  1;
        }
        else {
            return num * factorialUsingRecursion(num-1);
        }
    }

    private static void reverseArrayElements() {
        String[] array = {"a", "b" , "c"};
        for (int i = array.length - 1; i >=  0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }

    private static void countEvenElements() {
        int[] array = {32, 43, 15, 4};
        int countEven = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] % 2 == 0){
                countEven ++;
            }
        }
        System.out.println("Even elements Count in an array : "+ countEven);
    }

    private static void sumOfElementsInAnArray() {
        int[] arr = {1, 2, 3};
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of Elements in an Array : "+ sum);
    }

    private static void countOddElements() {
        int[] array = {32, 43, 15, 4};
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] % 2 != 0){
                countOdd ++;
            }
        }
        System.out.println("Odd elements Count in an array : "+ countOdd);
    }

    private static void biggestOfThreeNumbers(int firstNum, int secondNum, int thirdNum) {
        if ( firstNum > secondNum){
            if (firstNum > thirdNum){
                System.out.println("Biggest of three number is : "+ firstNum);
            }
            else {
                System.out.println("Biggest of three number is : "+ thirdNum);
            }
        }
        else {
            if ( secondNum > thirdNum) {
                System.out.println("Biggest of three number is : "+ secondNum);
            }
            else {
                System.out.println("Biggest of three number is : "+ thirdNum);
            }
        }
    }

    private static void endingWithValue() {
        System.out.println("Ending with 7 : ");
        for (int i = 200; i < 500; i++) {
            if ( i % 10 == 7){
                System.out.println(i);
            }
        }
    }

    private static void divisibleBy() {
        System.out.println("Divisible By 3");
        for (int i = 301; i < 400; i++) {
            if ( i % 3 == 0){
                System.out.println(i);
            }
        }
    }

    private static void hundredthPosition(int num) {
        System.out.println();
        if (num < 99 || num >= 1000){
            System.out.println("Invalid inputs..");
        }
        else{
            int digit = num/100;
            String[] value = {"Zero", "One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
            System.out.println("Hundredth position : "+value[digit]);

        }
    }

    private static void squareOfArrayElements() {
        int[] array = {2, 4, 3, 5};
        System.out.print("Square of Array Numbers :: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * array[i]+ " ");
        }
    }

    private static void multiplicationTables() {
            int table = 17;
            for (int i = 1; i <= 10; i++) {
                System.out.println(table +" * " + i + " = "+ table*i);
            }
    }

    private static void vowelOrConsonant(char character){
        char ch = character;
        if (ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch =='I' || ch == 'O' || ch == 'U'){
            System.out.println("Vowels");
        }
        else {
            System.out.println("Consonants");
        }
    }

    private static void positionOfAnElementInArray(int num) {
        System.out.println();
        int[] array = {7, 15, 41};
        int searchElement = num;
        int position = -1;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] == searchElement){
                position = i;
            }
        }
        if ( position >= 0 ){
            System.out.println("Position of "+ searchElement + " is "+ position);
        }
        else {
            System.out.println(position);
        }
    }

    private static void multiplyTwoArrays() {
        int[] array1 = {2, 4, 1};
        int[] array2 = {3, 5, 7};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] * array2[i] + " ");
        }

    }

    private static void calculateGrade(int mark) {
        if (mark < 0 || mark > 100) {
            System.out.println("Invalid Inputs");
        } else {
            if (mark > 90) {
                System.out.println("Grade of " + mark + " is S");
            } else if (mark > 80) {
                System.out.println("Grade of " + mark + " is A");
            } else if (mark > 70) {
                System.out.println("Grade of " + mark + " is B");
            } else if (mark > 60) {
                System.out.println("Grade of " + mark + " is C");
            } else if (mark > 50) {
                System.out.println("Grade of " + mark + " is D");
            } else {
                System.out.println("Grade of " + mark + " is Fail");
            }
        }
    }

        private static void printEvenNumbers() {
        for (int i = 700; i > 600; i--) {
            if ( i % 2 == 0){
                System.out.println(i);
            }
        }
    }



}
