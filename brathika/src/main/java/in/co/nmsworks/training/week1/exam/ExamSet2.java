package in.co.nmsworks.training.week1.exam;

public class ExamSet2 {
    public static void main(String[] args) {
        findMeadianOfTheArray();
        MobilePhone phone1 = new MobilePhone(101,"Sumsang","Galaxy S24",79999.0);
        MobilePhone phone2 = new MobilePhone(102,"Oppo","oppo f21 s pro",30000.0);
        MobilePhone phone3 = new MobilePhone(103,"Iphone","17 pro",130000);
        MobilePhone phone4 = new MobilePhone(104,"vivo","vivo5",20000);
        MobilePhone phone5 = new MobilePhone(105,"Realme","Note 5+",150000);
        phone1.printDetails();
        phone2.printDetails();
        phone3.printDetails();
        phone4.printDetails();
        phone5.printDetails();
        printHundredPosition(430);
    }

    private static void printHundredPosition(int number1) {
        int value = number1 / 100;
        String[] arr = {"Zero", "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (value <= 9) {
            System.out.println("Hundred position of Number is: "+arr[value]);
        }
    }

    private static void findMeadianOfTheArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int n = array.length;
        float meadian = 0;
        if (n % 2 == 0) {
            float sum = array[n / 2] + array[(n / 2) - 1];
            meadian = sum / 2;
            System.out.println("Meadin of the array is: "+meadian);
        }else {
            meadian = array[(n - 1) / 2];
            System.out.println("Meadian of the array is: "+meadian);
        }
    }
}
