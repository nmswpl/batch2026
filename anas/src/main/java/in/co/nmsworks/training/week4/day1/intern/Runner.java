package in.co.nmsworks.training.week4.day1.intern;

public class Runner {
    public static void main(String[] args) {

        Runner runner = new Runner();
        Intern i1 = new Intern("anas",10000);
        Intern i2 = new Intern("kowshik",12000);
        Intern i3 = new Intern("farhan", 13000);

        Intern[] interns = {i1, i2, i3};
        System.out.println(runner.findAverageSalary(interns));

    }

    private int findAverageSalary(Intern[] interns) {
        int averageSalary = 0;
        int sumOfSalary = 0;
        for (Intern intern : interns) {
            int salary = intern.getSalary();
            sumOfSalary += salary;
        }
        averageSalary = sumOfSalary / interns.length;
        return averageSalary;
    }
}
