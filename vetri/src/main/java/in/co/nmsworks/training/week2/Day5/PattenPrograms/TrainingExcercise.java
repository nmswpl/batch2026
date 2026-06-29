package in.co.nmsworks.training.week2.Day5.PattenPrograms;

public class TrainingExcercise {

    public static void main(String[] args) {
        System.out.println("--- 1. Even Numbers 700 to 601 (Descending) ---");
        printEvenNumbersDescending();

        System.out.println("\n\n--- 2. Grade Calculator ---");
        printStudentGrade(85);

        System.out.println("\n--- 3. Element-by-Element Array Multiplication ---");
        int[] firstFactorArray = {2, 4, 1};
        int[] secondFactorArray = {3, 5, 7};
        multiplyTwoArrays(firstFactorArray, secondFactorArray);

        System.out.println("\n\n--- 4. Search Element Position ---");
        int[] searchSampleArray = {7, 15, 41};
        printElementPosition(searchSampleArray, 41);
        printElementPosition(searchSampleArray, 5);

        System.out.println("\n--- 5. Vowel or Consonant Checker ---");
        checkIfCharacterIsVowelOrConsonant('e');
        checkIfCharacterIsVowelOrConsonant('Z');

        System.out.println("\n--- 6. Multiplication Table of 17 ---");
        printMultiplicationTableOfSeventeen();

        System.out.println("\n--- 7. Square Array Elements ---");
        int[] baseNumbersArray = {2, 4, 3, 5};
        printSquaredArrayElements(baseNumbersArray);

        System.out.println("\n\n--- 8. Hundreds Position Value in Words ---");
        printHundredsDigitInWords(542);
        printHundredsDigitInWords(777);

        System.out.println("\n--- 9. Numbers Divisible by 3 (Between 300 and 400) ---");
        printNumbersDivisibleByThree();

        System.out.println("\n\n--- 10. Numbers ending with 7 (Between 200 and 500) ---");
        printNumbersEndingWithSeven();

        System.out.println("\n\n--- 11. Biggest of 3 Numbers ---");
        printLargestOfThreeNumbers(12, 24, 5);
        printLargestOfThreeNumbers(18, 18, 35);

        System.out.println("\n--- 12. Count Odd Elements ---");
        int[] oddCheckArray = {32, 43, 4, 15};
        countAndPrintOddElements(oddCheckArray);

        System.out.println("\n--- 13. Sum of Array Elements ---");
        int[] sumSampleArray = {1, 2, 3};
        printSumOfArrayElements(sumSampleArray);

        System.out.println("\n--- 14. Reverse a String Array ---");
        String[] textArray = {"a", "b", "c"};
        reverseAndPrintStringArray(textArray);

        System.out.println("\n\n--- 15. Count and Print Even Elements ---");
        int[] evenCheckArray = {2, 3, 4, 5, 6};
        countAndPrintEvenElements(evenCheckArray);

        System.out.println("\n--- 16. Factorial Using Recursion ---");
        int factorialInput = 5;
        int factorialResult = calculateFactorialRecursively(factorialInput);
        System.out.println("Factorial of " + factorialInput + " = " + factorialResult);

        System.out.println("\n--- 17. Find Largest Element in Array ---");
        int[] largestElementSampleArray = {12, 3, 20, 14};
        printLargestElementInArray(largestElementSampleArray);

        System.out.println("\n--- 18. Count Occurrences of Element ---");
        int[] occurrenceSampleArray = {1, 2, 3, 2, 2, 3};
        countOccurrencesOfElement(occurrenceSampleArray, 2);

        System.out.println("\n--- 19. Palindrome Checker ---");
        checkIfStringIsPalindrome("level");
        checkIfStringIsPalindrome("abc");

        System.out.println("\n--- 20. Prime Number Checker ---");
        checkIfNumberIsPrime(7);
        checkIfNumberIsPrime(10);
    }

    // 1. Print all even numbers between 601 and 700 in descending order.
    public static void printEvenNumbersDescending() {
        for (int currentNumber = 700; currentNumber >= 601; currentNumber--) {
            if (currentNumber % 2 == 0) {
                System.out.print(currentNumber + " ");
            }
        }
    }

