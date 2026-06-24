package in.co.nmsworks.training.week1.exam;

import java.util.Arrays;

public class Set2BasicArrayOperations {
    public static void main(String[] args) {
        int[] arr = {1, 2 ,3 ,4 ,10 ,1 ,5 ,7 };
        calculateMedian(arr);

        MobilePhones galaxy = new MobilePhones(1, "SamSung", "Galaxy S24", 79999.0);
        MobilePhones redmi = new MobilePhones(2, "Xioami", "Redmi Note 10", 85999.0);
        MobilePhones iphone = new MobilePhones(3, "Apple", "iPhone 12", 65999.0);
        MobilePhones poco = new MobilePhones(4, "Poco", "Pro m12", 49999.0);
        MobilePhones moto = new MobilePhones(1, "Motorola", "Note 13", 29999.0);

        printMobilePhone(galaxy);
        printMobilePhone(redmi);
        printMobilePhone(iphone);
        printMobilePhone(poco);
        printMobilePhone(moto);

        printHundredthPlace(876);
    }

    private static void printHundredthPlace(int number) {

        int hundredthPlace = number / 100;
        String[] numNames = {"Zero" , "One", "Two" , "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println(numNames[hundredthPlace]);
    }

    private static void printMobilePhone(MobilePhones phone) {
        System.out.println("ID = " + phone.getId());
        System.out.println("BRAND = " + phone.getBrand());
        System.out.println("MODEL = " + phone.getModel());
        System.out.println("PRICE = " + phone.getPrice());
    }

    private static void calculateMedian(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        if(n % 2 == 1){
            System.out.println("Median : " + arr[n / 2]);
        }else {
            int sum = arr[n / 2] + arr[n / 2 - 1];
            System.out.println("Median : " + sum / 2);
        }
    }


}
