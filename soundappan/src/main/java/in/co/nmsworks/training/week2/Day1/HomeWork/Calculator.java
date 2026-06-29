package in.co.nmsworks.training.week2.Day1.HomeWork;

import com.sun.org.apache.regexp.internal.RE;

public class Calculator {
    public void performCalculation(int a,int b,Computable operation){
        int result=operation.compute(a,b);
        System.out.println("Result : "+result);
    }

}