    // 2. Print the Grade for a given Mark.
    public static void printStudentGrade(int studentMark) {
        char finalGrade;
        if (studentMark >= 91 && studentMark <= 100) {
            finalGrade = 'S';
        } else if (studentMark >= 81 && studentMark <= 90) {
            finalGrade = 'A';
        } else if (studentMark >= 71 && studentMark <= 80) {
            finalGrade = 'B';
        } else if (studentMark >= 61 && studentMark <= 70) {
            finalGrade = 'C';
        } else if (studentMark >= 51 && studentMark <= 60) {
            finalGrade = 'D';
        } else {
            finalGrade = 'F';
        }
        System.out.println("Mark: " + studentMark + " -> Grade: " + finalGrade);
    }

    // 3. Multiply two arrays of same size element-by-element.
    public static void multiplyTwoArrays(int[] firstArray, int[] secondArray) {
        int[] multiplicationResultArray = new int[firstArray.length];
        System.out.print("Output: ");
        for (int index = 0; index < firstArray.length; index++) {
            multiplicationResultArray[index] = firstArray[index] * secondArray[index];
            System.out.print(multiplicationResultArray[index] + " ");
        }
    }

    // 4. Print the position of given element in an array. If not present, print -1.
    public static void printElementPosition(int[] numbersArray, int targetSearchElement) {
        int targetPosition = -1;
        for (int index = 0; index < numbersArray.length; index++) {
            if (numbersArray[index] == targetSearchElement) {
                targetPosition = index;
                break;
            }
        }
        System.out.println("Search Element: " + targetSearchElement + " -> Output: " + targetPosition);
    }

    // 5. Check if a given Character is a Vowel or Consonant.
    public static void checkIfCharacterIsVowelOrConsonant(char inputCharacter) {
        char lowerCaseCharacter = Character.toLowerCase(inputCharacter);

        if (lowerCaseCharacter == 'a' || lowerCaseCharacter == 'e' ||
                lowerCaseCharacter == 'i' || lowerCaseCharacter == 'o' ||
                lowerCaseCharacter == 'u') {
            System.out.println(inputCharacter + " is a Vowel");
        } else if (Character.isLetter(lowerCaseCharacter)) {
            System.out.println(inputCharacter + " is a Consonant");
        } else {
            System.out.println(inputCharacter + " is not a valid letter");
        }
    }

