package in.co.nmsworks.training.week2.day1;

import java.text.StringCharacterIterator;

public class StringPractice {
    public static void main(String[] args) {
        reverseAndPrintTheString();
        checkForPalindrome();
        printWordsWithEvenLength();
        removeZeroAndPrintTheNumber();
        printEachSentenceInNewLine();
        printNoOfVowelsAndConsonants();
        capitaliseFirstLetterOfTheWord();
        printTheLongestWordInSentence();
        printTheReversedString();
        removeAllSpaceAndPrintString();
        removeDuplicateCharacter();
    }

    private static void removeDuplicateCharacter() {
        String string = "aabbcc";
        String answer = "";

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
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
        String string = "the quick brown fox jumps over the lazy dog";
        String answer = string.replace(" ","");
        System.out.println("String after removing space is: "+answer);
    }

    private static void printTheReversedString() {
        String name = "brathika";
        int length = name.length();
        String reverseString = "";
        for (int i = length-1; i >=0; i--) {
            reverseString += name.charAt(i);
        }
        System.out.println("The reversed string is: "+reverseString);
    }

    private static void printTheLongestWordInSentence() {
        String string = "my name is brathika";
        String answer = "";
        int max = 0;
        String[] arr = string.split(" ");
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
        String string = "the quick brown fox jumps over the lazy dog";
        String[] sentence = string.split(" ");
        for (String s : sentence) {
            String word = s.substring(0 , 1).toUpperCase() + s.substring(1);
            System.out.print(word+" ");
        }
        System.out.println();
    }

    private static void printNoOfVowelsAndConsonants() {
        String string = "Hello World";
        string = string.toLowerCase();
        int vowels = 0 , consonants = 0;
        for (int i = 0; i < string.length() ; i++) {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                vowels ++;
            } else if (string.charAt(i) == ' ') {
                continue;
            } else {
                consonants ++;
            }
        }
        System.out.println("No of vowels are: "+vowels);
        System.out.println("No of consonants: "+consonants);
    }

    private static void printEachSentenceInNewLine() {
        String string = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        String[] sentence = string.split(",");
        for (String s : sentence) {
            System.out.println(s);
        }
    }

    private static void removeZeroAndPrintTheNumber() {
        String string = "0005640";
        int i = 0;
        while ( i < string.length() && string.charAt(i) == '0'){
            i++;
        }
        String answer = string.substring(i);
        System.out.println("The number after zero removed is: "+answer);
    }

    private static void printWordsWithEvenLength() {
        String string = "This is a java language";
        String[] arr = string.split(" ");
        for (String s : arr) {
            if(s.length() % 2 == 0) {
                System.out.println(s+" ");
            }
        }
    }

    private static void checkForPalindrome() {
        String string = "dad";
        String revere = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            revere += string.charAt(i);

        }
        if (string.equals(revere)){
            System.out.println(string+" is a palindrome");
        }
        else {
            System.out.println(string+" is not a palindrome");
        }
    }

    private static void reverseAndPrintTheString() {
        String string = "India is my country";
        String[] stringArray = string.split(" ");
        for (int i = stringArray.length - 1; i >= 0; i--) {
            System.out.print(stringArray[i]+" ");
        }
        System.out.println();
    }

}
