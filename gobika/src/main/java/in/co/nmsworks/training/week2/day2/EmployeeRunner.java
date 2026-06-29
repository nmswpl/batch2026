package in.co.nmsworks.training.week2.day2;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Gobika", "Developer",30000, "NMSWorks");
        Employee emp2 = new Employee(1,"Gobika", "Developer",30000, "Amazon");


        System.out.println(emp.getCOMPANY());
        System.out.println(emp2.getCOMPANY());

        System.out.println(emp);
//        System.out.println(emp.getName());

//        String name = "NMSWorks";
//        String company = "NMSWorks";
//
//        System.out.println(name == company );
//        System.out.println(name.equals(company));


        Integer i1 = 5;
        Integer i2 = 5;
        System.out.println(i1.equals(i2));

        int i3 = i1;

        System.out.println( i1 == 5);



    }
}
