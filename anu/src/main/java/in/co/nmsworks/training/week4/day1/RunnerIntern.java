package in.co.nmsworks.training.week4.day1;

public class RunnerIntern {
    public static void main(String[] args) {
        RunnerIntern runnerIntern = new RunnerIntern();

        Intern internOne= new Intern("Anushri" ,20000.00);
        Intern internTwo= new Intern("jemuna" ,20000.00);

        Intern[] interns={internOne,internTwo};
        runnerIntern.getAverageSalary(interns);
    }
    private void getAverageSalary(Intern[] interns) {
        double totalSalary = 0.0;

        for (Intern intern : interns) {
            if (intern != null) {
                totalSalary += intern.getSalary();
            }
        }

        System.out.println(totalSalary / interns.length);
    }
}
