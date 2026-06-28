package in.co.nmsworks.training.week2.weekend;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str1 = "NMSWorks";
        int index1 = 5;
        System.out.println("Character at index " + index1 + " in " + str1 + " is : " + str1.charAt(index1));

        String str2 = "OpenAI";
        System.out.println("Length of string " + str2 + " is: " + str2.length());

        String str3 = "Java Programming";
        int beginIndex1 = 5;
        System.out.println("Substring of " + str3 + " from index " + beginIndex1 + ": " + str3.substring(beginIndex1));

        String str4 = "Welcome to Java";
        int beginIndex2 = 11; int endIndex = 15;
        System.out.println("Substring of " + str4 + " from index " + beginIndex2 + " to " + endIndex + ": " + str4.substring(beginIndex2, endIndex));

        String str5 = "Prog";
        if (str3.contains(str5)) System.out.println(str3 + " contains substring " + str5);
        else System.out.println(str3 + " does not contain substring " + str5);

        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("Concatenated string: " + String.join(",", strArray));

        String str6 = "Hello"; String str7 = "hello";
        if (str6.equals(str7)) System.out.println(str6 + " equal " + str7);
        else System.out.println(str6 + " does not equal " + str7);

        String str8 = " ";
        if (str8.isEmpty()) System.out.println(str8 + " is empty");
        else System.out.println(str8 + " is not empty");

        String str9 = "Hello"; String str10 = "World";
        System.out.println("Concatenated string: " + str9.concat(str10));

        String str11 = "banana";
        System.out.println("String after replacing character: " + str11.replace('a', 'o'));

        String str12 = "HELLO";
        if (str9.equalsIgnoreCase(str12)) System.out.println(str9 + " and " + str12 + " are equal");
        else System.out.println(str9 + " and " + str12 + " are not equal");

        String str13 = "one,two,three";
        System.out.println(Arrays.toString(str13.split(",")));

        String str14 = "apple;banana;cherry;date";
        System.out.println(Arrays.toString(str14.split(";", 3)));

        String str15 = "programming"; char ch = 'g';
        System.out.println("Index of first occurrence of " + ch + " in " + str15 + ": " + str15.indexOf(ch));

        String str16 = "welcome to the world";  String str17 = "the"; int index2 = 10;
        System.out.println("Index of substring " + str17 + " starting from index " + index2 + " in " + str16 + ": " + str16.indexOf(str17, index2));

        System.out.println(str3 + " in lowercase: " + str3.toLowerCase());

        System.out.println(str4 + " in uppercase: " + str4.toUpperCase());

        int num = 1234;
        System.out.println(num + " as string: " + String.valueOf(num));

    }

}

