package in.co.nmsworks.training.week1.exam;

import java.util.Arrays;

public class ExamQuestionsSet2 {
    public static void main(String[] args) {
        System.out.println("hello");
        medianOfArray();
        hundredPosition(453);
    }

    public static void medianOfArray(){

        int[] array = {10,2,30,5,50};
        if(array.length % 2 ==0){
            float mid1 = array[array.length/2 -1];
            float mid2 = array[(array.length/2)];
            float median = (mid1 + mid2) / 2;
            System.out.println("Median: "+ median);
        }
        else{
            Arrays.sort(array);
            int median = array.length/2;
            System.out.println(array[median]);
        }
    }
    public static void hundredPosition(int number){
        if(number<100 || number>999){
            System.out.println("Only three digits number is allowed");
            return;
        }

        int hundredValue= number / 100;
        switch(hundredValue){
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;

            case 7:
                System.out.println("Seven");
                break;

            case 8:
                System.out.println("Eight");
                break;

            case 9:
                System.out.println("Nine");
                break;

            default:
                System.out.println("Invalid number");
        }
    }
}

