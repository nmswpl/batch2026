package in.co.nmsworks.week2.day1.exam;

public class Test {
    public static void main(String[] args) {
        mean();
        Printgrade(78);
    }

    public static void mean() {
        int arr[] = {1, 2, 3, 4, 5};
        int len = arr.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += arr[i];
        }
        int mean = sum / len;
        System.out.println("The mean is :" + mean);
    }
    public static void Printgrade(int grade){

        //91-100 = S; 81-90 = A; 71-80 = B; 61-70 = C ; 51-60 = D; Every thing else : F
        if (grade >= 91 && grade <= 100) {
            System.out.println("S");
        } else if (grade >= 81 && grade <= 90) {
            System.out.println("A");
        } else if (grade >= 71 && grade <= 80) {
            System.out.println("B");
        } else if (grade >= 61 && grade <= 70) {
            System.out.println("C");
        } else if (grade >= 51 && grade <= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
