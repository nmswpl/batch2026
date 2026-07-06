package in.co.nmsworks.training.week4.day1.intern;

public class InternRunner {
    public static void main(String[] args) {
        InternRunner runner = new InternRunner();

        String[] names = {"dk","ak","vijay","ajay"};
        float [] salaries = {7000,5000,4000,10000};

        Intern[] interns = new Intern[names.length];

        for(int i = 0; i < names.length; i++){
            interns[i] = new Intern(names[i],salaries[i]);
        }

        float average = runner.getAverage(interns);

        System.out.println("average salary : " + average);

    }

    private float getAverage(Intern[] interns) {

        float average = 0;

        for(Intern intern : interns){
            average = average + intern.getSalary();
        }

        return (average/interns.length);

    }


}
