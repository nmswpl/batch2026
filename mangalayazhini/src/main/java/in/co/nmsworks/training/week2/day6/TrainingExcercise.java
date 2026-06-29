package in.co.nmsworks.training.week2.day6;

public class TrainingExcercise {

    public static void main(String[] args) {
        TrainingExcercise obj = new TrainingExcercise();
        obj.evenNoInDescendingOrder(601,700);
        obj.printGrade(80);

        /** Array Multiplication*/
        int[] arr1 = {2,4,1};
        int[] arr2 = {3,5,7};
        int[] arr3 = {32, 43, 4, 15};
        String[] arr4 = {"a","b","c"};
        int[] arr5 = {5,4,3,6,5,10,2,5};

        obj.multiplyTwoArray(arr1, arr2);
        obj.positionOfElement(arr1,1);
        obj.checkVowelOrConsonant('z');
        obj.multiplicationTable(17);
        obj.calSquareOfArrayElements(arr1);
        obj.printHundredthPosition(45);
        obj.numbersDivisibleByThree(300,400);
        obj.numbersEndingWithSeven(200,500);
        obj.largestOfThreeNo(12,20,8);
        obj.findBiggestNo(arr1);
        obj.findOddNo(arr3);
        obj.sumOfArray(arr3);
        obj.findOccurrencesOfDigitInArray(5,arr5);
        obj.checkPalindrom("level");
        obj.checkPalindrom("abc");
        obj.checkPrimeOrNot(8);

        int[] reversedArr1 = obj.reverseArray(arr1);
        System.out.print("Reversed Array : ");
        for (int value : reversedArr1) {
            System.out.print(value + " ");
        }

        String[] reversedArr2 = obj.reverseArray(arr4);
        System.out.print("\nReversed Array : ");
        for (String value : reversedArr2) {
            System.out.print(value + " ");
        }

        int no = 5 ;
        obj.countEvenNumbers(arr1);
        int factorialValue = obj.factorial(no);
        System.out.println("The factorial of " + no + " is " + factorialValue);

    }

    public void checkPrimeOrNot(int number) {
        int flag = 0 ;
        int count = 0 ;
        for (int i = 2; i < number; i++) {
            if(number % i == 0 ){
                flag = 1 ;
                count ++;
            }
        }

        if(flag == 0 ){
            System.out.println("The number " + number + " is a prime no");
        }
        else{
            System.out.println("The number " + number + " is not a prime no");
            System.out.println("It is divisible by " + count + " numbers");
        }
    }

    public void checkPalindrom(String str) {
        String revStr = "";
        for (int i =  str.length()-1; i >= 0 ; i--) {
            revStr += str.charAt(i);
        }
        if(revStr.equals(str)){
            System.out.println("The given " + str + " is a palindrome");
        }
        else{
            System.out.println("The given " + str + " is not a palindrome");
        }
    }

    public void findOccurrencesOfDigitInArray(int number, int[] arr) {
        int sum = 0 ;
        for (int num : arr) {
            if(num == number){
                sum ++;
            }
        }
        System.out.println("Occurrences of " + number + " in given array : " + sum);
    }

    public void largestOfThreeNo(int n1, int n2, int n3) {
        if(n1 > n2 && n1 > n3){
            System.out.println("The largest no is : " + n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println("The largest no is : " + n2);
        }
        else{
            System.out.println("The largest no is : " + n3);
        }
    }

    public int factorial(int number) {
        if(number == 1){
            return 1;
        }
        else{
            return factorial(number-1)*number ;
        }
    }

    public void countEvenNumbers(int[] arr) {
        int sum=0;
        System.out.println("\nCounting Even Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 ==0){
                sum++;
            }

        }
        System.out.println("No of even no in array : "+ sum);
    }

    public int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reversedArr = new int[n];
        int i = 0 ;
        for (int j = n-1; j >=0  ; j--) {
            reversedArr[i] = arr[j];
            i++;
        }

        return reversedArr;

    }

    public String[] reverseArray(String[] arr) {
        int n = arr.length;
        String[] reversedArr = new String[n];
        int i = 0 ;
        for (int j = n-1; j >=0  ; j--) {
            reversedArr[i] = arr[j];
            i++;
        }

        return reversedArr;

    }

    public void sumOfArray(int[] arr) {
        int sum=0;
        System.out.print("Sum of an Array : ");
        for (int number : arr) {
            sum += number;
            System.out.print(number + " ");
        }
        System.out.println("\nsum : "+ sum);
    }

    public void findOddNo(int[] arr) {
        System.out.print("Odd Numbers : ");
        for (int number : arr) {
            if(number % 2 == 1){
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    public void findBiggestNo(int[] arr) {

        System.out.println("Biggest No in the array : ");
        int biggestNo = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > biggestNo){
                biggestNo = arr[i];
            }
        }
        System.out.println("The biggest no is : "+biggestNo);
    }

    public void numbersEndingWithSeven(int startNo, int endNo) {
        System.out.println("Numbers ending with seven : ");
        for (int i = startNo+1; i < endNo; i++) {
            if(i % 10 == 7){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void numbersDivisibleByThree(int startNo, int endNo) {
        System.out.println("No divisible by three : ");
        for (int i = startNo+1; i < endNo; i++) {
            if(i % 3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public void printHundredthPosition(int number) {
        int hundredthValue = number/100;
        if(hundredthValue == 0){
            System.out.println("\nThe number "+number +" is not a three digit no");
        }
        else{
            System.out.println("\nThe Hundredth positon value of the number "+number + " is " +hundredthValue);
        }
    }

    public void calSquareOfArrayElements(int[] arr) {
        System.out.println("Calculating the square of numbers in array : ");
        for (int number : arr) {
            System.out.print(number*number + " ");
        }
    }

    public void multiplicationTable(int number) {
        System.out.println("Multiplication Table of "+ number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + number + " = " + number*i);
            
        }
    }

    public void checkVowelOrConsonant(char ch) {
        System.out.println("Cheking whether a character is vowel or consonant");
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' ||  ch == 'E' ||  ch == 'I' ||  ch == 'O' || ch == 'U' ){
            System.out.println("The given character "+ ch +" is a vowel");
        }
        else{
            System.out.println("The given character "+ ch +" is a consonant");
        }
    }

    public void positionOfElement(int[] arr,int value) {
        int flag = 0 ;
        System.out.println("Finding position of an element in an array ");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                flag = 1;
                System.out.println("Position of element "+value + " is " + i);
                break;
            }
        }
        if(flag == 0){
            System.out.println("Position of "+value + " is -1");
        }
    }

    public void multiplyTwoArray(int[] array1  , int[] array2) {
        System.out.println("Array Multiplication: ");
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length ; i++) {
                System.out.print(array1[i] * array2[i] + " ");
            }
        }
        else{
            System.out.println("Multiplication of arrays with different length is not possible");
        }
    }


    public void printGrade(int mark) {
        char grade ;
        if(mark > 100 || mark < 0){
            System.out.println("Invalid Mark");
        }
        else{
            if(mark >90){
                grade = 'S';
            }
            else if(mark >80){
                grade = 'A';
            }
            else if(mark >70){
                grade = 'B';
            }
            else if(mark >60){
                grade = 'C';
            }
            else if(mark >50){
                grade = 'D';
            }
            else{
                grade = 'F';
            }

            System.out.println("\n\nThe grade for the given mark ::" + grade);
        }
    }

    public void evenNoInDescendingOrder(int startNo, int endNo) {
        System.out.println("Even numbers between "+startNo +" and " + endNo);
        for (int i = endNo; i >= startNo; i--) {
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

}
