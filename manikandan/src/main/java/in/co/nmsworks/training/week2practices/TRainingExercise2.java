package in.co.nmsworks.training.week2practices;

public class TRainingExercise2 {
    public static void main(String[] args) {

        even601to700();

        grade(85);

        multiplyArrays();

        searchElement(new int[]{7, 15, 41}, 41);

        vowelOrConsonant('a');

        table17();

        squareArray();

        hundredDigit(542);

        divisibleBy3();

        endsWith7();

        biggest(12, 24, 5);

        countOdd();

        sumArray();

        reverseArray();

        countEven();

        factorial();

        largest();

        occurrence();

        palindrome("level");

        prime(7);
    }

    static void even601to700() {
        for (int i = 700; i >= 601; i--) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();
    }


    static void grade(int mark) {
        if (mark >= 91) System.out.println("S");
        else if (mark >= 81) System.out.println("A");
        else if (mark >= 71) System.out.println("B");
        else if (mark >= 61) System.out.println("C");
        else if (mark >= 51) System.out.println("D");
        else System.out.println("F");
    }


    static void multiplyArrays() {
        int[] a = {2, 4, 1};
        int[] b = {3, 5, 7};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] * b[i] + " ");
        }
        System.out.println();
    }


    static void searchElement(int[] arr, int key) {
        int pos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }
        System.out.println(pos);
    }


    static void vowelOrConsonant(char ch) {
        if ("AEIOUaeiou".indexOf(ch) != -1)
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }


    static void table17() {
        int n = 17;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }


    static void squareArray() {
        int[] arr = {2, 4, 3, 5};
        for (int x : arr) {
            System.out.print(x * x + " ");
        }
        System.out.println();
    }

    // 8. Hundred digit in words
    static void hundredDigit(int num) {
        String[] words = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int digit = (num / 100) % 10;
        System.out.println(words[digit]);
    }


    static void divisibleBy3() {
        for (int i = 301; i < 400; i++) {
            if (i % 3 == 0) System.out.print(i + " ");
        }
        System.out.println();
    }


    static void endsWith7() {
        for (int i = 200; i <= 500; i++) {
            if (i % 10 == 7) System.out.print(i + " ");
        }
        System.out.println();
    }


    static void biggest(int a, int b, int c) {
        System.out.println(Math.max(a, Math.max(b, c)));
    }


    static void countOdd() {
        int[] arr = {32, 43, 4, 15};
        int count = 0;
        for (int x : arr) if (x % 2 != 0) count++;
        System.out.println(count);
    }


    static void sumArray() {
        int[] arr = {1, 2, 3};
        int sum = 0;
        for (int x : arr) sum += x;
        System.out.println(sum);
    }


    static void reverseArray() {
        String[] arr = {"a", "b", "c"};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    static void countEven() {
        int[] arr = {2, 3, 4, 5, 6};
        int count = 0;
        for (int x : arr) if (x % 2 == 0) count++;
        System.out.println(count);
    }


    static int fact(int n) {
        if (n == 0 || n == 1) return 1;
        return n * fact(n - 1);
    }

    static void factorial() {
        System.out.println(fact(5));
    }


    static void largest() {
        int[] arr = {12, 3, 20, 14};
        int max = arr[0];
        for (int x : arr) if (x > max) max = x;
        System.out.println(max);
    }


    static void occurrence() {
        int[] arr = {1, 2, 3, 2, 2, 3};
        int x = 2, count = 0;
        for (int i : arr) if (i == x) count++;
        System.out.println(count);
    }


    static void palindrome(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(str.equals(rev) ? "Palindrome" : "Not Palindrome");
    }


    static void prime(int x) {
        if (x <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }



}