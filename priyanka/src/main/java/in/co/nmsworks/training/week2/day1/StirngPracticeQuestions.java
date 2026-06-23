package in.co.nmsworks.training.week2.day1;

import javax.lang.model.element.NestingKind;

public class StirngPracticeQuestions {
    public static void main(String[] args) {
        reverseWords("India is my Country");
        palindrome("Dad");
        evenLengthWords("This is a Java language");
        removeLeadingZeros("0005640");
        printSentencesInNewLine("The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.");
        vowelsConsonantsCount("Hello World");
        longestWord("Welcome to javaProgramming");
        reverseWithoutBuiltin("India is my country");
        removeSpace("Welcome to programming");
        removeDuplicates("aabbcc");
        titleCase("this is dog");
    }

    public static void titleCase(String str) {
        String result = "";
        result+=Character.toUpperCase(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1)==' '){
                result+=Character.toUpperCase(str.charAt(i));
            }
            else{
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void removeDuplicates(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if(ch == str.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result += ch;
            }
        }
        System.out.println(result);

    }


    public static void printSentencesInNewLine(String str) {
        String[] sent = str.split("\\.");
        for (int i = 0; i < sent.length; i++) {
            System.out.println(sent[i]);
        }
    }

    public static void removeLeadingZeros(String number) {
        String newWord = "";
        boolean leading = true;
        for (int i = 0; i < number.length(); i++) {
            char ch=number.charAt(i);
            if(ch == '0' && leading){
                newWord += "";
            }
            else{
                newWord += ch;
                leading=false;
            }
        }
        System.out.println(newWord);


    }


    public static void reverseWords(String str) {
        StringBuilder rev = new StringBuilder();
        String[] words = str.split(" ");
        for(int i= words.length-1; i>=0; i--){
            rev.append(words[i]+" ");
        }
        System.out.println(rev.toString());
    }

    public static void palindrome(String str) {
        String reverse = "";
        String original = str.toLowerCase();
        String temp = original;
        for (int i = original.length()-1; i >= 0 ; i--) {
            reverse += original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }

    public static void evenLengthWords(String str) {
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() % 2 == 0){
                System.out.println(words[i]);
            }
        }
    }

    public static void vowelsConsonantsCount(String string) {
        int vowel = 0;
        int consonant = 0;
        String str = string.toLowerCase();
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonant: " + consonant);
    }

    public static void longestWord(String str){
        String[] words = str.split(" ");
        int longestLength=0;
        int index=0;

        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > longestLength){
                longestLength = words[i].length();
                index=i;
            }
        }
        System.out.println(words[index]);

    }

    public static void reverseWithoutBuiltin(String str) {
        StringBuilder rev = new StringBuilder();
        String[] words = str.split(" ");
        for(int i= words.length-1; i>=0; i--){
            rev.append(words[i]+" ");
        }
        System.out.println(rev.toString());
    }

    public static void removeSpace(String str){
        String result = str.replaceAll("\\s","");
        System.out.println(result);
    }
}
