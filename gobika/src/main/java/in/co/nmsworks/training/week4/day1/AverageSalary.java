package in.co.nmsworks.training.week4.day1;

public class AverageSalary {
    public static void main(String[] args) {
        AverageSalary averageSalary = new AverageSalary();
        Intern[] interns = new Intern[5];
        Intern intern1 = new Intern("Gobika",40000);
        interns[0] = intern1;
        Intern intern2 = new Intern("Roshika",70000);
        interns[1] = intern2;
        Intern intern3 = new Intern("hema",50000);
        interns[2] = intern3;
        Intern intern4 = new Intern("Jemuna",40000);
        interns[3] = intern4;
        Intern intern5 = new Intern("Sibani",60000);
        interns[4] = intern5;

        averageSalary.calculateAverageSalary(interns);
    }

    private void calculateAverageSalary(Intern[] interns) {
        Integer totalSalary = 0;
        for (Intern intern : interns) {
            totalSalary += intern.getSalary();
        }
        System.out.println("Average Salary of all interns : "+ totalSalary/interns.length);
    }
}
