package in.co.nmsworks.training.week1.set2;

public class FindMedian {
    public static void main(String[] args) {
//        findMedian();
    }

    private static void findMedian() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int length = array.length;

        if (length % 2 == 0)
        {
            float median = (float)( array[length/2] + array[( length/2 ) - 1] )/2 ;
            System.out.println("Median = "+ median);
        }
        else
        {
            System.out.println("Median = "+array[length/2]);
        }
    }

}
