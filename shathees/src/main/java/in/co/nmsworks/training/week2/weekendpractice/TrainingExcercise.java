package in.co.nmsworks.training.week2.weekendpractice;

public class TrainingExcercise {
    public static void main(String[] args) {
        printEvenNumbers(601,700);
        printGradeForGivenMark(78);
        int[] arr = {7, 15, 41};
        int output = searchElement(arr,77);
        System.out.println("Output : "+output);
        int[] arr1 = {2,4,1};
        int[] arr2={3,5,7};
        arrayMultiply(arr1,arr2);
        checkVowelOrConsonant('A');
        multiplicationTable(17);
        int[] array1 = {2, 4, 3, 5};
        squareOfArrayElements(array1);
        printHundredPosition(542);
        printNumbersDIvByThree();
        printNumberEndWithSeven();
        largestAmongThreeNumbers(12,34,5);
        int[] array = {32, 44, 4, 15};
        printOddNumbers(array);
        int[] numbers = {1, 2, 3};
        printSum(numbers);
        String num[] = {"a", "b", "c"};
        reverseArray(num);
        int factorial = factorial(5);
        System.out.println("Factorial : "+factorial);
        int[] numbersArr= {12, 3, 20, 14};
        largestElement(numbersArr);
        int numbersArray[] = {1, 2, 3, 2, 2, 3};
        int x = 2;
        printNoOfOccurance(numbersArray,x);
        checkPalindrome("level");
        int answer = checkPrime(4);
        System.out.println(answer == 1 ? "true":"false");

    }

    private static int checkPrime(int number) {

        if (number <= 1){
            return 0;
        }else {
            for (int i = 2; i * i <= number; i++) {
                if (number % i == 0){
                    return 0;
                }

            }
        }
        return 1;
    }

    public static void checkPalindrome(String input){
        String rev = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            rev += input.charAt(i);

        }
        if(input.equals( rev )){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }

    private static void printNoOfOccurance(int[] numbersArray, int x) {
        int count = 0;
        for (int i : numbersArray) {
            if (i == x){
                count ++;
            }
        }
        System.out.println(count);
    }

    private static void largestElement(int[] numbersArr) {
        int max = Integer.MIN_VALUE;
        for (int i : numbersArr) {
            if (i > max){
                max = i;
            }
        }
        System.out.println(max);
    }

    private static int factorial(int number) {
        if (number == 0 || number == 1){
            return  number;
        }
        return number * factorial(number-1);
    }

    private static void reverseArray(String[] num) {
        int i = 0,j = num.length -1;
        while (i < j) {
            String temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i ++;
            j --;
        }
        for (String s : num) {
            System.out.print(s+" ");

        }

    }

    private static void printSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }

    private static void printOddNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1){
                count ++;
            }
        }
        System.out.println(count);

        
    }

    private static void largestAmongThreeNumbers(int a, int b, int c) {
        if (a >= b && a>= c){
            System.out.println(a);
        } else if (b >= a && b>= c) {
            System.out.println(b);
        }else {
            System.out.println(c);
        }
    }

    private static void printNumberEndWithSeven() {
        for (int i = 200; i < 500; i++) {
            if (i % 10 == 7){
                System.out.print(i+" ");
            }
            
        }
    }

    private static void printNumbersDIvByThree() {
        for (int i = 301; i < 400; i++) {
            if (i % 3 == 0){
                System.out.print(i+" ");
            }

        }
    }

    private static void printHundredPosition(int number) {
        switch (number/100){
            case 1 :
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    private static void squareOfArrayElements(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] * array1[i]+" ");
        }
    }

    private static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number+" * "+i+" = "+number * i);

        }
    }

    private static void checkVowelOrConsonant(char input) {
        char ch = Character.toLowerCase(input);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }else {
            System.out.printf("Consonant");
        }

    }

    private static void arrayMultiply(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr1[i] * arr2[i]+" ");
        }
    }

    private static int searchElement(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;

    }

    private static void printGradeForGivenMark(int mark) {
        if (mark >= 91 && mark <= 100){
            System.out.println("S");
        } else if (mark >= 81 && mark <= 90) {
            System.out.println("A");
        } else if (mark >= 71 && mark <= 80) {
            System.out.println("B");
        } else if (mark >= 61 && mark <= 70) {
            System.out.println("C");
        } else if (mark >= 51 && mark <= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }

    private static void printEvenNumbers(int startNumber, int endNumber) {
        for (int i = endNumber; i >= startNumber ; i--) {
            if (i % 2 == 0){
                System.out.print(i+" ");
            }

        }
    }
}
