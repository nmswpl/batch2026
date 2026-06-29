package in.co.nmsworks.training.week1.exam;

public class SetBTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        findMedian(arr);
        Phone ph1 = new Phone(201, "Samsung", "Galaxy S24", 79999.00);
        Phone ph2 = new Phone(202, "Apple","iPhone 16",89999.00);
        Phone ph3 = new Phone(203, "Oneplus", "13R", 42999.00);
        Phone ph4 = new Phone(204, "Google", "Pixel 10", 74999.00);
        Phone ph5 = new Phone(205, "Xiaomi", "Redmi Note 15", 22999.00);

        ph1.printDetails(ph1);
        ph2.printDetails(ph2);
        ph3.printDetails(ph3);
        ph4.printDetails(ph4);
        ph5.printDetails(ph5);
        printHundredthPosition();
    }

    private static void printHundredthPosition() {
        int num = 567;
        if (num <99  || num >1000){
            System.out.println("Invalid Output");
        }
        else {
            int digit = num /100;
            String[] values = {"Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
            System.out.println("Hundredth Position : " + values[digit]);

        }
    }

    private static void findMedian(int[] arr) {

        float median = 0, sum =0;
        int n = arr.length;

            if(n % 2 == 0) {
                sum = arr[n/2]+ arr[n/2 -1];
                median = sum / 2;
            }
            else {
                median = arr[n/2];
            }
        System.out.println("Median : " + median);
    }

}
