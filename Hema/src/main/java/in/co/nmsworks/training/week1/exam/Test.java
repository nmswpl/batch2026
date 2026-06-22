package in.co.nmsworks.training.week1.exam;

public class Test {
    public static void main(String[] args) {
        printMean();
//        printGrade(87);

    }

    public static void printMean() {
        int[] arr1 = {1,2,3,4,5};

        int sum = 0;
        for(int number:arr1) {
            sum = sum + number;
        }

        float mean = (float) sum / arr1.length;

        System.out.println("Mean of the given array is :"+ mean);
    }

    public static void printGrade(int mark) {
        char grade;


        if( mark>=91 && mark <=100 )
            grade = 'S';
        else if(mark >= 81 && mark<=90)
            grade = 'A';
        else if(mark>=71 && mark<=80)
            grade = 'B';
        else if(mark>=61 && mark<=70)
            grade = 'C';
        else if(mark>=51 && mark<=60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("Grade : "+grade);
    }
}
