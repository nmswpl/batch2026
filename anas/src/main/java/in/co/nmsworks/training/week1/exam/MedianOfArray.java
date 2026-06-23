package in.co.nmsworks.training.week1.exam;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int len = arr.length;
        int median;
        if ( len % 2 == 0){
            median =arr[len / 2] + arr[(len / 2) - 1];
        }
        else{
            median = arr[(len / 2)];
        }
        System.out.println("median of the array :: " + median);
    }
}

