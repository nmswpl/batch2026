package in.co.nmsworks.training.week1.exam;

import java.util.Scanner;

public class ExamProblems {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        avgOfArray(n,arr);
        grades(90);

    }
    public static void avgOfArray(int n,int a[])
    {
        float sum=0;
        for(int i = 0;i < n;i++)
        {
            sum+=a[i];
        }
        float avg=(sum/n);
        System.out.println(sum);
        System.out.println(avg);
    }

    public static void grades(int marks)
    {
        if(marks>90 &&  marks <=100)
        {
            System.out.println("A");
        }
        else if(marks>80 &&  marks <=90)
        {
            System.out.println("B");
        }
        else if(marks>70 &&  marks <=80)
        {
            System.out.println("C");
        }
        else if(marks>60 &&  marks <=70)
        {
            System.out.println("D");
        }
        else if(marks>50 &&  marks <=60)
        {
            System.out.println("E");
        }
        else
        {
            System.out.println("F");
        }

    }

}
