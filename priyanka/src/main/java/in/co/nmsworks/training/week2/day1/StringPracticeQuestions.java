package in.co.nmsworks.training.week2.day1;

public class StringPracticeQuestions {
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

    public static void titleCase(String input) {
        if(input.equals("") || input == null){
            System.out.println("empty string");
            return;
        }
        String result = "";
        result+=Character.toUpperCase(input.charAt(0));
        for (int i = 1; i < input.length(); i++) {
            if(input.charAt(i-1)==' '){
                result+=Character.toUpperCase(input.charAt(i));
            }
            else{
                result+= input.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void removeDuplicates(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if(character == input.charAt(j)){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result += character;
            }
        }
        System.out.println(result);

    }


    public static void printSentencesInNewLine(String string) {
        String[] sentence = string.split("\\.");
        for (int i = 0; i < sentence.length; i++) {
            System.out.println(sentence[i]);
        }
    }

    public static void removeLeadingZeros(String number) {
        String newWord = "";
        boolean leading = true;
        for (int i = 0; i < number.length(); i++) {
            char character =number.charAt(i);
            if(character == '0' && leading){
                newWord += "";
            }
            else{
                newWord += character;
                leading=false;
            }
        }
        System.out.println(newWord);


    }


    public static void reverseWords(String string) {
        StringBuilder reverse = new StringBuilder();
        String[] words = string.split(" ");
        for(int i= words.length-1; i>=0; i--){
            reverse.append(words[i]+" ");
        }
        System.out.println(reverse.toString());
    }

    public static void palindrome(String string) {
        String reverse = "";
        String original = string.toLowerCase();
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

    public static void evenLengthWords(String string) {
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() % 2 == 0){
                System.out.println(words[i]);
            }
        }
    }

    public static void vowelsConsonantsCount(String string) {
        int vowel = 0;
        int consonant = 0;
        String lowerCaseString = string.toLowerCase();
        for(int i = 0; i < lowerCaseString.length(); i++){
            char character = lowerCaseString.charAt(i);
            if(Character.isAlphabetic(character)){
                if( character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ){
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

    public static void longestWord(String string){
        String[] words = string.split(" ");
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

    public static void reverseWithoutBuiltin(String string) {
        StringBuilder reverse = new StringBuilder();
        String[] words = string.split(" ");
        for(int i= words.length-1; i>=0; i--){
            reverse.append(words[i]+" ");
        }
        System.out.println(reverse.toString());
    }

    public static void removeSpace(String string){
        String result = string.replaceAll("\\s","");
        System.out.println(result);
    }
}
