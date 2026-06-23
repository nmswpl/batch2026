package in.co.nmsworks.training.week1.exam;
import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        /**Write a program to print the Grade for given Mark.
         Mark Slab : 91-100 = S; 81-90 = A; 71-80 = B; 61-70 = C ; 51-60 = D; Every thing else : F**/
       grade();
    }
    public static void grade(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark=scanner.nextInt();
        scanner.close();
        if(mark>=91 && mark<=100){
            System.out.println("S");
        }
        else if(mark>=81 && mark<=90){
            System.out.println("A");
        }
        else if(mark>=71 && mark<=80){
            System.out.println("B");
        }
        else if(mark>=61 && mark<=70){
            System.out.println("C");
        }
        else if(mark>=51 && mark<=60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
