package in.co.nmsworks.training.week2.Day5.StringMethods;

public class StringMethodPractice {

    public static void main(String[] args) {
        System.out.println("--- Question 1 ---");
        printCharAt("NMSWorks", 5);

        System.out.println("\n--- Question 2 ---");
        printLength("OpenAI");

        System.out.println("\n--- Question 3 ---");
        printSubstringFromIndex("Java Programming", 5);

        System.out.println("\n--- Question 4 ---");
        printSubstringRange("Welcome to Java", 11, 15);

        System.out.println("\n--- Question 5 ---");
        checkContains("Java Programming", "Prog");

        System.out.println("\n--- Question 6 ---");
        joinStrings(", ", "apple", "banana", "cherry");

        System.out.println("\n--- Question 7 ---");
        checkEquality("hello", "Hello");

        System.out.println("\n--- Question 8 ---");
        checkIsEmpty(" ");

        System.out.println("\n--- Question 9 ---");
        concatStrings("Hello", "World");

        System.out.println("\n--- Question 10 ---");
        replaceCharacters("banana", 'a', 'o');

        System.out.println("\n--- Question 11 ---");
        checkEqualityIgnoreCase("hello", "HELLO");

        System.out.println("\n--- Question 12 ---");
        splitString("one, two, three", ",");

        System.out.println("\n--- Question 13 ---");
        splitStringWithLimit("apple;banana;cherry;date", ";", 3);

        System.out.println("\n--- Question 14 ---");
        findFirstIndexOfChar("programming", 'g');

        System.out.println("\n--- Question 15 ---");
        findIndexOfSubstringFromIndex("welcome to the world", "the", 10);

        System.out.println("\n--- Question 16 ---");
        convertToLowerCase("Java Programming");

        System.out.println("\n--- Question 17 ---");
        convertToUpperCase("welcome to Java");

        System.out.println("\n--- Question 18 ---");
        convertIntegerToString(1234);
    }

    // Question-1: Print the character at a specific index [cite: 2]
    public static void printCharAt(String str, int index) {
        if (index >= 0 && index < str.length()) {
            System.out.println("Character at index " + index + " in \"" + str + "\": " + str.charAt(index));
        } else {
            System.out.println("Invalid index");
        }
    }

    // Question-2: Print the length of a given string [cite: 4]
    public static void printLength(String str) {
        System.out.println("Length of \"" + str + "\": " + str.length());
    }

    // Question-3: Extract and print substring from a specified index [cite: 6]
    public static void printSubstringFromIndex(String str, int beginIndex) {
        System.out.println("Substring of \"" + str + "\" from index " + beginIndex + ": " + str.substring(beginIndex));
    }

    // Question-4: Extract and print substring between beginIndex and endIndex [cite: 8]
    public static void printSubstringRange(String str, int beginIndex, int endIndex) {
        System.out.println("Substring of \"" + str + "\" from index " + beginIndex + " to " + endIndex + ": " + str.substring(beginIndex, endIndex));
    }

    // Question-5: Check if string contains a specific substring [cite: 10]
    public static void checkContains(String str, String substring) {
        if (str.contains(substring)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    // Question-6: String.join to concatenate strings with a delimiter [cite: 13]
    public static void joinStrings(String delimiter, String... elements) {
        String result = String.join(delimiter, elements);
        System.out.println("Joined String: " + result);
    }

    // Question-7: Compare two strings for equality [cite: 15]
    public static void checkEquality(String str1, String str2) {
        boolean isEqual = str1.equals(str2);
        System.out.println("Is \"" + str1 + "\" equal to \"" + str2 + "\"? " + isEqual);
    }

    // Question-8: Check if a given string is empty [cite: 17]
    public static void checkIsEmpty(String str) {
        if (str.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
    }

    // Question-9: Concatenate strings using the 'concat' method [cite: 19]
    public static void concatStrings(String str1, String str2) {
        System.out.println("Concatenated String: " + str1.concat(str2));
    }

    // Question-10: Replace all occurrences of a specific character [cite: 21]
    public static void replaceCharacters(String str, char oldChar, char newChar) {
        System.out.println("Replaced String: " + str.replace(oldChar, newChar));
    }

    // Question-11: Compare two strings for equality, ignoring case [cite: 23]
    public static void checkEqualityIgnoreCase(String str1, String str2) {
        boolean isEqual = str1.equalsIgnoreCase(str2);
        System.out.println("Is \"" + str1 + "\" equal to \"" + str2 + "\" (ignoring case)? " + isEqual);
    }

    // Question-12: Split a string based on a delimiter [cite: 25]
    public static void splitString(String str, String delimiter) {
        String[] substrings = str.split(delimiter);
        System.out.println("Split substrings:");
        for (String sub : substrings) {
            System.out.println("-> " + sub.trim());
        }
    }

    // Question-13: Split a string with a specified limit [cite: 27]
    public static void splitStringWithLimit(String str, String delimiter, int limit) {
        String[] substrings = str.split(delimiter, limit);
        System.out.println("Split substrings with limit " + limit + ":");
        for (String sub : substrings) {
            System.out.println("-> " + sub);
        }
    }

    // Question-14: Find the index of the first occurrence of a specific character [cite: 29]
    public static void findFirstIndexOfChar(String str, char ch) {
        System.out.println("First index of '" + ch + "' in \"" + str + "\": " + str.indexOf(ch));
    }

    // Question-15: Find index of substring starting from a specified index [cite: 31]
    public static void findIndexOfSubstringFromIndex(String str, String substring, int fromIndex) {
        System.out.println("Index of \"" + substring + "\" in \"" + str + "\" starting from index " + fromIndex + ": " + str.indexOf(substring, fromIndex));
    }

    // Question-16: Convert a string to lowercase [cite: 33]
    public static void convertToLowerCase(String str) {
        System.out.println("Lowercase: " + str.toLowerCase());
    }

    // Question-17: Convert a string to uppercase [cite: 35]
    public static void convertToUpperCase(String str) {
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    // Question-18: Convert an integer to a string using String.valueOf [cite: 37]
    public static void convertIntegerToString(int value) {
        String strValue = String.valueOf(value);
        System.out.println("String value of integer: " + strValue);
    }
}