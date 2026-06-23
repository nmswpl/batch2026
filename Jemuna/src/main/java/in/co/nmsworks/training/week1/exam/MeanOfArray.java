package in.co.nmsworks.training.week1.exam;

public class MeanOfArray {
    public static void main(String[] args) {
        int[] ar=new int[5];
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        ar[3]=4;
        ar[4]=5;
        int mean=0;
        for(int i:ar){
            mean=(mean+i);

        }
        float sum=mean/ar.length;
        System.out.println("The mean of an Array is:"+ sum);

    }
}
