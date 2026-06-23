package in.co.nmsworks.training.week1.exam;

import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        double[] number=new double[n];
        for (int i = 0; i < number.length; i++) {
            number[i]=sc.nextDouble();
        }
        double a= medianPrg(number);
        System.out.println(" number "+ a);

        int num=sc.nextInt();
        digitNumber(num);
    }
    private static double medianPrg(double[] arr) {
        int n = arr.length;
        if (n % 2 != 0) {
            return arr[n/2];
        }
        return  (arr[(n/2)-1] + arr[n/2])/2.0;
    }

    private static void digitNumber(int num){
        int temp=num;
        String w[]={"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        while(temp>=10) {
            temp = temp / 10;
        }
        System.out.println(w[temp]);

    }

}
