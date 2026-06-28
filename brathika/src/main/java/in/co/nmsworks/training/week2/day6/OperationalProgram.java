package in.co.nmsworks.training.week2.day6;

public class OperationalProgram {
    public static void main(String[] args) {
        OperationalProgram op = new OperationalProgram();
        op.printNumbersInDescendingOrder(700,601);
        op.printGradeForTheMark(90);
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        op.multipyTwoEqualSizeArray(arr1 , arr2);
        op.printPositionOfTheElement(arr1, 5);
        op.checkVowelOrConsonant('a');
        op.printMultiplicationTale(17);
        op.printSquareOfTheElementsInArray(arr1);
        op.printHundredthPosition(560);
        op.printMultiplesOf3(400,500);
        op.printNumberEndingWith7(200,300);
        op.printGreatestNumber(30,40,50);
        op.printElementsInOddPosition(arr2);
        op.printSumOfNumbersInArray(arr1);
        String[] arr = {"a", "b", "c"};
        op.reverseAndPrint(arr);
        op.countAndPrintEvenNumbers(arr1);
        op.factorialUsingRecursion(7);
        op.findTheLargestElementInArray(arr1);
        op.findTheNoOfOccurance(arr1, 3);
        op.checkForPalindrome("Malayalam");
        op.checkForPrimeNumber(2);
    }

    private void checkForPrimeNumber(int number1) {
        boolean isPrime = true;
        if(number1 < 2){
            isPrime = false;
        }
        for(int i = 2; i < number1 / 2; i++){
            if(number1 % i == 0){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println("Number "+number1+" is Prime");
        }
        else{
            System.out.println("Number "+number1+" is not prime");
        }
    }

    private void checkForPalindrome(String str1) {
        String revere = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            revere += str1.charAt(i);

        }
        if (str1.equals(revere)){
            System.out.println(str1+" is a palindrome");
        }
        else {
            System.out.println(str1+" is not a palindrome");
        }
    }

    private void findTheNoOfOccurance(int[] arr1, int number1) {
        int count = 0;
        for (int i = 0; i < arr1.length ; i++) {
            if (arr1[i] == number1) {
                count++;
            }
        }
        System.out.println("No of occurance of "+number1+" is "+count);
    }

    private void findTheLargestElementInArray(int[] arr1) {
        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        System.out.println("Largest element in the array is: "+max);
    }

    private long factorialUsingRecursion(int number1) {
        if(number1 == 0 || number1 ==1){
            return 1;
        }
        return number1 * factorialUsingRecursion(number1 - 1);
    }


    private void countAndPrintEvenNumbers(int[] arr1) {
        int count = 0;
        System.out.println("The even numbers are: ");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                count++;
                System.out.print(arr1[i]+" ");
            }
        }
        System.out.println("No of even numbers are: "+count);
    }

    private void reverseAndPrint(String[] arr) {
        System.out.println("The array is reversed order is: ");
        for (int i = arr.length - 1; i >=0 ; i--) {
            System.out.println(arr[i]+" ");
        }
    }

    private void printSumOfNumbersInArray(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("Sum of n numbers is: "+sum);
    }

    private void printNumberEndingWith7(int number1, int number2) {
        System.out.println("The numbers endind with 7 is ");
        for (int i = number1; i <number2; i++) {
            if(i % 10 == 7) {
                System.out.print(i+" ");
            }
        }
    }

    private void printElementsInOddPosition(int[] arr2) {
        System.out.println("The elemets in odd position is: ");
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 != 0) {
                System.out.print(arr2[i]+" ");
            }
        }
        System.out.println();

    }

    private void printGreatestNumber(int number1, int number2, int number3) {
        if(number1 > number2 && number1 > number3){
            System.out.println(number1+" is Greater");
        }
        else if(number2 > number1 && number2 > number3){
            System.out.println(number2+" is Greater");
        }
        else{
            System.out.println(number3+" is Greater");
        }
    }

    private void printMultiplesOf3(int number1, int number2) {
        for (int i = number1; i <= number2 ; i++) {

            if (i % 3 == 0) {
                System.out.print(i+" ");
            }

        }

    }

    private void printHundredthPosition(int number1) {
        int value = number1 / 100;
        String[] arr = {"Zero", "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (value <= 9) {
            System.out.println("Hundred position of Number is: "+arr[value]);
        }
    }

    private void printSquareOfTheElementsInArray(int[] arr1) {
        System.out.println("The square of the every elements in array is: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]*arr1[i]+" ");
        }
    }

    private void printMultiplicationTale(int number1) {
        for (int i = 1; i <= 10; i++) {
            int answer = number1 * i;
            System.out.println(number1+" * "+i+" = "+answer);
        }
    }

    private void checkVowelOrConsonant(char ch) {
        ch = Character.toUpperCase(ch);
        if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch+" is a vowel.");
        }
        else{
            System.out.println(ch+" is not a vowel.");
        }
    }

    private void printPositionOfTheElement(int[] arr1, int number1) {
        boolean isFound = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == number1) {
                isFound = true;
                System.out.println("The element " + number1 + "is found at the index " + i);
            }
        }
        if (!isFound) {
            System.out.println("The element "+number1+" is found at -1");
        }
    }

    private void multipyTwoEqualSizeArray(int[] arr1, int[] arr2) {
        int size = arr1.length;
        System.out.println("Product of two array is");
        for (int i = 0; i < size; i++) {
            System.out.print(arr1[i]*arr2[i]+" ");
        }
        System.out.println();
    }

    private void printGradeForTheMark(int number1) {

        if (number1 > 100) {
            System.out.println("Mark is invald");
        } else if (number1 >= 91 ) {
            System.out.println("Your grade is S");
        } else if (number1 >= 81 ){
            System.out.println("Your grade is A");
        } else if (number1 >= 71 ) {
            System.out.println("Your grade is B");
        } else if (number1 >= 61 ) {
            System.out.println("Your grade is C");
        } else if (number1 >= 51 ) {
            System.out.println("Your grade is D");
        }else {
            System.out.println("Your grade is F");
        }
    }

    private void printNumbersInDescendingOrder(int number1, int number2) {
        for (int i = number1; i > number2 ; i--) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
