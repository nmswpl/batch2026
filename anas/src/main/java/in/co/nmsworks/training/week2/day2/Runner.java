package in.co.nmsworks.training.week2.day2;

public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee(1,"anas","ct", 20000,"NMSWorks");
        Employee emp2 = new Employee(1,"anas","ct", 20000,"NMSWorks");
        System.out.println(emp);
        System.out.println(emp.getId());

        Integer i1 = new Integer(4);
        Integer i2 = new Integer(4);




        emp.getCompanyname();


        String name = "NMSWorks";
        String company = "NMSWorks";
        System.out.println( name == company );
        System.out.println( name.equals(company));
        System.out.println( emp == emp2);
        System.out.println(emp.equals(emp2));
        System.out.println(emp);
        System.out.println( i1.equals(i2));
    }


}
