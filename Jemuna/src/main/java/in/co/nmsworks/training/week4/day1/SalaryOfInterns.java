package in.co.nmsworks.training.week4.day1;

public class SalaryOfInterns {
    public static void main(String[] args) {
        Intern[] internList = new Intern[2];
        internList[0] = new Intern("Jems", 30000);
        internList[1] = new Intern("Anu", 30000);
        averageSalaryOfInterns(internList);
    }

    private static void averageSalaryOfInterns(Intern[] interns) {
        int sumOfSalary = 0;
        for (Intern intern : interns) {
            sumOfSalary += intern.getSalary();
        }
        int averageSalary = sumOfSalary / interns.length;
        System.out.println("Average Salary : " + averageSalary);
    }
}
