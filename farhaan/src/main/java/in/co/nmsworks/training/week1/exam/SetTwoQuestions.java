package in.co.nmsworks.training.week1.exam;

public class SetTwoQuestions {
    public static void main(String[] args) {
        findingMedianOfArray();
        printHundredPosition(942);
        MobilePhoneDetails phone1 = new MobilePhoneDetails(1, "Samsung", "S24", 80000.0);
        MobilePhoneDetails phone2 = new MobilePhoneDetails(2, "Vivo", "V1", 250000.0);
        MobilePhoneDetails phone3 = new MobilePhoneDetails(3, "Oppo", "a7", 30000.0);
        MobilePhoneDetails phone4 = new MobilePhoneDetails(4, "Mi", "A2", 30000.0);
        MobilePhoneDetails phone5 = new MobilePhoneDetails(5, "Apple", "ipad", 80000.0);
        phone1.display();
        phone2.display();
        phone3.display();
        phone4.display();
        phone5.display();
    }

    public static void findingMedianOfArray(){
        int[] array = {1, 2, 3, 4, 5, 6};
        int n= array.length;
        if(n % 2 == 1){
            System.out.println("The Median of the array is :" + (float) array[n/2]);
        }
        else {
            System.out.println("The Median of the array is :" + (float) (array[(n/2)-1] + array[n/2])/2);
        }
    }

    public static void printHundredPosition(int num){
        int digit =0;
        while(num > 0){
            digit = num%10;
            num /= 10;
        }
        if(digit == 1){
            System.out.println("One");
        }
        else if (digit == 2){
            System.out.println("Two");
        }
        else if (digit == 3){
            System.out.println("Three");
        }
        else if (digit == 4){
            System.out.println("Four");
        }
        else if (digit == 5){
            System.out.println("Five");
        }
        else if (digit == 6){
            System.out.println("Six");
        }
        else if (digit == 7){
            System.out.println("Seven");
        }
        else if (digit == 8){
            System.out.println("Eight");
        }
        else if (digit == 9){
            System.out.println("Nine");
        }
        else if (digit == 0){
            System.out.println("Zero");
        }
    }

}

