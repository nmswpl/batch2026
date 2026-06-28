package in.co.nmsworks.training.week2.day5;


public class StringBasicPrograms {
    public static void main(String[] args) {
        findCharAtInTheIndex("NMSWorks",5);
        lengthOfAString("OpenAI");
        subStringFromBeginIndex("Java Programming", 5);
        subStringFromBeginAndEndIndex("Welcome to Java", 11, 15);
        checkSubstringFoundOrNot("Java Programming","Prog");
        joinListOfStrings(",","apple", "orange", "banana");
        compareTwoStringAreEqual("hello", "Hello");
        checkIsEmptyString(" ");
        concatStrings("Hello ", "World");
        replaceCharacter("banana",'o');
        compareUsingEqualIgnoreCase("hello", "Hello");
        splitAGivenString("one,two,three");
        splitAGivenStringWithLimit("apple;banana;cherry;date");
        firstOccurrenceOfCharacter("programming", 'g');
        firstOccurrenceOfSubstringStartFromSpecificIndex("welcome to the world", "the", 10);
        convertToLowerCase("Java Programming");
        convertToUpperCase("welcome to Java");
        convertIntegerToString(1234);
    }

    private static void convertIntegerToString(int number) {
        String numToString = String.valueOf(number);
        System.out.println("Convert Integer to String : "+ numToString);
    }

    private static void convertToUpperCase(String string) {
        System.out.println("Convert to UpperCase : "+ string.toUpperCase());
    }

    private static void convertToLowerCase(String string) {
        System.out.println("Convert to LowerCase : "+ string.toLowerCase());
    }

    private static void firstOccurrenceOfSubstringStartFromSpecificIndex(String string, String subString, int index) {
        System.out.println("First Occurrence of substring : "+ string.indexOf(subString,index));
    }

    private static void firstOccurrenceOfCharacter(String string, char ch) {
        System.out.println("\nFirst Occurrence of a given Character : "+ string.indexOf(ch));
    }

    private static void splitAGivenStringWithLimit(String s) {
        System.out.print("\nSplit string into array with limit : ");
        String[] stingArray = s.split(";",3);
        for (String string : stingArray) {
            System.out.print(string + " ");
        }
    }

    private static void splitAGivenString(String s) {
        System.out.print("Split string into array : ");
        String[] stingArray = s.split(",");
        for (String string : stingArray) {
            System.out.print(string + " ");
        }
    }

    private static void compareUsingEqualIgnoreCase(String string1, String string2) {
        if (string1.equalsIgnoreCase(string2)){
            System.out.println("Strings are Equal ");
        }
        else {
            System.out.println("Strings are Not Equal  ");
        }
    }

    private static void replaceCharacter(String string, char ch) {
        System.out.println("Replace a specific character : "+ string.replace(ch, 'o'));
    }

    private static void concatStrings(String string1, String string2) {
        System.out.println("Concatenation of given Strings : "+string1.concat(string2));
    }

    private static void checkIsEmptyString(String string) {
        if (string.isEmpty()){
            System.out.println("Empty String");
        }
        else {
            System.out.println("Not Empty");
        }
    }

    private static void compareTwoStringAreEqual(String string1, String string2) {
        if (string1.equals(string2)){
            System.out.println("Strings are Equal ");
        }
        else {
            System.out.println("Strings are Not Equal  ");
        }
    }

    private static void subStringFromBeginAndEndIndex(String string, int beginIndex, int endIndex) {
        System.out.println("Substring from Begin to End Index : " + string.substring(beginIndex, endIndex));
    }

    private static void joinListOfStrings(String delimiter, String string, String string1, String string2) {
        System.out.println(String.join(delimiter,string, string1, string2));
    }

    private static void checkSubstringFoundOrNot(String string, String subString) {
        if (string.contains(subString)) {
            System.out.println("Substring Found ");
        }
        else {
            System.out.println("Not Found");
        }
    }

    private static void subStringFromBeginIndex(String str, int beginIndex) {
        System.out.println("Substring of the given String : "+ str.substring(beginIndex));
    }

    private static void lengthOfAString(String string) {
        System.out.println("Length of the given String : "+string.length());
    }

    private static void findCharAtInTheIndex(String str , int index) {
        System.out.println("Character at the given Index : "+str.charAt(index));
    }
}
