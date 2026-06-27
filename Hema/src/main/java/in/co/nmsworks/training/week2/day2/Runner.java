package in.co.nmsworks.training.week2.day2;

public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"Hema","IT",10000, "NMSWorks");
        Employee emp2 = new Employee(1,"Hema","IT",10000,"H&Co");
        System.out.println("Address: "+emp);
        System.out.println(emp.getId());

        String name = "NMSWorks";
        String company = "NMSWorks";
        System.out.println(name == company);
        System.out.println(name.equals(company));

        System.out.println(emp == emp2);
        System.out.println(emp.equals(emp2));

        System.out.println(emp.getCompanyName());
        System.out.println(emp2.getCompanyName());

        Integer i1 = 5;
        Integer i2 = 5;

        System.out.println(i1 == i2);

        System.out.println(i1<5);



    }
}
