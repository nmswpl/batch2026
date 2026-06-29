package in.co.nmsworks.training.week1.exam;
import java.util.Scanner;

import static sun.security.pkcs11.wrapper.Functions.getId;

public class JavaTest {
    public static void main(String[] args) {
        System.out.println("Mean of the Array : " + meanOfArray());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark :");
        int mark = sc.nextInt();
        findGrade(mark);
        sc.close();

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
        float sum=0;
        for (int i=0; i<arr.length;i++){
            sum += arr[i];
        }
        float mean = sum / arr.length;
        return mean;
    }
    public static void findGrade(int mark){
        if (mark > 100 || mark < 0) {
            System.out.println("Invalid Mark");
        }
        if (mark > 90){
            System.out.println("Grade is : S" );
        }
        else if (mark > 80){
            System.out.println("Grade is : A" );
        }
        else if (mark > 70){
            System.out.println("Grade is : B" );
        }
        else if (mark > 60){
            System.out.println("Grade is : C" );
        }
        else if (mark > 50){
            System.out.println("Grade is : D" );
        }
        else {
            System.out.println("Grade is : F" );
        }
    }
}
