package in.co.nmsworks.training.week2.day2;

public class RunnerEmployee {
    public static void main(String[] args) {
        Employee emp=new Employee(1,"Jemuna","IT",30000.00,"NMSWorks");
        System.out.println(emp);
        System.out.println(emp.getEmpID());
        System.out.println(emp.getCompanyName());



        String name="NMSWorks";
        String company="NMSWorks";
        System.out.println(name==company);
        System.out.println(name.equals(company));

        Employee emp2=new Employee(1,"Jemuna","IT",30000.00,"NMSWorks");

        System.out.println(emp==emp2);
        System.out.println(emp.equals(emp2));


        Integer i1=10;
        Integer i2=5;
        System.out.println(i1==i2);
        int i3=i1;
        System.out.println(i1<5);

    }
}
