package in.co.nmsworks.training.week2.weekendPractise;

public class StringPractise {

    public static void main(String[] args) {
        findCharacter("NMSWorks", 5);
        printLength("OpenAI");
        printSubString("Java Programming", 5);
        printSubString("Welcome to Java", 11, 15);
        printIfContains("Java Programming", "Prog");
        stringJoin(new String[]{"apple", "banana", "cherry"}, "*");
        printEquality("Hello", "hello");
        printISEmpty("");
        stringConcat("Hello", "World");
        replaceCharacter("banana", 'a', 'o');
        printEqualityIgnoreCase("Hello", "HELLO");
        splitString("one,two,three", ",");
        splitStringWithLimit("apple;banana;cherry;date",";",3);
        printFirstIndex("Programming",'g');
        printIndex("welcome to the world","the", 10);
        printLowerCase("Java Programming");
        printUpperCase( "welcome to Java");
        convertToString(1234);
    }

    private static void convertToString(int integer)
    {
        System.out.println(String.valueOf(integer));
    }

    private static void printUpperCase(String string) {
        System.out.println(string.toUpperCase());
    }

    private static void printLowerCase(String string) {
        System.out.println(string.toLowerCase());
    }

    private static void printIndex(String string, String substring, int startIndex)
    {
        System.out.println(string.indexOf(substring, startIndex));
    }

    private static void printFirstIndex(String string, char character) {
        System.out.println(string.indexOf(character));
    }

    private static void splitStringWithLimit(String string, String delimiter, int limit) {
        for (String s : string.split(delimiter, limit)) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void splitString(String string, String delimiter) {
        for (String s : string.split(delimiter)) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printEqualityIgnoreCase(String string1, String string2) {
        if (string1.equalsIgnoreCase(string2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }

    private static void replaceCharacter(String string, char oldChar, char newChar) {
        System.out.println(string.replace(oldChar, newChar));
    }

    private static void stringConcat(String string1, String string2) {
        System.out.println(string1.concat(string2));
    }

    private static void printISEmpty(String input) {
        if (input.isEmpty())
            System.out.println("Empty");
        else
            System.out.println("Not Empty");
    }

    private static void printEquality(String string1, String string2) {
        if (string1.equals(string2))
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }

    private static void stringJoin(String[] inputList, String delimiter) {
        System.out.println("".join(delimiter, inputList));
    }

    private static void printIfContains(String input, String substring) {
        if (input.contains(substring)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    private static void printSubString(String input, int beginIndex, int endIndex) {
        System.out.println("Substring from index " + beginIndex + " and ending with index " + endIndex + " is:" + input.substring(beginIndex, endIndex));
    }

    private static void printSubString(String input, int beginIndex) {
        System.out.println("Substring from index " + beginIndex + " is:" + input.substring(beginIndex));
    }

    private static void printLength(String input) {
        System.out.println("Length of " + input + "is: " + input.length());
    }

    private static void findCharacter(String input, int index) {

        if (index > input.length()) {
            System.out.println("Invalid Index!");
            return;
        }

        System.out.println("Character at index " + index + " in " + input + " is: " + input.charAt(index));

    }
}
