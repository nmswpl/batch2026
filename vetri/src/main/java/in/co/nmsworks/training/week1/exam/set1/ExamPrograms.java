package in.co.nmsworks.training.week1.exam.set1;

public class ExamPrograms {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 7};
        meanOfAnArray(numbers);

        int mark = 100;
        char grade = markToGrade(mark);

        System.out.println("Grade for the Mark "+ mark +" is:" + grade);
    }

    /*
     * Program to find the mean of an array.
     * Mean = Sum of elements / Number of elements
     */
    public static void meanOfAnArray(int[] numbers) {

        int sum = 0;
        int numberOfElements = numbers.length;

        // Calculate the sum of array elements
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Calculate mean
        int mean = sum / numberOfElements;

        System.out.println("Mean of the array is : " + mean);
    }

    /*
     * Program to print grade based on mark.
     * 91-100 = S
     * 81-90  = A
     * 71-80  = B
     * 61-70  = C
     * 51-60  = D
     * Others = F
     */
    public static char markToGrade(int mark) {

        if (mark >= 91 && mark <= 100) {
            return 'S';
        } else if (mark >= 81 && mark <= 90) {
            return 'A';
        } else if (mark >= 71 && mark <= 80) {
            return 'B';
        } else if (mark >= 61 && mark <= 70) {
            return 'C';
        } else if (mark >= 51 && mark <= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

}