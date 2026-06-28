package in.co.nmsworks.week2.day6;

public class TrainingExercise {

    public void findEven() {
        System.out.println("---EVEN NUMBERS IN DESCENDING---");

        for (int i = 700; i >= 601; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    public void findGrade(int mark) {

        System.out.println("---FIND GRADE FOR MARKS---");

        if (mark > 100) {
            System.out.println("Invalid Mark");
        } else if (mark > 90) {
            System.out.println("S");
        } else if (mark > 80) {
            System.out.println("A");
        } else if (mark > 70) {
            System.out.println("B");
        } else if (mark > 60) {
            System.out.println("C");
        } else if (mark > 50) {
            System.out.println("D");
        } else if (mark >= 1 && mark <= 50) {
            System.out.println("F");
        } else {
            System.out.println("Invalid marks--mark in negative");
        }
        System.out.println(" ");

    }

    public void multiplyArrays() {
        System.out.println("---MULTIPLICATION OF ARRAYS---");
        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};
        int c[] = new int[a.length];
        if (a.length != b.length) {
            System.out.println("Invalid length cannot multiply array");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
        }
        for (int j = 0; j < c.length; j++) {
            System.out.print(c[j] + " ");
        }
        System.out.println(" ");

    }

    public void searchPositionOfElementInArray(int element) {
        int arr[] = {4, 5, 6};
        System.out.println("---POSITION OF ELEMENT IN ARRAY---");
        int set = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("The position of element " + element + "is : " + i);
                set = 1;
                return;
            }

        }
        if (set == 0) {
            System.out.println("No element found " + -1);
        }
        System.out.println(" ");
    }

    public void vowelOrConsonant(char ch) {
        System.out.println("---VOWEL OR CONSONANT---");
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel");
        } else {
            System.out.println(ch + " is a Consonant");
        }
        System.out.println(" ");
    }

    public void multiplicationTable(int num) {
        System.out.println("---MULTIPLICATION TABLE OF " + num + "---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("  ");
    }

    public void squareOfNumber() {
        int arr[] = {1, 2, 3};
        int res[] = new int[arr.length];
        System.out.println("---SQUARE OF NUMBERS---");
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i] * arr[i];
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
        System.out.println(" ");
    }

    public static void findPosition() {
        int num = 256;
        int pos = num / 100;
        String[] position = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("The Hundreth position of the number " + num + " is :" + position[pos]);
        System.out.println(" ");
    }

    public void numberEndsWithSeven() {
        int ans = 0;
        System.out.println("---NUMBER ENDS WITH SEVEN---");
        for (int i = 200; i <= 500; i++) {

            ans = i % 10;
            if (ans == 7) {
                System.out.print(i + " ");
            }

        }
        System.out.println(" ");
    }

    public void numDivisible() {
        System.out.println("---NUMBER DIVISIBLE BY 3");
        for (int i = 300; i <= 400; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }

    public void biggestOfThreeNumbers(int num1, int num2, int num3) {
        System.out.println("---BIGGEST OF THREE NUMBERS---");
        System.out.print("The biggest of Three numbers " + num1 + "," + num2 + "," + num3 + " is:");
        if (num1 > num2 && num1 > num3) {
            System.out.print(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.print(num2);
        } else {
            System.out.print(num3);
        }
        System.out.println(" ");
    }

    public void countOddElements() {
        System.out.println("---COUNT ODD ELEMENTS---");
        int[] arr = {3, 5, 7, 6};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        System.out.println("Count :" + count);
        System.out.println(" ");
    }

    public void sumOfElements() {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("---SUM OF ELEMENTS OF ARRAY---");
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        System.out.println("The sum is :" + res);
        System.out.println(" ");
    }

    public void stringReverse() {
        String[] arr = {"abc", "def", "ghi"};
        System.out.println("--REVERSE THE STRING ARRAY---");
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            String temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public void countEvenElements() {
        System.out.println("---COUNT EVEN ELEMENTS---");
        int[] arr = {3, 5, 7, 6};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Count :" + count);
        System.out.println(" ");
    }

    public int factorial(int n) {

        if (n == 0 || n == 1) {
            return n;
        } else {
            return n * factorial(n - 1);
        }
    }

    public void findLargestInArray() {
        int[] arr = {12, 4, 5, 67, 88};
        System.out.println("---LARGEST ELEMENT IN ARRAY---");
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        System.out.println("The largest element : " + max);
        System.out.println(" ");
    }

    public void noOfOccurences(int x) {
        int[] arr = {4, 6, 7, 2, 2, 4, 7, 4};
        int count = 0;
        System.out.println("---TOTAL NO OF OCCURENCES---");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        System.out.println("The no of occurence of " + x + " is : " + count);
        System.out.println(" ");
    }

    public static void palindrome() {
        System.out.println("---PALINDROME CHECK---");
        String s = "level";
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                System.out.println("this String " + s + " is not a palindrome");
                break;
            }
            l++;
            r--;
        }
        if (l == r) {
            System.out.println("This String " + s + " is a palindrome");
        }
        System.out.println(" ");
    }

    public static void findPrime() {
        System.out.println("---PRIME NUMBER OR NOT---");
        int n = 8;
        int i = 2;
        for (; i <= n; i++) {
            if (i != n && n % i == 0) {
                System.out.println(n + " is not a prime number");
                break;
            }


        }
        if (i == n + 1) {
            System.out.println(n + " is a prime number");
        }
        System.out.println();

    }

}
