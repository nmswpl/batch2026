package in.co.nmsworks.training.week2.Day1;

public class StringPractice {

    public static void main(String[] args) {

        reverseWords("India is my country");

        checkPalindrome("dad");

        printEvenLengthWords("This is a java language");

        removeLeadingZeros("0005640");

        printSentences("The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.");

        countVowelsConsonants("Hello World");

        removeDuplicates("aabbcc");

        convertToTitleCase("the quick brown fox jumps over the lazy dog");

        longestWord("The quick brown fox jumps over the lazy dog");

        reverseString("Hello");

        removeSpaces("Hello World Java");
    }

    // 1. Reverse words in a sentence
    public static void reverseWords(String str) {
        System.out.println("1. Reverse Words");

        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        System.out.println("\n");
    }

    // 2. Palindrome
    public static void checkPalindrome(String str) {
        System.out.println("2. Palindrome Check");

        boolean palindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        System.out.println();
    }

    // 3. Even length words
    public static void printEvenLengthWords(String str) {
        System.out.println("3. Even Length Words");

        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }

        System.out.println();
    }

    // 4. Remove leading zeros
    public static void removeLeadingZeros(String str) {
        System.out.println("4. Remove Leading Zeros");

        int i = 0;

        while (i < str.length() && str.charAt(i) == '0') {
            i++;
        }

        System.out.println(str.substring(i));

        System.out.println();
    }

    // 5. Print each sentence in new line
    public static void printSentences(String para) {
        System.out.println("5. Sentences");

        String[] sentences = para.split("\\.");

        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }

        System.out.println();
    }

    // 6. Count vowels and consonants
    public static void countVowelsConsonants(String str) {
        System.out.println("6. Vowels and Consonants");

        int vowels = 0;
        int consonants = 0;

        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                vowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        System.out.println();
    }

    // 7. Remove duplicate characters
    public static void removeDuplicates(String str) {
        System.out.println("7. Remove Duplicates");

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);

        System.out.println();
    }

    // 8. Convert every word to title case
    public static void convertToTitleCase(String str) {
        System.out.println("8. Title Case");

        String[] words = str.split(" ");

        String result = "";

        for (String word : words) {

            String first = word.substring(0, 1).toUpperCase();
            String remaining = word.substring(1).toLowerCase();

            result += first + remaining + " ";
        }

        System.out.println(result);

        System.out.println();
    }

    // 9. Longest word in sentence
    public static void longestWord(String str) {
        System.out.println("9. Longest Word");

        String[] words = str.split(" ");

        String longest = words[0];

        for (int i = 1; i < words.length; i++) {

            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println(longest);

        System.out.println();
    }

    // 10. Reverse string
    public static void reverseString(String str) {
        System.out.println("10. Reverse String");

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println(reverse);

        System.out.println();
    }

    // 11. Remove spaces
    public static void removeSpaces(String str) {
        System.out.println("11. Remove Spaces");

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != ' ') {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }
}