package in.co.nmsworks.training.week2.exercise;

public class StringMethodPractice {

        public static void main(String[] args) {
            StringMethodPractice practice = new StringMethodPractice();
            practice.question1("NMSWorks", 5);
            practice.question2("OpenAI");
            practice.question3("Java Programming", 5);
            practice.question4("Welcome to Java", 11, 15);
            practice.question5("Java Programming", "Prog");
            practice.question6(new String[]{"apple", "banana", "cherry"}, ", ");
            practice.question7("hello", "Hello");
            practice.question8(" ");
            practice.question9("Hello", " World");
            practice.question10("banana", 'a', 'o');
            practice.question11("hello", "HELLO");
            practice.question12("one,two,three", ",");
            practice.question13("apple;banana;cherry;date", ";", 3);
            practice.question14("programming", 'g');
            practice.question15("welcome to the world", "the", 10);
            practice.question16("Java Programming");
            practice.question17("welcome to Java");
            practice.question18(1234);
        }

        public void question1(String str, int index) {
            char result = str.charAt(index);
            System.out.println(result);
        }

        public void question2(String str) {
            int len = str.length();
            System.out.println(len);
        }

        public void question3(String str, int beginIndex) {
            String result = str.substring(beginIndex);
            System.out.println(result);
        }

        public void question4(String str, int beginIndex, int endIndex) {
            String result = str.substring(beginIndex, endIndex);
            System.out.println(result);
        }

        public void question5(String str, String sub) {
            if (str.contains(sub)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }
        }

        public void question6(String[] elements, String delimiter) {
            String result = String.join(delimiter, elements);
            System.out.println(result);
        }

        public void question7(String str1, String str2) {
            if (str1.equals(str2)) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }

        public void question8(String str) {
            if (str.isEmpty()) {
                System.out.println("Empty");
            } else {
                System.out.println("Not Empty");
            }
        }

        public void question9(String str1, String str2) {
            String result = str1.concat(str2);
            System.out.println(result);
        }

        public void question10(String str, char oldChar, char newChar) {
            String result = str.replace(oldChar, newChar);
            System.out.println(result);
        }

        public void question11(String str1, String str2) {
            if (str1.equalsIgnoreCase(str2)) {
                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }
        }

        public void question12(String str, String delimiter) {
            String[] tokens = str.split(delimiter);
            for (int i = 0; i < tokens.length; i++) {
                System.out.println(tokens[i]);
            }
        }

        public void question13(String str, String delimiter, int limit) {
            String[] tokens = str.split(delimiter, limit);
            for (int i = 0; i < tokens.length; i++) {
                System.out.println(tokens[i]);
            }
        }

        public void question14(String str, char ch) {
            int index = str.indexOf(ch);
            System.out.println(index);
        }

        public void question15(String str, String sub, int fromIndex) {
            int index = str.indexOf(sub, fromIndex);
            System.out.println(index);
        }

        public void question16(String str) {
            String result = str.toLowerCase();
            System.out.println(result);
        }

        public void question17(String str) {
            String result = str.toUpperCase();
            System.out.println(result);
        }

        public void question18(int value) {
            String result = String.valueOf(value);
            System.out.println(result);
        }
    }

