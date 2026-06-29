package in.co.nmsworks.training.week2.weekend;

public class JavaBasicsPracticeProblems {
    public static void main(String[] args) {
        JavaBasicsPracticeProblems jb = new JavaBasicsPracticeProblems();
        jb.printAllEvenNumbersInReverseOrderBetweenTwoNumbers(601,700);
        jb.printGrade(78);
        jb.multiplyTwoArrays();
        System.out.println(jb.printIndexOfGivenNumber(41));
        System.out.println(jb.printIndexOfGivenNumber(21));
        jb.checkVowelOrConsonant('A');
        jb.printMultiplicationTable(17);
        jb.printSqaureValue();
        jb.printHundredPositionValueInWords(889);
        jb.printAllNumbersDivisbleByThree(301,400);
        jb.printAllNumbersEndingWithSeven(200,500);
        jb.printBiggestNumberAmongThreeNumbers(23,23,27);
        jb.printAddOddNumbers();
        jb.printSumOfTheElementsInTheArray();
        jb.reverseArray(new char[]{'a', 'b', 'c', 'd'});
        jb.countEventElementsInTheArray();
        System.out.println(jb.printFactorial(5));
        jb.findLargestElementInTheArray();
        jb.printFrequencyOfAElementInTheArray(new int[]{1, 2, 3, 2, 2, 3},2);
        jb.printPalindromeOrNot("malayalam");
        jb.printPalindromeOrNot("apple");
        jb.printPrimeOrNot(11);
        jb.printPrimeOrNot(90);
    }

    private void printPrimeOrNot(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a Prime");
                return;
            }
        }
        System.out.println(number+" is Prime");
    }

    private void printPalindromeOrNot(String word) {
        int st = 0, end = word.length() - 1;
        while (st <= end) {
            if (word.charAt(st) != word.charAt(end)) {
                System.out.println(word +" is Not a Palindrome");
                return;
            }
            st++;
            end--;
        }
        System.out.println(word +" is Palindrome");
    }

    private void printFrequencyOfAElementInTheArray(int[] arr, int key) {
        int count = 0;
        for (int num : arr) {
            if (num == key)
                count += 1;
        }
        System.out.println("Frequency of "+key+" :: "+count);
    }

    private void findLargestElementInTheArray() {
        int[] arr = {12, 3, 20, 14};
        int answer = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > answer)
                answer = num;
        }
        System.out.println("Largest Element :: "+answer);
    }

    private long printFactorial(long num) {
        if (num == 1)
            return num;
        return printFactorial(num-1) * num;
    }

    private void countEventElementsInTheArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int num : arr) {
            if (num %2 == 0) count += 1;
        }
        System.out.println("Even Number Count :: "+count);
    }

    private void reverseArray(char[] arr) {
        int st = 0, end = arr.length - 1;
        while ( st < end) {
            char ch = arr[st];
            arr[st] = arr[end];
            arr[end] = ch;
            st++;
            end--;
        }
        for (char ch : arr) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    private void printSumOfTheElementsInTheArray() {
        int[] arr = {1, 2, 3};
        long sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum :: "+sum);
    }

    private void printAddOddNumbers() {
        int[] arr = {32, 43, 4, 15};
        for (int num : arr) {
            if (num %2 == 1) {
                System.out.print(num+ " ");
            }
        }
        System.out.println();
    }

    private void printBiggestNumberAmongThreeNumbers(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 +" is Greater than other 2 numbers");
        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 +" is Greater than other 2 numbers");
        else
            System.out.println(num3 +" is Greater than other 2 numbers");
    }

    private void printAllNumbersEndingWithSeven(int st, int end) {
        boolean pass = false;
        while (st <= end) {
            if ( pass || (st%10) == 7) {
                if (pass == false)
                    pass = true;
                System.out.print(st+" ");
                st += 10;
            }
            else
                st++;
        }
        System.out.println();
    }

    private void printAllNumbersDivisbleByThree(int st, int end) {
        while (st <= end) {
            if (st  %3 == 0) {
                System.out.print(st+" ");
                st += 3;
            }
            else
                st++;
        }
        System.out.println();
    }

    private void printHundredPositionValueInWords(int number) {
        if (number < 1 ||  number >= 1000) return;
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("Hundred position of "+number+" is :: "+words[number/100]);
    }

    private void printSqaureValue() {
        int[] numbers = {2,3,4,5,6,7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(Math.pow(numbers[i],2)+" ");
        }
        System.out.println();
    }

    private void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+number+" = "+(i * number));
        }
    }

    private void checkVowelOrConsonant(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch += 32;
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Given Charcter is Vowel");
        else
            System.out.println("Given Charcter is Consonant");
    }

    private int printIndexOfGivenNumber(int key) {
        int[] numbers = {7, 15, 41};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key)
                return i;
        }
        return -1;
    }

    private void multiplyTwoArrays() {
        int[] arr1 = {2, 4, 1};
        int[] arr2 = {3, 5, 7};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(( arr1[i] * arr2[i] ) + " ");
        }
        System.out.println();
    }

    private void printGrade(int mark) {
        if (mark > 100) {
            System.out.println("Mark is Less than 101");
            return;
        }
        if (mark > 90)
            System.out.println("Grade : S");
        else if (mark > 80)
            System.out.println("Grade : A");
        else if (mark > 70)
            System.out.println("Grade : B");
        else if (mark > 60)
            System.out.println("Grade : C");
        else if (mark > 50)
            System.out.println("Grade : D");
        else
            System.out.println("Grade : F");
    }

    private void printAllEvenNumbersInReverseOrderBetweenTwoNumbers(int st, int end) {
        while (end >= st) {
            if (end %2 == 0)
                System.out.print(end+" ");
            end -= 1;
        }
        System.out.println();
    }
}