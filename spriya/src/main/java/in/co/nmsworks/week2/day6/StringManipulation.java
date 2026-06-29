package in.co.nmsworks.week2.day6;

public class StringManipulation {

    public void findChar(int x) {
        System.out.println("---FIND CHARACTER FOR THE GIVEN INDEX---");
        String str = "NMSWorks";

        System.out.println("The character is : " + str.charAt(x));
        System.out.println();
    }

    public void findLength() {
        System.out.println("---LENGTH OF THE STRING---");
        String str = "OpenAI";
        System.out.println("The Length is : " + str.length());
        System.out.println();
    }

    public void stringSlicing() {
        System.out.println("---STRING SLICING---");

        String str = "Java Programming";
        System.out.println(str.substring(5));
        System.out.println();
    }

    public void slicing() {
        System.out.println("---STRING SLICING FROM BEGIN AND END INDEX---");
        String str = "Welcome to Java";
        System.out.println(str.substring(11, 15));
        System.out.println();
    }

    public void checkSequence() {
        System.out.println("---CHECK SEQUENCE---");
        String str = "Java Programming";
        System.out.println(str.contains("Prog"));
        System.out.println();
    }

    public void checkEquality() {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("---CHECK EQUALITY---");
        System.out.println(str1.equals(str2));
        System.out.println("");
    }

    public void emptyString() {
        String str = " ";
        System.out.println("---CHECK STRING EMPTY---");
        if (str.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not Empty");
        }
        System.out.println(" ");
    }

    public void concatination() {
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("---STRING CONACATINATION---");
        String res = str1.concat(str2);
        System.out.println(res);
        System.out.println(" ");
    }

    public void replaceMethod() {
        String str1 = "banana";
        System.out.println("---STRING REPLACE---");

        System.out.println(str1.replace('a', 'o'));
        System.out.println(" ");

    }

    public void ignoreCase() {
        String str1 = "hello";
        String str2 = "HELLO";
        System.out.println("---IGNORE CASE---");
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(" ");
    }

    public void splitCase() {
        String str = "one,two,three";
        System.out.println("---SPLIT CASE---");
        String[] res = str.split(",");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);

        }
        System.out.println(" ");
    }

    public void splitCaseLimit() {
        String str = "apple;banana;cherry;date";
        System.out.println("---SPLIT CASE LIMIT---");
        String[] res = str.split(";", 3);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
        System.out.println();
    }

    public void checkOccurence() {
        System.out.println("---CHECK FIRST OCCURENCE---");
        String str = "programming";
        System.out.println(str.indexOf('g'));
        System.out.println(" ");
    }

    public void lowercaseMethod() {
        String str = "Java Programming";
        System.out.println("---LOWERCASE METHOD---");
        System.out.println(str.toLowerCase());
        System.out.println(" ");
    }

    public void upperCaseMethod() {
        String str = "welcome to Java";
        System.out.println("---UPPERCASE METHOD---");
        System.out.println(str.toUpperCase());
        System.out.println(" ");
    }

    public void valueMethod() {
        System.out.println("---VALUEOF METHOD---");
        System.out.println(String.valueOf(1234));
        System.out.println(" ");
    }
}
