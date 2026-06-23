package in.co.nmsworks.training.week1.exam;

import java.util.Scanner;

public class GradeFinder {
    public static void main(String[] args) {
        System.out.println("enter the mark: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if( a >= 91 && a <= 100){
            System.out.println("the grade is: " + "S");
        }
        else if( a >= 81 && a <= 90){
            System.out.println("the grade is: " + "A");
        }
        else if( a >= 71 && a <= 80){
            System.out.println("the grade is: " + "B");
        }
        else if( a >= 61 && a <= 70){
            System.out.println("the grade is: " + "C");
        }
        else if( a >= 51 && a <= 60){
            System.out.println("the grade is: " + "D");
        }
        else{
            System.out.println("the grade is: " + "F");
        }


    }
}
