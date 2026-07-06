package in.co.nmsworks.training.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Intern> internList = new ArrayList<>();


    public void calculateAvgInternSalary(List<Intern> internsList){
        Double sumOfSalary = 0.0 ;
        for (Intern intern : internsList) {
            sumOfSalary += intern.getSalary();
        }

        Double avgSalary = sumOfSalary/internsList.size();
        System.out.println("Average Salary of Interns in " + companyName + " : " + avgSalary);
    }


    public void addInterns(Intern intern){
        internList.add(intern);
    }

    public List<Intern> getInternList(){
        return internList;
    }

}
