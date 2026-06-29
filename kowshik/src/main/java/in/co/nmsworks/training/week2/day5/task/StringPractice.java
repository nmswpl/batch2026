package in.co.nmsworks.training.week2.day5.task;

import java.util.Arrays;
import java.util.List;

public class StringPractice {
    public static void main(String[] args) {

        String input = "NMSWorks";
        int index = 5;
//        printsTheCharacterAtIndex(input, index);

//        lengthOfGivenString(input);

//        printsTheSubstring("Java Programming", 5);

//        printsTheSubstring("Welcome to Java", 11, 15);

//        checkSpecificSubstringExists("Java Programming", "prog");

        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
//        concatenateListOfStringsWithDelimiter(fruits);

        String str1 = "Hello";
        String str2 = "hello";
//        checkWhetherTwoStringsAreEqual(str1, str2);

//        checkWhetherGivenStringIsEmpty(str1);

//        concatenateString(str1, str2);

//        replaceAllOccurancesOfCharacter("Banana");

//        compareStringsIgnoringCase(str1, str2);

        String s = "One,Two,Three,four,five";
//        splitString(s);
//        splitStringWithLimit(s, 3);

//        findIndexOfCharacterInString("Java Programming", 'a');

        findOccuranceOfSubstring("Welcome to the world", "the", 10);

//        printInputToLowerCase("Java Programming");
//        printInputToUpperCase("Java Programming");

        convertInputToString(1234);
    }

    private static void convertInputToString(int input) {
        System.out.println("Output : " + String.valueOf(input));
    }

    private static void printInputToLowerCase(String input) {
        if (isNull(input)) {
            return;
        }

        System.out.println("To Lowercase : " + input.toLowerCase());
    }

    private static void printInputToUpperCase(String input) {
        if (isNull(input)) {
            return;
        }

        System.out.println("To Uppercase : " + input.toUpperCase());
    }

    //print input to lowercase
    //print input to uppercase
    //convert int input to string and print it

    private static void findOccuranceOfSubstring(String input, String searchSubstring, int fromIndex) {
        if (isNull(input)) {
            return;
        }

        int index = input.indexOf(searchSubstring, fromIndex);

        if(index != -1) {
            System.out.println("Index of first occurance of '" + searchSubstring + "' in " + input + " is : " + index);
        }
        else {
            System.out.println("Substring not found!");
        }
    }

    private static void findIndexOfCharacterInString(String input, char charToFind) {
        if (isNull(input)) {
            return;
        }

        int index = input.indexOf(charToFind);

        if (index != -1) {
            System.out.println("Index of first occurance of '" + charToFind + "' in " + input + " is : " + index);
        }
        else {
            System.out.println("Character not found");
        }

    }

    private static void splitStringWithLimit(String s, int limit) {
        if (isNull(s)) {
            return;
        }

        String[] words = s.split(",", limit);
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void splitString(String s) {
        if(isNull(s)) {
            return;
        }

        String[] words = s.split(",");

        System.out.println("Output : ");
        for (String word : words) {
            System.out.println(word);
        }
    }

    private static void compareStringsIgnoringCase(String str1, String str2) {
        if (isNull(str1) || isNull(str2)) {
            return;
        }

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not equal");
        }
    }

    private static void replaceAllOccurancesOfCharacter(String input) {
        if (isNull(input)) {
            return;
        }

        String modifiedStr = input.replace('a', 'o');

        System.out.println("Original String : " + input);
        System.out.println("Modified String : " + modifiedStr);
    }


    private static void concatenateString(String str1, String str2) {
        if(isNull(str1) || isNull(str2)) {
            return;
        }

        String result = str1.concat(str2);
        System.out.println("Output : " + result);
    }

    private static void checkWhetherGivenStringIsEmpty(String str) {
        if (isNull(str)) {
            return;
        }

        if (str.trim().isEmpty()) {
            System.out.println("Empty");
        }
        else {
            System.out.println("Not empty");
        }
    }

    private static boolean isNull(String inputStr) {
        if(inputStr == null) {
            System.out.println("Invalid input!!");
            return true;
        }

        return false;
    }

    private static void checkWhetherTwoStringsAreEqual(String str1, String str2) {
        if (isNull(str1) || isNull(str2)) {
            return;
        }

        if (str1.equals(str2)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }

    private static void concatenateListOfStringsWithDelimiter(List<String> fruits) {
        String result = String.join(", ", fruits);
        System.out.println("Output : " + result);
    }

    private static void checkSpecificSubstringExists(String inputStr, String toFind) {
        if (isNull(inputStr)) {
            return;
        }

        if(inputStr.contains(toFind)) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }

    private static void printsTheSubstring(String input, int beginIndex, int endIndex) {
        if (isNull(input)) {
            return;
        }

        System.out.println("Substring : " + input.substring(11, 15));
    }

    private static void printsTheSubstring(String input, int beginIndex) {
        if (isNull(input)) {
            return;
        }

        System.out.println("Substring : " + input.substring(beginIndex));
    }

    private static void printsTheCharacterAtIndex(String inputStr, int index) {
        if (isNull(inputStr)) {
            return;
        }

        System.out.println("Input String : " + inputStr);
        System.out.println("Character at index - " + index + " is : " + inputStr.charAt(index));
    }

    private static void lengthOfGivenString(String inputStr) {
        if (isNull(inputStr)) {
            return;
        }

        System.out.println("Length of " + inputStr + " is : " + inputStr.length());
    }
}

