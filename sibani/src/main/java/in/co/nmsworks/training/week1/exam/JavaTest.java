package in.co.nmsworks.training.week1.exam;
import java.util.Scanner;

import static sun.security.pkcs11.wrapper.Functions.getId;

public class JavaTest {
    public static void main(String[] args) {
        System.out.println("Mean of the Array : " + meanOfArray());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark :");
        int mark = sc.nextInt();
        System.out.println("The Grade is : " +findGrade(mark));

        Book bk1 = new Book(205,"Java Programming","James Gosling",250.0F);
        Book bk2 = new Book(206,"Python Programming","James",350.0F);
        Book bk3 = new Book(207,"C Programming","Zhang",450.0F);
        Book bk4 = new Book(208,"Intro to Java","Gosling",550.0F);
        Book bk5 = new Book(209,"Harry potter","J K Rowling",650.0F);
        bk1.printBookDetails(bk1);
        bk2.printBookDetails(bk2);
        bk3.printBookDetails(bk3);
        bk4.printBookDetails(bk4);
        bk1.printBookDetails(bk5);
    }
    public static float meanOfArray(){
        int[] arr = {1, 2, 3, 4, 5};
        int sum=0;
        for (int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        float mean = sum / arr.length;
        return mean;
    }
    public static char findGrade(int mark){
        if (91< mark && mark <100) {
            return 'S';
        }
        else if (81<mark && mark<90) {
            return 'A';
        }
        else if (71<mark && mark<80) {
            return 'B';
        }
        else if (61<mark && mark<70) {
            return 'C';
        }
        else if (51<mark && mark<60) {
            return 'D';
        }
        else {
            return 'F';
        }
    }
}
