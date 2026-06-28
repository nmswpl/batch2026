package in.co.nmsworks.week2.day1.exam;

public class MedianOfArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("---MEDIAN OF ARRAY---");
        findMedian(arr);
    }

    public static void findMedian(int[] a) {
        float median = 0;
        float sum = 0;
        if (a.length % 2 == 0) {
            sum = a[a.length / 2] + a[(a.length / 2) - 1];
            median = sum / 2;
        } else {
            sum = a[a.length / 2];
            median = sum / 2;
        }
        System.out.println(median);


    }
}
