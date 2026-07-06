package in.co.nmsworks.training.week4.day1;

public class InternManager {
    public static void main(String[] args) {
        InternManager internManager = new InternManager();
        internManager.run();
    }

    private void run() {
        Intern[] interns = new Intern[5];
        interns[0] = new Intern("Siva",45000D);
        interns[1] = new Intern("Pandi",55000D);
        interns[2] = new Intern("Abi",25000D);
        interns[3] = new Intern("Anas",75000D);
        interns[4] = new Intern("Vetri",35000D);
        Double avgSalary = calculateAverageSalary(interns);
        System.out.println("Average Salary :: "+avgSalary);
    }

    private Double calculateAverageSalary(Intern[] interns) {
        Double avgSalary = 0D;
        for (Intern intern : interns) {
            avgSalary += intern.getSalary();
        }
        return avgSalary / interns.length;
    }
}
