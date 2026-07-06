package in.co.nmsworks.training.week4.day1;

public class InternRunner {
    public static void main(String[] args) {
        InternRunner internRunner = new InternRunner();
        Intern intern1 = new Intern("Name1", 100000);
        Intern intern2 = new Intern("Name2", 200000);
        Intern intern3 = new Intern("Name3", 50000);
        Intern[] interns = {intern1, intern2, intern3};
        Float avgSalary = internRunner.findAverageSalary(interns);
        System.out.println("Average salary: " + avgSalary);
    }

    public Float findAverageSalary(Intern[] interns){
        Float avgSalary = 0f;
        for (Intern intern : interns) {
            avgSalary += intern.getSalary();

        }
        return avgSalary;
    }
}
