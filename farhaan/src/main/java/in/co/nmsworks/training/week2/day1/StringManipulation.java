package in.co.nmsworks.training.week2.day1;

public class StringManipulation {
    public static void main(String[] args) {
        reverseWords("India is my Country");
        checkingPalindrome("racecar");
        printEvenLengthWords("This is not my Laptop");
        removeLeadingZeroes("0097820");
        printEachSentenceInNewLine("A rainy afternoon is the perfect time to relax.  As cool drops tap against the window, the world outside slows down. Wrapping yourself in a warm blanket with a good book creates a peaceful escape from daily stress. It is a simple, comforting way to recharge.");
        countingVowelsAndConsonants("Hello World");
        removeDuplicateLetters("aaabbccc");
        convertToTitleCase("the quick brown fox jumps over the lazy dog");
        findingLongestWord("the quick brown fox jumps over the lazy dog");
        reverseString("Welcome");
        removeAllSpaces("the quick brown fox jumps over the lazy dog");
    }

    public static void removeAllSpaces(String inputString) {
        String spacesRemovedString = "";
        spacesRemovedString = inputString.replace(" ", "");
        System.out.println("The String After Removed Spaces is :: " + spacesRemovedString);
    }

    public static void reverseString(String inputString) {
        char[] wordsOfString = inputString.toCharArray();
        String reversed = "";
        for (int i = inputString.length()-1; i >= 0; i--) {
            reversed = reversed + wordsOfString[i];
        }
        System.out.println("The Reversed String is :: " + reversed);
    }


    public static void reverseWords(String inputString) {
        System.out.println("Input String : " + inputString);
        String[] arrayAsWords = inputString.split(" ");
        System.out.print("Output String : ");
        for (int i = arrayAsWords.length - 1 ; i >= 0; i--) {
            System.out.print(arrayAsWords[i] + " ");
        }
    }
    public static void checkingPalindrome(String inputString) {
        String stringLowerCase = inputString.toLowerCase();
        String reverseString = "";
        for (int i = stringLowerCase.length() - 1; i >= 0 ; i--) {
            reverseString = reverseString + stringLowerCase.charAt(i);
        }
        if(reverseString.equals(inputString)){
            System.out.println("The String is a Palindrome");
        }
        else{
            System.out.println("The String is not a Palindrome");
        }
    }
    public static void printEvenLengthWords(String inputString) {
        String[] wordsInArray = inputString.split(" ");
        for (int i = 0; i < wordsInArray.length; i++) {
            if(wordsInArray[i].length() % 2 == 0){
                System.out.println(wordsInArray[i]);
            }
        }
    }

    public static void removeLeadingZeroes(String inputString) {
        String updatedStringAfterRemovingZeroes = "";
        for (int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) != '0'){
                updatedStringAfterRemovingZeroes = inputString.substring(i);
                break;
            }
        }
        System.out.println(updatedStringAfterRemovingZeroes);
    }

    public static void printEachSentenceInNewLine(String paragraph) {
        String[] sentenceArray = paragraph.split("\\.");
        for (String eachSentence : sentenceArray) {
            System.out.println(eachSentence);
        }
    }

    public static void countingVowelsAndConsonants(String inputString) {
        int vowelCount =0;
        int consonantCount = 0;
        String lowerCaseString = inputString.toLowerCase();
        for (int i = 0; i < lowerCaseString.length(); i++ ) {
            if(lowerCaseString.charAt(i) == 'a' || lowerCaseString.charAt(i) == 'e' || lowerCaseString.charAt(i) == 'i' || lowerCaseString.charAt(i) == 'o' || lowerCaseString.charAt(i) == 'u' ){
                vowelCount++;
            }
            else if(lowerCaseString.charAt(i) >= 'a' && lowerCaseString.charAt(i)<= 'z'){
                consonantCount++;
            }
        }
        System.out.println("Vowel Count :" + vowelCount + " Consonant Count : " + consonantCount);

    }

    public static void removeDuplicateLetters(String inputString) {
        String duplicateRemovedString = "";
        for (int i = 0; i < inputString.length(); i++) {
            char current = inputString.charAt(i);
            if (!duplicateRemovedString.contains(String.valueOf(current))) {
                duplicateRemovedString = duplicateRemovedString + current;
            }
        }
        System.out.println("Output : " + duplicateRemovedString);
    }

    public static void convertToTitleCase(String inputString) {
        String[] wordsFromSentence = inputString.split(" ");
        for (int i = 0; i < wordsFromSentence.length; i++) {
            String result = Character.toUpperCase(wordsFromSentence[i].charAt(0)) + wordsFromSentence[i].substring(1) + " ";
            System.out.print(result);
        }
    }

    public static void findingLongestWord(String inputString) {
        String[] wordsFromSentence = inputString.split(" ");
        int largest =0;
        String result ="";
        for (String s : wordsFromSentence) {
            if(s.length() > largest){
                result = s;
                largest = s.length();
            }
        }
        System.out.println(result);
    }


}



