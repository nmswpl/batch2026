package in.co.nmsworks.training.week4.day1;

public class InternAverageFinder {
    public static void main(String[] args) {
        InternAverageFinder runner =  new InternAverageFinder();
        Intern[] interns = runner.getInternDetails();
        runner.findAverage(interns);
    }

    private void findAverage(Intern[] interns) {
        int sumOfSalary = 0;
        for (Intern intern : interns) {
                if (intern.getSalary() != 0) {
                    sumOfSalary += intern.getSalary();
                }
        }
        System.out.println("The Average Salary for the " + interns.length + " interns are :: " + (double) (sumOfSalary / interns.length));
    }

    private Intern[] getInternDetails() {
        Intern anas = new Intern("Anas", 20000);
        Intern aakil = new Intern("Aakil", 15000);
        Intern kowshik = new Intern("Kowshik",21000);
        Intern farhaan = new Intern("Farhaan", 12500);
        Intern[] internList = new Intern[4];
        internList[0] = anas;
        internList[1] = aakil;
        internList[2] = kowshik;
        internList[3] = farhaan;
        return internList;
    }
}
