package in.co.nmsworks.training.week1.exam;

public class FindMeanOfAnArray {
    public static void main(String[] args) {
        calculateMean();
    }

    private static void calculateMean() {
        int[] arr = {1, 2, 3, 4, 5, 4};
        float sum = 0;
        for (int j : arr) {
            sum += j;
        }
        float avg = sum / arr.length;
        System.out.println("Mean of an Array : "+ avg);
    }
}
