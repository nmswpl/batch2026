package in.co.nmsworks.training.week2.day1;

public class StringPractice
{
    public static void main(String[] args) {
        String str = "India is my country";
        System.out.println("Input : " + str);
        reverseWordsInString(str);
        System.out.println();
        System.out.println("Given string is a palindrome : " + isPalindrome("dad"));
        printLongestWord("The quick brown fox jumps over the lazy dog");
        printWordsInEvenLength("This is a java language");
        printSentenceInNewLine("The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.");
        removeSpaces("  Nam e  ");
        String str1 = "My name is Sibani";
        System.out.println("Output : " + reverseString(str1));
        convertFirstLetterToCaps("the quick brown fox jumps over the lazy dog");
        removeleedingZero("0005640");
        removeDuplicates();
        vowelCountAndConsonantCount();

    }

    private static void removeDuplicates() {
        String str ="aabbcc";
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(word.contains(String.valueOf(ch))){
                continue;
            }
            else {
                word += ch;
            }
        }
        System.out.println("After Remove Duplicates :" + word);
    }

    private static void vowelCountAndConsonantCount() {
        String input = "Hello World";
        int vowels = 0;
        int consonants = 0;
        String lowerInput = input.toLowerCase();
        for (int i = 0; i < lowerInput.length(); i++) {
            char ch = lowerInput.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Check if the letter is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    private static void removeleedingZero(String str) {
        int i =0;
        while (i < str.length() && str.charAt(i) == '0'){
            i++;
        }

        System.out.println("After replacing leading zeros :" + str.substring(i));
    }

    private static void convertFirstLetterToCaps(String s) {
        String[] str2 = s.split(" ");
        for (String word : str2) {
            String ans = word.substring(0,1).toUpperCase() + word.substring(1);
            System.out.print(ans + " ");
        }
    }

    private static void printSentenceInNewLine(String str) {
        String[] str2 = str.split("\\.");
        for (String s : str2) {
            System.out.println(s);
        }
    }

    public static void reverseWordsInString(String str) {
        String[] str2 = str.split(" ");
        System.out.println("Output :");
        for (int i = str2.length -1; i >=0 ; i--) {
            System.out.print(str2[i] + " ");
        }
    }

    public static boolean isPalindrome(String str1){
        String str2 = "";
        for (int i = str1.length()-1; i>=0 ; i--) {
            str2 += str1.charAt(i);
        }
        if (str2.equals(str1)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void printWordsInEvenLength(String str1) {
        String[] str2 = str1.split(" ");
        for (String s : str2)  {
            if (s.length() % 2 == 0){
                System.out.println(s);
            }
        }
    }
    public static void printLongestWord(String str){
        String[] words = str.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);


        }

    public static void removeSpaces(String str) {
        System.out.println("Given string without spaces : " + str.replace(" " , ""));
    }

    public static String reverseString(String str1){
        String str2 = "";
        for (int i = str1.length()-1; i>=0 ; i--) {
            str2 += str1.charAt(i);
        }
        return str2;
    }


}