package in.co.nmsworks.training.week2;

public class StringManipulation {
    public static void main(String[] args) {

        String str = "India is my country";
//        reverseWords(str);
//        checkPalindromeOrNot("racecar");
//        printAllWordsWithEvenLength(str);
//        removesLeadingZeros("000005670");

        String s = "Hello World";
//        countNumberOfVowelsAndConsonants(s);

        String input = "the quick brown fox jumps over the lazy dog";
//        findLongestWord(input);
//        reverseString(s);
//        removesAllSpacesAndPrintResult(input);

        String st = "aabbccddeef";
//        removeDuplicateCharacter(st);

        String sentence = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
//        printSentence(sentence);

//        convertFirstLetterToUpperCase(input);
    }

    private static void printSentence(String input){
        String[] words = input.split("\\.");
        for(String word : words){
            System.out.println(word + ".");
        }
    }

    private static void removeDuplicateCharacter(String input){
        String result = "";

        for(int i = 0; i < input.length(); i++){
            char curChar = input.charAt(i);

            if(result.indexOf(curChar) == -1){
                result += curChar;
            }
        }

        System.out.println("Output : " + result);
    }

    private static void reverseString(String input){
        String reverseStr = "";

        for(int i = input.length()-1; i >= 0; i--){
            reverseStr += input.charAt(i);
        }

        System.out.println("Reversed String : " + reverseStr);
    }

    private static void findLongestWord(String input){
        String[] words = input.split(" ");

        int maxLength = 0;
        String maxLengthWord = "";

        for(String word : words){
            if(word.length() > maxLength){
                maxLength = word.length();
                maxLengthWord = word;
            }
        }

        System.out.println("Longest Word : " + maxLengthWord);
    }

    private static void countNumberOfVowelsAndConsonants(String str) {
        int vowel = 0;
        int consonant = 0;

        for(int i=0; i<str.length(); i++){
            char curChar = str.charAt(i);

            if(curChar == ' '){
                continue;
            }

            if(isVowel(curChar)){
                vowel++;
            }
            else{
                consonant++;
            }
        }

        System.out.println("Vowel : " + vowel + " Consonant : " + consonant);
    }

    private static boolean isVowel(char c){
        return (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U') || (c == 'a') || (c == 'e') ||
                (c == 'i') || (c == 'o') || (c == 'u');
    }

    private static void removesLeadingZeros(String input){
        int nonZeroIndex = 0;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) == '0'){
                nonZeroIndex++;
            }else{
                break;
            }
        }

        String output = input.substring(nonZeroIndex);
        System.out.println("Output : " + output);
    }

    private static void printAllWordsWithEvenLength(String str) {
        String[] words = str.split(" ");

        System.out.println("Words with Even Length:");
        for(String word : words){
            if(word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }

    private static void reverseWords(String input){
        String[] reversedWords = input.split(" ");

        for(int i = reversedWords.length-1; i >= 0; i--){
            System.out.print(reversedWords[i] + " ");
        }
    }

    private static void checkPalindromeOrNot(String input){
        int left = 0;
        int right = input.length()-1;

        if(isPalindrome(input, left, right)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String input, int left, int right){
        while (left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private static void removesAllSpacesAndPrintResult(String input){
        System.out.println("Before : " + input);

        System.out.println("After removing spaces : ");
        for(int i = 0; i < input.length(); i++){
            char curChar = input.charAt(i);

            if(curChar != ' '){
                System.out.print(curChar);
            }
        }
    }

    private static void convertFirstLetterToUpperCase(String input){
        String output = "";

        String[] words = input.split(" ");

        for(String word : words){
            String firstLetter = String.valueOf(word.charAt(0));
            output = output.concat(word.replace(firstLetter, firstLetter.toUpperCase()) + " ");
        }

        System.out.println("Result : " + output);
    }

}
