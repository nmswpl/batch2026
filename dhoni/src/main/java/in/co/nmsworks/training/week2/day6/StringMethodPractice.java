package in.co.nmsworks.training.week2.day6;

public class StringMethodPractice {

    public static void main(String[] args) {
        String word = "NMSWorks";
        //System.out.println( "find Character By Index of word : " + findCharacterByIndex(word, 5) );
        //findLengthOfString(new String("OpenAI"));
        //printSubString(new String("Java Programming"),5);
        //printSubStringStartingEnding(new String("Welcome to Java"),11,15);
        //checkSubstring(new String("Java Programming"), new String("Prog"));
        //String[] fruits = {"apple", "banana", "cherry"};
        //String delimiter = ", ";
        //joinString(fruits,delimiter);
        //compareStrings(new String("hello"),new String("Hello"));
        //checkEmpty(new String(" "));
        //concatTwoString(new String("Hello"),new String(" World"));
        //replaceCharacter(new String("banana"),'a','o');
        //compareStringsIgnoreCase(new String("hello"),new String("Hello"));
        //splitString(new String("one,two,three"),new String(","));
        //splitStringWithLimit(new String("apple;banana;cherry;date"),new String(";"),3);
        //findCharacterIndex(new String("programming"), 'g');
        //findSubstringIndex(new String("welcome to the world"),new String("the"),10);
        //convertToLowerCase(new String("Java Programming"));
        //convertToUpperCase(new String("welcome to Java"));
        //convertNumberToString(1234);
    }

    private static void convertNumberToString(int number) {
        String result = String.valueOf(number);
        System.out.println("result : " + result);
    }

    private static void convertToUpperCase(String word) {
        String result = word.toUpperCase();
        System.out.println(result);
    }

    private static void convertToLowerCase(String word) {
        String result = word.toLowerCase();
        System.out.println(result);
    }

    private static void findSubstringIndex(String line, String word, int startIndex) {
        int index = line.indexOf(word,startIndex);
        System.out.println("Start index : "+ index);
    }

    private static void findCharacterIndex(String word, char letter) {
        int index = word.indexOf(letter);
        System.out.println("word : " + word + "\ncharacter : " + letter);
        System.out.println("index : "+ index);
    }

    private static void splitStringWithLimit(String words, String delimiter,int limit) {
        String[] result = words.split(delimiter,limit);
        for (String word : result){
            System.out.println(word);
        }
    }


    private static void splitString(String words, String delimiter) {
        String[] result = words.split(delimiter);
        for (String word : result){
            System.out.println(word);
        }
    }

    private static void compareStringsIgnoreCase(String word1 , String word2) {
        if(word1.equalsIgnoreCase(word2)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }

    private static void replaceCharacter(String word, char oldChar, char newChar) {
        String result = word.replace(oldChar,newChar);
        System.out.println(result);
    }

    private static void concatTwoString(String word1 , String word2) {
        String result = word1.concat(word2);
        System.out.println(result);
    }

    private static void checkEmpty(String word) {
        if(word.isEmpty()){
            System.out.println("Empty");
        }
        else {
            System.out.println("Not Empty");
        }
    }

    private static void compareStrings(String word1 , String word2) {
        if(word1.equals(word2)){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("Strings are not equal");
        }
    }

    private static void joinString(String[] fruits, String delimiter ) {
        String result = String.join(delimiter,fruits);
        System.out.println(result);
    }


    private static void checkSubstring(String line, String word) {
        if (line.contains(word)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    private static void printSubStringStartingEnding(String word, int start, int end) {
        System.out.println("word : " + word + "\nindex : " + start+"\nend : " + end);
        System.out.println("Substring : " + word.substring(start,end) );
    }

    private static void printSubString(String word, int index) {
        System.out.println("word : " + word + "\nindex : " + index);
        System.out.println("Substring : " + word.substring(index));
    }

    private static void findLengthOfString(String word) {
        System.out.println("Length of word " + word + " : " + word.length());
    }

    private static char findCharacterByIndex(String word,int index) {
        return word.charAt(index);
    }

}
