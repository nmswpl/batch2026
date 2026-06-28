package in.co.nmsworks.training.week1.Exam;

public class HelloWorld {
    public static void medianOfArray() {
        int[] arr = {1, 2, 3, 4, 5};
        if (arr.length % 2 == 0) {
            int mid = arr.length / 2;
            double median = (arr[mid] + arr[mid - 1]) / 2.0;
            System.out.println(median);
        } else {
            System.out.println(arr[arr.length / 2]);
        }
    }

    public static void main(String[] args) {
        medianOfArray();
    }
}

