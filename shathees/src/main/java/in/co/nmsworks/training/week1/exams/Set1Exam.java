package in.co.nmsworks.training.week1.exams;

import java.util.Scanner;
public class Set1Exam

{
    public static void main(String[] args) {
        mean();
        marksToGrade();

    }
    public static  void mean() {
        int arr[] = {1, 2, 3, 4, 5};
        double mean = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        mean = (double) sum / arr.length;
        System.out.println("The mean is : " + mean);
    }

    public  static void marksToGrade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Mark : ");
        int mark = scanner.nextInt();
        if (mark > 100){
            System.out.println("Invalid Number!!");
        }
        if (mark >= 91 && mark <= 100){
            System.out.println("The grade is : S");
        } else if(mark >= 81 && mark <= 90){
            System.out.println("The grade is : A");
        } else if (mark >= 71 && mark <= 80) {
            System.out.println("The grade is : B");
        } else if (mark >= 61 && mark <= 70) {
            System.out.println("The grade is : C");
        } else if (mark >= 51 && mark <= 60) {
            System.out.println("The grade is : D");
        }else {
            System.out.println("The grade is : F");
        }
    }
}
