package in.co.nmsworks.training.week2.exercise;

public class TrainingExercise2 {
    public static void main(String[] args) {
        evenNumbersFrom601and700();
        printGrade(80);
        multiplyArrays();
        positionOfGivenElement();
        vowelConsonant('a');
        tables(17);
        squareOfArray();
        printHundredPositionInWords(567);
        divisibleBy3Between300And400();
        numbersBetween200And500EndingWith7();
        biggestOf3(35,26,78);
        oddElementsOfArray();
        sumOfArray();
        reverseTheArray();
        countEvenElements();
        factUsingRecursion(5);
        largestNumberOfArray();
        occuranceOfElement();
        stringPalindrome("level");
        checkPrimeNumber(2);


    }

    public static void checkPrimeNumber(int number) {
        boolean isPrime = false;
        if(number<2){
            System.out.println(number + " is not a prime number");
        }
        else{
            for (int i = 2; i < number/2 ; i++) {
                if(number % i == 0){
                    isPrime = true;
                    break;
                }
            }
            if(!isPrime){
                System.out.println(number + " is prime number");
            }
            else{
                System.out.println(number + " is not a prime number");
            }
        }

    }

    public static void stringPalindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        StringBuilder original = new StringBuilder(str);

        if(reversed.toString().equals(original.toString())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    public static void occuranceOfElement() {
        int[] array = {1,2,2,3,2,4,5};
        int searchElement = 2;
        int count = 0;
        for (int num : array) {
            if(num == searchElement){
                count++;
            }
        }
        System.out.println("No. of occurances of " + searchElement + ": " + count);

    }

    public static void largestNumberOfArray() {
        int[] array = {1,2,3,6,5,4};
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>largest){
                largest=array[i];
            }
        }
        System.out.println("Largest element in array: " + largest);
    }

    public static int factorial(int num){

        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);

    }
    public static void factUsingRecursion(int number){
        int result = factorial(number);
        System.out.println(result);
    }
    public static void countEvenElements() {
        int[] arr = {2, 3, 4, 5, 6};
        int count = 0;
        System.out.print("Even elements: ");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\nNumber of even elements = " + count);
    }

    public static void reverseTheArray() {
        char[] array = {'a','b','c'};
        char[] revArray = new char[array.length];
        int j=0;
        for (int i = array.length-1; i >= 0; i--) {
            revArray[j++] = array[i];
        }
        for (int i = 0; i < revArray.length; i++) {
            System.out.println(revArray[i]);
        }
    }

    public static void sumOfArray() {
        int[] array = {1,2,3,4};
        int sum = 0;

        System.out.println("Sum of array:");
        for (int i = 0; i < array.length ; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    public static void oddElementsOfArray() {
        int[] array = {34,45,23,32};
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2!=0){
                System.out.println(array[i]);
            }
        }
    }

    public static void biggestOf3(int num1, int num2, int num3) {
        if(num1>num2 && num1>num3){
            System.out.println(num1+" is biggest");
        } else if (num2>num3) {
            System.out.println(num2+" is biggest");
        }
        else{
            System.out.println(num3+" is biggest");
        }

    }

    public static void numbersBetween200And500EndingWith7() {
        for (int i = 200; i <= 500; i++) {
            int last = i%10;
            if(last == 7){
                System.out.println(i);
            }

        }
    }

    public static void divisibleBy3Between300And400() {
        System.out.println("Numbers divisible by 3 between 300 and 400:");
        for (int i = 300; i <+ 400 ; i++) {
            if(i%3 == 0){
                System.out.println(i);
            }
        }
    }

    public static void printHundredPositionInWords(int number) {
        if(number<100 && number>999){
            System.out.println("Number should be in 3 digit ");
        }
        int digit = number/100;
        switch (digit){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;

        }
    }

    public static void squareOfArray() {
        int[] array = {2,3,4,5};
        System.out.println("Square of array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]*array[i]);
        }
    }

    public static void tables(int number){
        System.out.println("17 Tables...");
        for(int i=1; i<=10; i++){
            System.out.println(number + "*" + i + "=" + number * i );
        }
    }
    public static void vowelConsonant(char ch){

        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch + " is vowel");
        }
        else{
            System.out.println(ch + " is consonant");
        }
    }
    public static void positionOfGivenElement() {
        int[] array = {7,5,11};
        int element = 11;
        boolean isPresent = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                System.out.println(i);
                isPresent = true;
            }
        }
        if(!isPresent){
            System.out.println("-1");
        }
    }

    public static void multiplyArrays() {
        int[] array1 = {2,4,6};
        int[] array2 = {3,5,7};
        System.out.println("Multiply two arrays:");
        for (int i = 0; i < array1.length; i++) {
            int product = array1[i] * array2[i];
            System.out.println(product);
        }
    }

    public static void printGrade(int mark) {
        if(mark < 0 && mark > 100){
            System.out.println("Invalid mark");
        }
        else if(mark > 90){
            System.out.println("S");
        }
        else if (mark > 80 ) {
            System.out.println("A");
        }
        else if (mark >70) {
            System.out.println("B");
        }
        else if (mark > 60) {
            System.out.println("C");
        }
        else if (mark > 50) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }

    public static void evenNumbersFrom601and700() {
        System.out.println("Even numbers from 601 and 700 in descending order: ");
        for (int i = 700; i >=601 ; i--) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
