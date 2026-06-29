package in.co.nmsworks.training.week2.day5.task;

import java.util.Arrays;

public class TrainingExercise {
    public static void main(String[] args) {
//        printEvenNumbersInDescendingOrder(75, 100);
//        printGradeForGivenMark(51);

        int[] arr1 = {2,4,1};
        int[] arr2 = {13,5,7};
//        multiplyTwoArrays(arr1, arr2);

//        printPositionOfGivenElementInArray(arr1, 1);
//        printPositionOfGivenElementInArray(arr1, 5);

//        checkGivenCharacterIsVowelOrConsonant('k');
//        checkGivenCharacterIsVowelOrConsonant('A');

//        printMultiplicationTableOfInput(10);

//        printSquareOfEveryElementInArray(arr2);
//        printSquareOfEveryElementInArray(arr1);

//        printTheHundredPositionValueInWords(1542);

//        printNumbersDivisibleByThree(300, 400);

//        printNumbersEndingWithSeven(200, 300);

        int[] nums = {32, 4, 43, 15};
//        printNumberOfOddElements(nums);

//        findSumOfElementsOfArray(nums);

        String[] array = {"a", "b", "c", "d", "e"};
//        reverseTheStringArray(array);

//        countAndPrintEvenElements(nums);

//        printFactorialOfNumber(6);

//        printTheLargestElement(new int[]{12, 13, 20, 14, 55});

//        printNumberOfOccuranceOfX(new int[]{1,2,3,2,2,3}, 2);

//        checkWhetherInputIsPalindromeOrNot("level");
//        checkWhetherInputIsPalindromeOrNot("labc");

//        checkWhetherInputIsPrimeOrNot(101);
    }

    private static void checkWhetherInputIsPrimeOrNot(int input) {
        if (isPrime(input)) {
            System.out.println(input + " is a prime number.");
        }
        else {
            System.out.println(input + " is not a prime number.");
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        int limit = (int) Math.sqrt(number);
        for (int i = 3; i <= limit; i = i+2) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }


    private static void checkWhetherInputIsPalindromeOrNot(String input) {
        if(input == null || input.isEmpty()) {
            System.out.println("Invalid input!!");
            return;
        }

        if(isPalindrome(input)) {
            System.out.println(input + " is a Palindrome.");
        }
        else {
            System.out.println(input + " is not a Palindrome.");
        }
    }

    private static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length()-1;

        while (left < right) {
            if(input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static void printNumberOfOccuranceOfX(int[] nums, int x) {
        int count = 0;

        for (int num : nums){
            if(num == x){
                count++;
            }
        }

        System.out.println("Number of occurance of " + x + " in the array is : " + count);
    }


    private static void printFactorialOfNumber(int number) {

        if(number <= 0){
            System.out.println("Invalid input!!");
            return;
        }

        int factorial = findFactorial(number);
        System.out.println("Factorial of " + number + " is : " + factorial);
    }

    private static int findFactorial(int number){
        if(number == 1){
            return 1;
        }

        return number * findFactorial(number-1);
    }

    private static void countAndPrintEvenElements(int[] nums) {
        if(nums == null || nums.length == 0){
            System.out.println("Invalid input!!");
            return;
        }

        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0){
                count++;
                System.out.println("Even Element : " + num);
            }
        }

        System.out.println("Count of Even elements : " + count);
    }

    private static void reverseTheStringArray(String[] array) {

        if(array == null || array.length == 0){
            System.out.println("Invalid Input!!");
            return;
        }

        System.out.println("Before Reverse : " + Arrays.toString(array));

        int left = 0;
        int right = array.length-1;

        while (left < right){
            String temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++; right--;
        }

        System.out.println("After Reverse : " + Arrays.toString(array));
    }

    private static void findSumOfElementsOfArray(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        System.out.println("Sum : " + sum);
    }

    private static void printNumberOfOddElements(int[] nums) {
        int count = 0;

        for (int num : nums){
            if(num % 2 != 0){
                System.out.println("odd number : " + num);
                count++;
            }
        }

        System.out.println("Number of Odd elements : " + count);
    }

    private static void printTheLargestElement(int[] nums) {
        if(nums == null || nums.length == 0){
            System.out.println("Invalid input!!");
            return;
        }

        int largestNumber = 0;
        for(int num : nums){
            if(largestNumber < num){
                largestNumber = num;
            }
        }

        System.out.println("Largest Element : " + largestNumber);
    }

    private static void printNumbersEndingWithSeven(int startNumber, int endNumber) {
        System.out.println("Numbers between " + startNumber + " and " + endNumber + " ending with 7 are : ");
        for (int number = startNumber; number <= endNumber; number++) {
            if(isNumberEndingWithSeven(number)){
                System.out.println(number);
            }
        }
    }

    private static boolean isNumberEndingWithSeven(int number){
        return number % 10 == 7;
    }

    private static void printNumbersDivisibleByThree(int startNumber, int endNumber) {
        System.out.println("Numbers divisible by 3 between " + startNumber + " and " + endNumber + " are : ");

        for (int number = startNumber; number <= endNumber; number++) {
            if(number % 3 == 0){
                System.out.println(number);
            }
        }
    }


    private static void printTheHundredPositionValueInWords(int input) {
        int hundredPositionValue = getHundredPositionValue(input);

        System.out.println("Output : ");
        switch (hundredPositionValue){
            case 0:
                System.out.println("Zero");
                break;
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

    private static int getHundredPositionValue(int number){
        int hundredPosVal = 0;

        for (int i = 0; i < 3; i++) {
            hundredPosVal = number%10;
            number = number/10;
        }

        return hundredPosVal;
    }

    private static void printSquareOfEveryElementInArray(int[] nums) {

        System.out.println("Output : ");
        for (int num : nums) {
            System.out.print((num * num) + " ");
        }
    }

    private static void printMultiplicationTableOfInput(int number) {
        System.out.println("Output for Multiplication Table : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number*i));
        }
    }

    private static void checkGivenCharacterIsVowelOrConsonant(char input) {
        if((input == 'A') || (input == 'E') || (input == 'I') || (input == 'O') || (input == 'U')
                || (input == 'a') || (input == 'e') || (input == 'i') || (input == 'o') || (input == 'u')){
            System.out.println(input + " is a Vowel");
        }
        else {
            System.out.println(input + " is a Consonant");
        }
    }

    static void printPositionOfGivenElementInArray(int[] nums, int searchElement){
        int indexPosition = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == searchElement){
                indexPosition = i;
            }
        }
        System.out.println("Output : " + indexPosition);
    }

    static void multiplyTwoArrays(int[] arr1, int[] arr2) {

        System.out.println("Output : ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print((arr1[i] * arr2[i]) + " ");
        }
    }

    static void printEvenNumbersInDescendingOrder(int startNumber, int endNumber){
        for (int num = endNumber; num >= startNumber; num--) {
            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }

    static void printGradeForGivenMark(int mark){
        if(mark < 0 || mark > 100){
            System.out.println("Invalid marks!!");
        }
        else {
            System.out.print("Grade : ");
            if(mark > 90) {
                System.out.println("S");
            }
            else if (mark > 80) {
                System.out.println("A");
            }
            else if (mark > 70) {
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
    }
}

