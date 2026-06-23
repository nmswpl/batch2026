package in.co.nmsworks.training.week1.exam;

public class GradeCalculation {
    public static void main(String[] args) {
        findGrade();
    }

    private static void findGrade() {
        int mark = 78;
        if (mark > 100 || mark < 0){
            System.out.println("Invalid Inputs");
        }
        else {
            if ( mark > 90){
                System.out.println("Grade of "+mark+" is S");
            } else if (mark > 80) {
                System.out.println("Grade of "+mark+" is A");
            }
            else if (mark > 70 ) {
                System.out.println("Grade of "+mark+" is B");
            }
            else if (mark > 60) {
                System.out.println("Grade of "+mark+" is C");
            }
            else if (mark >  50) {
                System.out.println("Grade of "+mark+" is D");
            }
            else{
                System.out.println("Grade of "+mark+" is Fail");
            }
        }

    }
}
