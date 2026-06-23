package in.co.nmsworks.training.week1.exam;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SetOne {
    public static void main(String[] args) {
        findMean();
        findGrade();
    }

    public static void findMean() {

        int[] array = {2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        float mean = sum / array.length;

        System.out.println("Mean : " + mean);
    }

    public static void findGrade() {

        int mark = 76;

        char grade;
        if (mark > 100) {
            System.out.println("invalid mark");
        }
        else {

            if (mark > 90) {
                grade = 'S';
            } else if (mark > 80 ) {
                grade = 'A';
            } else if (mark > 70 ) {
                grade = 'B';
            } else if (mark > 60 ) {
                grade = 'C';
            } else if (mark > 50 ) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            System.out.println("The Grade is: " + grade);
        }
    }
}
