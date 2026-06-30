package in.co.nmsworks.training.weekend.Pattern;

public class StringProblem {

    public static void main(String[] args) {

        characterAtIndex();
        stringLength();
        extractSubstring();
        substringWithRange();
        checkContains();
        joinStrings();
        compareStrings();
        checkEmpty();
        concatenateStrings();
        replaceCharacter();
        compareIgnoreCase();
        splitString();
        splitWithLimit();
        findCharacterIndex();
        findSubstringIndex();
        convertLowercase();
        convertUppercase();
        convertIntegerToString();
    }


    static void characterAtIndex() {
        String str = "NMSWorks";
        int index = 5;

        System.out.println("Character: " + str.charAt(index));
    }


    static void stringLength() {
        String str = "OpenAI";

        System.out.println("Length: " + str.length());
    }


    static void extractSubstring() {
        String str = "Java Programming";

        System.out.println(str.substring(5));
    }


    static void substringWithRange() {
        String str = "Welcome to Java";

        System.out.println(str.substring(11, 15));
    }


    static void checkContains() {
        String str = "Java Programming";

        if (str.contains("Prog"))
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }


    static void joinStrings() {
        String result = String.join(", ", "apple", "banana", "cherry");

        System.out.println(result);
    }


    static void compareStrings() {
        String a = "hello";
        String b = "Hello";

        System.out.println(a.equals(b));
    }


    static void checkEmpty() {
        String str = " ";

        if (str.isEmpty())
            System.out.println("Empty");
        else
            System.out.println("Not Empty");
    }


    static void concatenateStrings() {
        String a = "Hello";
        String b = " World";

        System.out.println(a.concat(b));
    }


    static void replaceCharacter() {
        String str = "banana";

        System.out.println(str.replace('a', 'o'));
    }


    static void compareIgnoreCase() {
        String a = "hello";
        String b = "HELLO";

        System.out.println(a.equalsIgnoreCase(b));
    }


    static void splitString() {
        String str = "one,two,three";

        String[] arr = str.split(",");

        for (String s : arr)
            System.out.println(s);
    }


    static void splitWithLimit() {
        String str = "apple;banana;cherry;date";

        String[] arr = str.split(";", 3);

        for (String s : arr)
            System.out.println(s);
    }


    static void findCharacterIndex() {
        String str = "programming";

        System.out.println(str.indexOf('g'));
    }


    static void findSubstringIndex() {
        String str = "welcome to the world";

        System.out.println(str.indexOf("the", 10));
    }


    static void convertLowercase() {
        String str = "Java Programming";

        System.out.println(str.toLowerCase());
    }


    static void convertUppercase() {
        String str = "welcome to Java";

        System.out.println(str.toUpperCase());
    }


    static void convertIntegerToString() {
        int value = 1234;

        String str = String.valueOf(value);

        System.out.println(str);
    }
}