    // 6. Print the multiplication table of 17 upto 10 numbers.
    public static void printMultiplicationTableOfSeventeen() {
        int baseTableNumber = 17;
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            int productionResult = baseTableNumber * multiplier;
            System.out.println(baseTableNumber + " x " + multiplier + " = " + productionResult);
        }
    }

    // 7. Print the square of every element present in the array.
    public static void printSquaredArrayElements(int[] originalNumbersArray) {
        System.out.print("Output: ");
        for (int index = 0; index < originalNumbersArray.length; index++) {
            int squaredValue = originalNumbersArray[index] * originalNumbersArray[index];
            System.out.print(squaredValue + " ");
        }
    }

    // 8. Given a 3 digit number, print the hundred position value in words.
    public static void printHundredsDigitInWords(int threeDigitNumber) {
        int hundredsPlaceDigit = threeDigitNumber / 100;
        String[] digitWords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        if (hundredsPlaceDigit >= 1 && hundredsPlaceDigit <= 9) {
            System.out.println("Input: " + threeDigitNumber + " -> Output: " + digitWords[hundredsPlaceDigit]);
        } else {
            System.out.println("Input: " + threeDigitNumber + " -> Error: Not a valid positive 3-digit number");
        }
    }

    // 9. Print all numbers divisible by 3 greater than 300 and less than 400.
    public static void printNumbersDivisibleByThree() {
        for (int currentNumber = 301; currentNumber < 400; currentNumber++) {
            if (currentNumber % 3 == 0) {
                System.out.print(currentNumber + " ");
            }
        }
    }

    // 10. Print all numbers between 200 and 500 ending with 7.
    public static void printNumbersEndingWithSeven() {
        for (int currentNumber = 200; currentNumber <= 500; currentNumber++) {
            if (currentNumber % 10 == 7) {
                System.out.print(currentNumber + " ");
            }
        }
    }

    // 11. Print the biggest of 3 numbers.
    public static void printLargestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int largestNumber;
        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            largestNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            largestNumber = secondNumber;
        } else {
            largestNumber = thirdNumber;
        }
        System.out.println("Inputs: (" + firstNumber + ", " + secondNumber + ", " + thirdNumber + ") -> Output: " + largestNumber);
    }

    // 12. Given an array of integers, print the number of odd elements.
    public static void countAndPrintOddElements(int[] integerNumbersArray) {
        int totalOddCount = 0;
        for (int index = 0; index < integerNumbersArray.length; index++) {
            if (integerNumbersArray[index] % 2 != 0) {
                totalOddCount++;
            }
        }
        System.out.println("Odd elements = " + totalOddCount);
    }

    // 13. Given an array of integers, find the sum of the elements.
    public static void printSumOfArrayElements(int[] numbersToSum) {
        int accumulatedSum = 0;
        for (int index = 0; index < numbersToSum.length; index++) {
            accumulatedSum += numbersToSum[index];
        }
        System.out.println("Output: " + accumulatedSum);
    }

    // 14. Given an array of Strings, reverse the array and print.
    public static void reverseAndPrintStringArray(String[] originalStringArray) {
        int arrayLength = originalStringArray.length;
        String[] reversedStringArray = new String[arrayLength];

        for (int index = 0; index < arrayLength; index++) {
            reversedStringArray[index] = originalStringArray[arrayLength - 1 - index];
        }

        System.out.print("Output: arr[] = {");
        for (int index = 0; index < arrayLength; index++) {
            System.out.print(reversedStringArray[index]);
            if (index < arrayLength - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }

    // 15. Given an array of integers, count and print even elements.
    public static void countAndPrintEvenElements(int[] sampleNumbersArray) {
        int evenNumbersCounter = 0;
        for (int index = 0; index < sampleNumbersArray.length; index++) {
            if (sampleNumbersArray[index] % 2 == 0) {
                evenNumbersCounter++;
            }
        }
        System.out.println("even elements = " + evenNumbersCounter);
    }

    // 16. Use Recursion to find and print the factorial of a number.
    public static int calculateFactorialRecursively(int currentFactorialNumber) {
        if (currentFactorialNumber <= 1) {
            return 1;
        }
        return currentFactorialNumber * calculateFactorialRecursively(currentFactorialNumber - 1);
    }

    // 17. Given an array of integers, find the largest element.
    public static void printLargestElementInArray(int[] collectionOfNumbers) {
        int currentLargestElement = collectionOfNumbers[0];
        for (int index = 1; index < collectionOfNumbers.length; index++) {
            if (collectionOfNumbers[index] > currentLargestElement) {
                currentLargestElement = collectionOfNumbers[index];
            }
        }
        System.out.println("Largest element = " + currentLargestElement);
    }

    // 18. Given an array of integers and int x, print the number of occurrences of x.
    public static void countOccurrencesOfElement(int[] valuesArray, int elementToSearchFor) {
        int occurrenceCounter = 0;
        for (int index = 0; index < valuesArray.length; index++) {
            if (valuesArray[index] == elementToSearchFor) {
                occurrenceCounter++;
            }
        }
        System.out.println("x (" + elementToSearchFor + ") occurs " + occurrenceCounter + " times");
    }

    // 19. Given a String, check if it is a palindrome or not.
    public static void checkIfStringIsPalindrome(String textToAnalyze) {
        boolean isWordPalindrome = true;
        int textLength = textToAnalyze.length();

        for (int index = 0; index < textLength / 2; index++) {
            if (textToAnalyze.charAt(index) != textToAnalyze.charAt(textLength - 1 - index)) {
                isWordPalindrome = false;
                break;
            }
        }

        if (isWordPalindrome) {
            System.out.println("Input: str = \"" + textToAnalyze + "\" -> Output: Palindrome");
        } else {
            System.out.println("Input: str = \"" + textToAnalyze + "\" -> Output: Not Palindrome");
        }
    }

    // 20. Given an integer x, check whether x is Prime or not.
    public static void checkIfNumberIsPrime(int numberToCheck) {
        boolean isPrimeNumber = true;

        if (numberToCheck <= 1) {
            isPrimeNumber = false;
        } else {
            for (int divisor = 2; divisor <= Math.sqrt(numberToCheck); divisor++) {
                if (numberToCheck % divisor == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        if (isPrimeNumber) {
            System.out.println("Input: x = " + numberToCheck + " -> Output: Prime");
        } else {
            System.out.println("Input: x = " + numberToCheck + " -> Output: Not Prime");
        }
    }
}