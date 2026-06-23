package in.co.nmsworks.training.week2.day1;

public class StringManipulation {
    public static void main(String[] args) {
        reverseString();
        checkPalindrome();
        getEvenLengthWords();
        findVowelsAndConsonants();
        removeDuplicateCharacters();
        removesAllSpaces();
        removeLeadingZeros();
        longestWord();
        printEachSentenses();
        reverseStringWithoutInBuilt();
        firstLetterCapitalize();

    }

    public static void firstLetterCapitalize() {
        String input = "the quick brown fox jumps over the lazy dog";
        String[] arr = input.split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Character.toUpperCase(arr[i].charAt(0))
                    + arr[i].substring(1);
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }

    }

    private static void reverseStringWithoutInBuilt() {
        String input = "Hello";
        int len = input.length();
        for (int i = len -1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }

    }

    private static void printEachSentenses() {
        String input = " The early morning sun cast a golden hue over the quiet village, where the scent of blooming jasmine mingled with the crisp, cool air. As the first light of day filtered through the canopy of ancient oak trees, the streets began to stir with the soft chatter of locals preparing for the day ahead. Children darted around with laughter, their voices a cheerful contrast to the serene landscape. In the heart of the village, the old bakery's doors creaked open, releasing the warm, inviting aroma of freshly baked bread, promising a comforting start to the day for everyone within reach";
        String arr[] = input.split(",");
        for (String s : arr) {
            System.out.println(s);
        }
    }


    public static void longestWord() {
        String input =  "The quick brown fox jumps over the lazy dog";
        String arr[] = input.split(" ");
        int max = 0;
        String largest = "";
        for (int i = 0; i < arr.length; i++) {
           if (arr[i].length() > max){
               max = arr[i].length();
               largest = arr[i];
           }
        }
        System.out.println("The largest word :" + largest);
    }



    private static void removeLeadingZeros() {
        String number = "0005640";
        int flag = 0;
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if(ch == '0' &&  flag == 0){
                continue;
            }else{
                flag = 1;
                System.out.println(ch);
            }
        }

    }

    private static void removesAllSpaces() {
        String word = "Hello World";
        String res = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' '){
                res += word.charAt(i);
            }
        }
        System.out.println(res);
    }

    public static void reverseString(){
        String country = "India is my country";
        String countryRev[] = country.split(" ");
        for (int i = countryRev.length-1; i >= 0; i--) {
            System.out.print(countryRev[i]);
            System.out.print(" ");
        }
    }

    public static void checkPalindrome(){
        String input = "dad";
        String rev = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            rev += input.charAt(i);

        }
        if(input.equals( rev )){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }

    public static void getEvenLengthWords(){
        String s = "This is a java language";
        String[] words= s.split(" ");
        System.out.println("The Even length Words are : ");
        for (String word : words) {
            if(word.length() % 2 == 0){
                System.out.println(word);
            }

        }
    }

    public static  void findVowelsAndConsonants(){
        String input = "Hello World";
        int vowels = 0,consonants = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels ++;
            }else{
                consonants ++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    public static  void removeDuplicateCharacters(){
        String input =  "aabbcc";
        for (int i = 0; i < input.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (input.charAt(i) == input.charAt(j)){
                    flag = true;
                    break;
                }

            }
            if(!flag){
                System.out.print(input.charAt(i));
            }
        }
    }
}
