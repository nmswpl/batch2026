package in.co.nmsworks.training.week1.exam;

import java.util.Arrays;

public class ExamProblemsSet2 {
    public static void main(String[] args)
    {
        int arr[]={2, 3, 4, 5, 6, 7};
        median(arr);
        hundredthPosition(980);

    }
    public static void median(int[] arr)
    {
        Arrays.sort(arr);
        int n=arr.length;
        if(n%2==1)
        {
            System.out.println(arr[n/2]);
        }
        else {
            int median=(arr[n/2]+arr[(n/2)-1])/2;
            System.out.println(median);
        }
    }
    public static void hundredthPosition(int num)
    {
        if(num>999)
        {
            System.out.println("Invalid number");
            return;
        }
        if(num<99)
        {
            System.out.println("Zero");
            return;
        }
        else if(num/100==1)
        {
            System.out.println("One");
        }
        else if(num/100==2)
        {
            System.out.println("Two");
        }
        else if(num/100==3)
        {
            System.out.println("Three");
        }
        else if(num/100==4)
        {
            System.out.println("Four");
        }
        else if(num/100==5)
        {
            System.out.println("Five");
        }
        else if(num/100==6)
        {
            System.out.println("Six");
        }
        else if(num/100==7)
        {
            System.out.println("seven");
        }
        else if(num/100==8)
        {
            System.out.println("Eight");
        }
        else if(num/100==9)
        {
            System.out.println("Nine");
        }

    }
}
