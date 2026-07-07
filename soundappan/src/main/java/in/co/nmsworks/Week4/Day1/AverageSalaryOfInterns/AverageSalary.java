package in.co.nmsworks.Week4.Day1.AverageSalaryOfInterns;

public class AverageSalary {
    public double averageSalary(Intern[]array){
        double totalSalary=0;
        if(array.length==0){
            System.out.println("Array is empty");
        }
        else{
            for(Intern n:array){
                totalSalary=n.getSalary();
            }
        }
        System.out.println("AverageSalary : "+totalSalary);
        return totalSalary;
    }
}
