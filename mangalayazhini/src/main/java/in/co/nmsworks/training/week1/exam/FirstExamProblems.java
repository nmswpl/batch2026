package in.co.nmsworks.training.week1.exam;

public class FirstExamProblems {

    public static void main(String[] args) {
        int[] array1 = {10,20,30,40,50};
        int[] array2 = {100,200,300,400};

        FirstExamProblems obj = new FirstExamProblems();

        obj.printArray(array1);
        int medianValue1 = obj.median(array1);
        System.out.println("\nArray 1 median  : " + medianValue1);

        obj.printArray(array2);
        int medianValue2 = obj.median(array2);
        System.out.println("\nArray 2 median  : " + medianValue2);


        MobilePhone phone1 = new MobilePhone(100, "Samsung" , "Galaxy s20",18000.25);
        phone1.mobilePhoneFeatures();

        MobilePhone phone2 = new MobilePhone(101, "One Plus" , "Ultra s4",15000.0);
        phone2.mobilePhoneFeatures();

        MobilePhone phone3 = new MobilePhone(103, "Nokia" , "Nokia 5G",20000);
        phone3.mobilePhoneFeatures();

        MobilePhone phone4 = new MobilePhone(104, "Oppo" , "s7",19500.50);
        phone4.mobilePhoneFeatures();

        MobilePhone phone5 = new MobilePhone(105, "Google Pixel" , "Pixel 4",60000);
        phone5.mobilePhoneFeatures();


        obj.hundredthPosition(542);
        obj.hundredthPosition(777);
        obj.hundredthPosition(300);


    }

    /** median of an array **/

    public int median(int[] arr){

        int n = arr.length ;
        int median ;
        if(n%2 == 0){
            median = (arr[n/2] + arr[n/2-1])/2;
        }
        else {
            median = arr[n/2];
        }
        return median ;
    }


    /* Hunderedth Position in a three digit no*/
    public void hundredthPosition(int number){
        int quotient;
        int i =3;
        int hunderedthDigit = -1;
        String[] numberNames = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        System.out.println("\nNumber" + " = " + number);
        while (i > 1) {
            quotient = number / 10;
            number = quotient ;
            hunderedthDigit = quotient;
            i--;
        }

        // System.out.println("hunderedthDigit" + " = " + hunderedthDigit);
        System.out.println("hunderedthDigit" + " = " + numberNames[hunderedthDigit]);
        }

        /* Print the array values*/
    public void printArray(int[] arr){
        System.out.print("Array : ");
        for(int i : arr){
            System.out.print(" " + i);
        }
    }


    }




// Mobile Class
class MobilePhone{
    private int id ;
    private String brand ;
    private String model ;
    private double price ;

    MobilePhone() {

    }
    MobilePhone(int id, String brand, String model, double price){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void mobilePhoneFeatures() {
        System.out.println("\nMobile Phone Features : ");
        System.out.println("ID" + " = " + id);
        System.out.println("Brand" + " = " + brand);
        System.out.println("Model" + " = " + model);
        System.out.println("Price" + " = " + price);
    }
}