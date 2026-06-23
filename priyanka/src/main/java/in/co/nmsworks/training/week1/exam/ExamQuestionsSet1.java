package in.co.nmsworks.training.week1.exam;

public class ExamQuestionsSet1 {

    public static void main(String[] args) {
        meanOfArray();
        printGradeForMark(89);
    }

    public static void printGradeForMark(int mark) {
        if(mark > 100){
            System.out.println("Invalid marks");
        }
        else{
            if (mark > 90){
                System.out.println("Grade: S" );
            }
            else if (mark > 80) {
                System.out.println("Grade: A");
            }
            else if (mark > 70) {
                System.out.println("Grade: B");
            }
            else if (mark > 60) {
                System.out.println("Grade: C");
            }
            else if(mark > 50){
                System.out.println("Grade: D");
            }
            else {
                System.out.println("Grade: F");
            }
        }
    }

    public static void meanOfArray() {
        int[] arr = {1,2,3,4,5};
        float sum = 0;
        for (int i : arr){
            sum += i;
        }
        float mean = sum / 2;
        System.out.println("Mean: " + mean);
    }
}
