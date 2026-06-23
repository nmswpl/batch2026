package in.co.nmsworks.training.week2.day1;

import java.text.StringCharacterIterator;

public class StringPractice {
    public static void main(String[] args) {
        reverseAndPrintTheString();
        checkForPalindrom();
        printWordsWithEvenLength();
        removeZeroAndPrintTheNumber();
        printEachSentenceInNewLine();
        printNoOfVowelsAndConsonants();
        capitaliseFirstLetterOfTheWord();
        printTheLongestWordInSentence();
        PrintTheReversedString();
        removeAllSpaceAndPrintString();
        removeDuplicateCharacter();
    }

    private static void removeDuplicateCharacter() {
        String str = "aabbcc";
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!answer.contains(String.valueOf(ch))) {
                answer += ch;
            }
            else {
                continue;
            }
        }
        System.out.println("String after removing duplicates character: "+answer);
    }

    private static void removeAllSpaceAndPrintString() {
        String str = "the quick brown fox jumps over the lazy dog";
        String answer = str.replace(" ","");
        System.out.println("String after removing space is: "+answer);
    }

    private static void PrintTheReversedString() {
        String name = "brathika";
        int n = name.length();
        String reverseString = "";
        for (int i = n-1; i >=0; i--) {
            reverseString += name.charAt(i);
        }
        System.out.println("The reversed string is: "+reverseString);
    }

    private static void printTheLongestWordInSentence() {
        String str = "my name is brathika";
        String answer = "";
        int max = 0;
        String[] arr = str.split(" ");
        for (String s : arr) {
            int n = s.length();
            if (n > max) {
                max = n;
                answer = s;
            }
        }
        System.out.println("The longest word: "+answer);
    }

    private static void capitaliseFirstLetterOfTheWord() {
        String str = "the quick brown fox jumps over the lazy dog";
        String[] sentence = str.split(" ");
        for (String s : sentence) {
            String word = s.substring(0 , 1).toUpperCase() + s.substring(1);
            System.out.print(word+" ");
        }
        System.out.println();
    }

    private static void printNoOfVowelsAndConsonants() {
        String str = "Hello World";
        String value = str.toLowerCase();
        int vowels = 0 , consonants = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowels ++;
            }
            else {
                consonants ++;
            }
        }
        System.out.println("No of vowels are: "+vowels);
        System.out.println("No of consonants: "+consonants);
    }

    private static void printEachSentenceInNewLine() {
        String str = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] sentence = str.split(",");
        for (String s : sentence) {
            System.out.println(s);
        }
    }

    private static void removeZeroAndPrintTheNumber() {
        String str = "0005640";
        int i = 0;
        while ( i < str.length() && str.charAt(i) == '0'){
            i++;
        }
        String answer = str.substring(i);
        System.out.println("The number after zero removed is: "+answer);
    }

    private static void printWordsWithEvenLength() {
        String str = "This is a java language";
        String[] arr = str.split(" ");
        for (String s : arr) {
            if(s.length() % 2 == 0) {
                System.out.println(s+" ");
            }
        }
    }

    private static void checkForPalindrom() {
        String str1 = "dad";
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

    private static void reverseAndPrintTheString() {
        String str = "India is my country";
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
