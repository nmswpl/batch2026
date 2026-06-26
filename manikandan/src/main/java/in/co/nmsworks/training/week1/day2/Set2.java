package in.co.nmsworks.training.week1.day2;

public class Set2 {
    public static void main(String[]args)
    {
        meanValue();
        gradeValue(100);

    }
    public static void meanValue()
    {
        int [] arr= {1,2,3,4,5};
        int n = arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        int mean=sum/n;
        System.out.println(mean);
    }

    public static void gradeValue(int mark)
    {
        if (mark < 0 || mark > 100) {
            System.out.println("Mark: " + mark + " Grade: Invalid Mark");
            return;
        }

        String grade;


        if (mark >= 91 && mark <= 100) {
            grade = "S";
        } else if (mark >= 81 && mark <= 90) {
            grade = "A";
        } else if (mark >= 71 && mark <= 80) {
            grade = "B";
        } else if (mark >= 61 && mark <= 70) {
            grade = "C";
        } else if (mark >= 51 && mark <= 60) {
            grade = "D";
        } else {
            grade = "F";
        }


        System.out.println("Mark: " + mark + " -> Grade: " + grade);


    }

}
