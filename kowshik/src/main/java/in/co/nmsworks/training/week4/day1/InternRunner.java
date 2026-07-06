package in.co.nmsworks.training.week4.day1;

public class InternRunner {
    public static void main(String[] args) {
        Intern[] interns = new Intern[3];
        interns[0] = new Intern(1, "kowshik", 50000);
        interns[1] = new Intern(2, "senthil", 60000);
        interns[2] = new Intern(3, "murugan", 70000);

        double averageSalaryOfInterns = calculateAverageSalaryOfInterns(interns);
        System.out.println("Average salary of interns : Rs " + averageSalaryOfInterns);
    }

    static double calculateAverageSalaryOfInterns(Intern[] interns) {
        double totalSalary = 0;

        for (Intern intern : interns) {
            totalSalary += intern.getSalary();
        }

        return totalSalary/interns.length;
    }
}
