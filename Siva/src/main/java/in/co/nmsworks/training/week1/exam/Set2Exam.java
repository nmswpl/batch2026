package in.co.nmsworks.training.week1.exam;

import java.util.Scanner;

public class Set2Exam {

    public static void main(String[] args) {
//        findMedian();
        MobilePhone[] mobiles = new MobilePhone[7];
        mobiles[0] = new MobilePhone(201,"Samsung","Galaxy S24",79999.0);
        mobiles[1] = new MobilePhone(202,"Apple","IPhone 17 Pro Max",149999.0);
        mobiles[2] = new MobilePhone(203,"Samsung","Galaxy S25",99999.0);
        mobiles[3] = new MobilePhone(204,"Vivo","Vivo 15",39999.0);
        mobiles[4] = new MobilePhone(205,"Oneplus","OnePlus 23",49999.0);
        mobiles[5] = new MobilePhone(205,"Oneplus","OnePlus 23",49999.0);

        printMobilePhoneDetails(mobiles);
        printHundredPositionNumber(777);

    }

    public static void findMedian(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numArray = new int[n];
        for (int i = 0; i < n; i++) {
            numArray[i] = scanner.nextInt();
        }
        double answer;
        if ( n %2 == 0 ){
            answer = numArray[n/2] + numArray[(n/2)-1];
            answer /= 2;
        }
        else {
            answer = numArray[n/2];
        }
        System.out.println("Median = "+answer);
    }

    public static void printMobilePhoneDetails(MobilePhone[] mobiles){
        System.out.println("These are the Models available in our shop!!");
        for (int i = 0; i < mobiles.length; i++) {
            System.out.println("ID = "+mobiles[i].getId());
            System.out.println("Brand = "+mobiles[i].getBrand());
            System.out.println("Model = "+mobiles[i].getModel());
            System.out.println("Price = "+mobiles[i].getPrice());
            System.out.println("------------------------------------------");
        }
    }

    public static void printHundredPositionNumber(int number) {
        number /= 100;
        System.out.print("Output = ");
        if ( number == 1 )
            System.out.print("One");
        else if ( number == 2 )
            System.out.print("Two");
        else if ( number == 3 )
            System.out.print("Three");
        else if ( number == 4 )
            System.out.print("Four");
        else if ( number == 5 )
            System.out.print("Five");
        else if ( number == 6 )
            System.out.print("Six");
        else if ( number == 7 )
            System.out.print("Seven");
        else if ( number == 8 )
            System.out.print("Eight");
        else if ( number == 9 )
            System.out.print("Nine");
        else
            System.out.print("Zero");
        System.out.println();
    }
}
