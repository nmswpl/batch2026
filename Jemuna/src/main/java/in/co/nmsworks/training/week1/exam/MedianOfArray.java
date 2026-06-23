package in.co.nmsworks.training.week1.exam;

public class MedianOfArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=arr.length;
        float sum=0;
        float median;
        if(n%2==0){
            sum=arr[n/2]+arr[(n/2)-1];
            median=sum/2;
        }
        else{
            median=arr[n/2];
        }
        System.out.println("The Median of the Given Array: " +median);

    }
}
