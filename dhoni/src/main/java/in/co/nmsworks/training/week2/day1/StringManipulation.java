package in.co.nmsworks.training.week2.day1;

public class StringManipulation {
    public static void main(String[] args) {
        //String line = "India is my country";
        //reverseWordsInSentence(line);
        //String palindrome = "dad";
        //isPalindrome(palindrome);
        //String findEvenLengthWord = "This is a java language";
        //printEvenLengthWords(findEvenLengthWord);
        //String removeLeadingZeros = "0005640";
        //removeAllLeadingZeros(removeLeadingZeros);
        //String paragraph = "The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach.";
        //printParagraphEachLine(paragraph);
        //String countVowels = "Hello World";
        //countVowelsConsonants(countVowels);
        //String duplicate = "aabbcc";
        //removeDuplicateLetters(duplicate);
        //String convertCase = "the quick brown fox jumps over the lazy dog";
        //convertCaseWordsInLine(convertCase);
        //findLongestWord();
        //reverseString();
        //removeAllSpace();

    }

    private static void removeAllSpace() {
        String line = "The quick brown fox jumps over the lazy dog";
        System.out.println("Input : "+line);
        String text = line.replace(" ","");
        System.out.println(text);
    }

    private static void reverseString() {
        String line = "Hello World";
        char[] c = line.toCharArray();
        String reverse = "";
        for(int i = c.length-1; i >= 0; i--){
            reverse = reverse + c[i];
        }
        System.out.println(reverse);
    }

    private static void findLongestWord() {
        String longestWord = "the quick brown fox jumps over the lazy dog";
        System.out.println("Input : " + longestWord);

        int maxLength = 0;
        String[] words = longestWord.split(" ");

        for(String word : words){
            if(maxLength < word.length()){
                maxLength = word.length();
            }
        }

        for(String word : words){
            if(maxLength == word.length()){
                System.out.println("Output : " + word);
                break;
            }
        }
    }

    private static void convertCaseWordsInLine(String convertCase) {
        System.out.println("Input : "+convertCase);
        String[] words = convertCase.split(" ");
        String line = "";
        String w = "";

        for (String word : words) {
            String first = word.charAt(0) + "";
            first = first.toUpperCase();
            w = first + word.substring(1) + " ";
            line = line + w;
        }
        System.out.println(line);
    }

    private static void removeDuplicateLetters(String duplicate) {
        System.out.println("Input : "+duplicate);
        String newString = "";

        for(char c : duplicate.toCharArray()){
            if(!newString.contains(c+"")){
                newString = newString + c;
            }
        }

        System.out.println("Output : " + newString);
    }

    private static void countVowelsConsonants(String countVowels) {
        System.out.println("Input : " + countVowels);
        String vowels = "aeiou";
        String consonants = "bcdfghjklmnopqrstvwz";
        int vowelCount = 0;
        int consonantCount = 0;
        int space = 0;


        for(char c : countVowels.toLowerCase().toCharArray()){
            if( vowels.contains(c+"")){
                vowelCount++;
            }
            else if(consonants.contains(c+"")){
                consonantCount++;
            }
            else{
                space++;
            }
        }

        System.out.println("Vowels: "+ vowelCount + " Consonants: " + consonantCount);

    }

    private static void printParagraphEachLine(String paragraph) {
        System.out.println("Give paragraph : "+ paragraph);
        String[] lines = paragraph.split("\\.");


        for(String line : lines){
            System.out.println(line);
        }
    }

    private static void removeAllLeadingZeros(String removeLeadingZeros) {
        System.out.println("Input : "+removeLeadingZeros);

        char[] numbers = removeLeadingZeros.toCharArray();
        int i = 0;
        while( i < numbers.length){
            if(numbers[i] != '0'){
                break;
            }
            i++;
        }

        String newNumber = "";
        for(int j = i; j < numbers.length; j++){
            newNumber = newNumber + numbers[j];
        }
        System.out.println(newNumber);

    }

    private static void printEvenLengthWords(String findEvenLengthWord) {
        System.out.println("Give Input : " + findEvenLengthWord);
        String[] words = findEvenLengthWord.split(" ");
        for(String word : words){
            if(word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }

    private static void isPalindrome(String palindrome) {
        int i = 0;
        int j = palindrome.length()-1;

        while(i < j){
            if(palindrome.charAt(i) != palindrome.charAt(j)){
                System.out.println("Is not palindrome " + palindrome);
                return;
            }
            i++;
            j--;
        }
        System.out.println("Is a palindrome " + palindrome);
    }


    private static void reverseWordsInSentence(String line) {
        System.out.println("Given string : "+ line);
        String[] words = line.split(" ");
        String reverse = "";


        for(int i = words.length -1; i >= 0; i-- ){
            reverse = reverse + words[i];
            if(i != 0){
                reverse = reverse + " ";
            }
        }
        System.out.println("reverse string : " + reverse);
    }

}
