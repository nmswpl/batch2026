package in.co.nmsworks.training.week4.day1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InternRunner {
    public static void main(String[] args) {
        InternRunner internRunner = new InternRunner();

        Scanner scanner = new Scanner(System.in);
        Intern intern1 = new Intern("Sibani", 30000.00);
        Intern intern2 = new Intern("Mona", 35000.00);
        Intern intern3 = new Intern("Brathika", 40000.00);
        Intern[] internArray = {intern1, intern2, intern3};
        internRunner.getAverageSalary(internArray);
    }

    private void getAverageSalary(Intern[] interns) {
        double sumSalary = 0;
        double avgSalary = 0;
        for (Intern intern : interns) {
            sumSalary += intern.getSalary();
        }
        avgSalary = sumSalary / interns.length;
        System.out.println("Average Salary : " + avgSalary);
    }
}
