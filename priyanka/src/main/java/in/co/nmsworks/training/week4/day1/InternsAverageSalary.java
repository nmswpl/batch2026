package in.co.nmsworks.training.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class InternsAverageSalary {
    public static void main(String[] args) {
        InternsAverageSalary internsAverageSalary = new InternsAverageSalary();
        Intern intern1 = new Intern("Priyanka",30000);
        Intern intern2 = new Intern("Maha",40000);
        List<Intern> internsList = new ArrayList<>();
        internsList.add(intern1);
        internsList.add(intern2);

        Intern[] internArray = new Intern[internsList.size()];
        int i =0;
        for (Intern intern : internsList) {
            internArray[i++] = intern;
        }



        internsAverageSalary.averageSalary(internArray);
    }

    private void averageSalary(Intern[] internArray) {
        int average = 0;
        int sum = 0;
        for (Intern intern : internArray) {
            sum+= intern.getSalary();
        }
        average = sum/internArray.length;
        System.out.println("AVerage: " + average);
    }
}
