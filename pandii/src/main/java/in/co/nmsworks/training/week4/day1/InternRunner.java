package in.co.nmsworks.training.week4.day1;

import java.util.Scanner;

public class InternRunner {
    public static void main(String[] args) {
        InternRunner intern=new InternRunner();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Intern Size");
        int internSize=scanner.nextInt();
        Interns[] trainees=new Interns[internSize];

        for(int i=0;i<trainees.length;i++)
        {
            System.out.println("Enter name and salary");
            String name=scanner.next();
            Integer salary=scanner.nextInt();
            trainees[i]=new Interns(name,salary);
        }

        intern.avgSalary(trainees);
    }


    private void avgSalary(Interns[] trainees) {
        int avgSal=0;
        for (Interns trainee : trainees) {
            avgSal+=trainee.getSalary();
        }
        avgSal=avgSal/trainees.length;
        System.out.println("Average Salary of interns "+avgSal);
    }
}
