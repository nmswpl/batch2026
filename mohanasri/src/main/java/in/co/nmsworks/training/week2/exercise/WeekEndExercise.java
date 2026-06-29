package in.co.nmsworks.training.week2.exercise;

public class WeekEndExercise {

        public static void main(String[] args) {
            WeekEndExercise we = new WeekEndExercise();
            we.prob1();
            we.prob2(85);
            we.prob3(new int[]{2, 4, 1}, new int[]{3, 5, 7});
            we.prob4(new int[]{7, 15, 41}, 41);
            we.prob5('e');
            we.prob6();
            we.prob7(new int[]{2, 4, 3, 5});
            we.prob8(542);
            we.prob9();
            we.prob10();
            we.prob11(12, 24, 5);
            we.prob12(new int[]{32, 43, 4, 15});
            we.prob13(new int[]{1, 2, 3});
            we.prob14(new String[]{"a", "b", "c"});
            we.prob15(new int[]{2, 3, 4, 5, 6});
            we.prob16(5);
            we.prob17(new int[]{12, 3, 20, 14});
            we.prob18(new int[]{1, 2, 3, 2, 2, 3}, 2);
            we.prob19("level");
            we.prob20(7);
        }

        public void prob1() {
            for (int i = 700; i > 600; i--) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        public void prob2(int mark) {
            if (mark >= 91 && mark <= 100) {
                System.out.println("S");
            } else if (mark >= 81 && mark <= 90) {
                System.out.println("A");
            } else if (mark >= 71 && mark <= 80) {
                System.out.println("B");
            } else if (mark >= 61 && mark <= 70) {
                System.out.println("C");
            } else if (mark >= 51 && mark <= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }

        public  void prob3(int[] arr1, int[] arr2) {
            for (int i = 0; i < arr1.length; i++) {
                System.out.print((arr1[i] * arr2[i]) + " ");
            }
            System.out.println();
        }

        public void prob4(int[] arr, int search) {
            int index = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == search) {
                    index = i;
                }
            }
            System.out.println(index);
        }

        public  void prob5(char ch) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        }

        public void prob6() {
            for (int i = 1; i <= 10; i++) {
                System.out.println("17 x " + i + " = " + (17 * i));
            }
        }

        public  void prob7(int[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print((arr[i] * arr[i]) + " ");
            }
            System.out.println();
        }

        public  void prob8(int num) {
            int digit = num / 100;
            if (digit == 1) System.out.println("One");
            if (digit == 2) System.out.println("Two");
            if (digit == 3) System.out.println("Three");
            if (digit == 4) System.out.println("Four");
            if (digit == 5) System.out.println("Five");
            if (digit == 6) System.out.println("Six");
            if (digit == 7) System.out.println("Seven");
            if (digit == 8) System.out.println("Eight");
            if (digit == 9) System.out.println("Nine");
        }

        public void prob9() {
            for (int i = 301; i < 400; i++) {
                if (i % 3 == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        public  void prob10() {
            for (int i = 201; i < 500; i++) {
                if (i % 10 == 7) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        public void prob11(int n1, int n2, int n3) {
            if (n1 >= n2 && n1 >= n3) {
                System.out.println(n1);
            } else if (n2 >= n1 && n2 >= n3) {
                System.out.println(n2);
            } else {
                System.out.println(n3);
            }
        }

        public void prob12(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    count = count + 1;
                }
            }
            System.out.println("Odd elements = " + count);
        }

        public  void prob13(int[] arr) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }

        public void prob14(String[] arr) {
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public  void prob15(int[] arr) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    count = count + 1;
                }
            }
            System.out.println("even elements = " + count);
        }

        public int prob16Recursive(int n) {
            if (n <= 1) {
                return 1;
            }
            return n * prob16Recursive(n - 1);
        }

        public  void prob16(int n) {
            int result = prob16Recursive(n);
            System.out.println(result);
        }

        public void prob17(int[] arr) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Largest element = " + max);
        }

        public  void prob18(int[] arr, int x) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x) {
                    count = count + 1;
                }
            }
            System.out.println(count);
        }

        public void prob19(String str) {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse = reverse + str.charAt(i);
            }
            if (str.equals(reverse)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }

        public void prob20(int x) {
            int count = 0;
            for (int i = 1; i <= x; i++) {
                if (x % i == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }
    }


