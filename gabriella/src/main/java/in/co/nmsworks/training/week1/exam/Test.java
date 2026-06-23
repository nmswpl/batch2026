package in.co.nmsworks.training.week1.exam;

public class Test {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4};
        double res = findMedian(arr);
        System.out.println("Median is: " + res);

        System.out.print("Hundredth digit is: ");
        printHundredth(678);
        System.out.println(" ");

        MobilePhone phone1 = new MobilePhone(201, "Apple", "15", 80000);
        MobilePhone phone2 = new MobilePhone(202, "Apple", "17", 85000);
        MobilePhone phone3 = new MobilePhone(203, "Samsung", "Galaxy A73", 50000);
        MobilePhone phone4 = new MobilePhone(204, "Apple", "14", 70000);
        MobilePhone phone5 = new MobilePhone(205, "Samsung", "Galaxy M42", 25000);

        System.out.println("Phone 1: ");
        phone1.printAttributes();
        System.out.println("Phone 2: ");
        phone2.printAttributes();
        System.out.println("Phone 3: ");
        phone3.printAttributes();
        System.out.println("Phone 4: ");
        phone4.printAttributes();
        System.out.println("Phone 5: ");
        phone5.printAttributes();
    }

    public static float findMedian(int[] nums){
        int size = nums.length;
        float median = 0f;

        if (size % 2 != 0){
            int mid = size/2;
            median = nums[mid];
        }
        else {
            int firstMid = size/2;
            int secondMid = firstMid - 1;
            median = ((float) nums[firstMid] + nums[secondMid]) / 2;
        }
        return median;
    }

    public static void printHundredth(int num) {
        if (num < 100) {
            System.out.println("Zero");
        } else if (num <1000){
            while (num > 10) {
                num /= 10;
            }
            if (num == 1) {
                System.out.println("One");
            } else if (num == 2) {
                System.out.println("Two");
            } else if (num == 3) {
                System.out.println("Three");
            } else if (num == 4) {
                System.out.println("Four");
            } else if (num == 5) {
                System.out.println("Five");
            } else if (num == 6) {
                System.out.println("Six");
            } else if (num == 7) {
                System.out.println("Seven");
            } else if (num == 8) {
                System.out.println("Eight");
            } else {
                System.out.println("Nine");
            }
        } else {
            System.out.println("Invalid input");
        }
    }


}
