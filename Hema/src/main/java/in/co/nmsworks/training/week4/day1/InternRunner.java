package in.co.nmsworks.training.week4.day1;


public class InternRunner {


    public static void main(String[] args) {
        Intern[] interns = {new Intern("Hema", 10000),
        new Intern("Thanu" , 20000)};

        InternRunner internRunner = new InternRunner();
        System.out.println("Average Salary of Interns = "+ internRunner.averageSalary(interns));

    }

    public Double averageSalary(Intern[] interns)
    {
        Double totalSalary = 0d ;

        for (Intern intern : interns) {
            totalSalary += intern.getSalary();
        }

        return totalSalary / interns.length;
    }
}
