package in.co.nmsworks.training.week1.exam;

import java.util.Scanner;


public class TestSetTwo {


    public static void main(String[] args) {
        //findMedianOfArray();
        findHundredPosition();

        Phone samsung = new Phone(201,"Samsung","Galaxy S24",79999.0F);
        samsung.display();

        Phone iphone = new Phone(202,"iphone","13 pro",89999.0F);
        iphone.display();

        Phone onePlus = new Phone(203,"onePlus","R13",69999.0F);
        onePlus.display();

        Phone redmi = new Phone(204,"redmi","K20",35999.0F);
        redmi.display();

        Phone oppo = new Phone(205,"oppo","F17",45999.0F);
        oppo.display();

    }

    public static void findMedianOfArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of elements in array : ");
        int numberOfElements = scanner.nextInt();

        System.out.println("Enter elements in ascending order: ");
        int[] numbers = new int[numberOfElements];
        for(int i = 0; i < numberOfElements; i++){
            numbers[i] = scanner.nextInt();
        }

        if(numberOfElements % 2 == 0){
            float median = (numbers[numberOfElements/2] + numbers[numberOfElements/2 +1]);
            median = median/2;
            System.out.println("Median : " + median);
        }
        else{
            System.out.println("Median : " + numbers[numberOfElements/2]);
        }

    }

    public static void findHundredPosition(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int number = scanner.nextInt();

        if(number < 100){
            System.out.println("Invalid number ");
            return;
        }

        if(number > 1000 ){
            System.out.println("Invalid number ");
            return;
        }

        int digit = number/100;

        if(digit == 1){
            System.out.println("One");
        }
        else if(digit == 2){
            System.out.println("two");
        }
        else if(digit == 3){
            System.out.println("Three");
        }
        else if(digit == 4){
            System.out.println("Four");
        }
        else if(digit == 5){
            System.out.println("Five");
        }
        else if(digit == 6){
            System.out.println("Six");
        }
        else if(digit == 7){
            System.out.println("Seven");
        }
        else if(digit == 8){
            System.out.println("Eight");
        }
        else if (digit == 9){
            System.out.println("Nine");
        }
        else{
            System.out.println("Zero");
        }

        scanner.close();
    }
    
}
