package in.co.nmsworks.week2.day2;

public class Runner {
    public static void main(String[] args) {
        Employee emp = new Employee(23, "Priya", 450, "NMSWorks");
        System.out.println(emp);
        System.out.println(emp.getId());
        System.out.println(emp.toString());

        Employee emp2 = new Employee(23, "Priya", 450, "NMSWorks");
        System.out.println(emp == emp2);
        System.out.println(emp.equals(emp2));
        System.out.println(emp.getCompanyName());
        System.out.println(emp2.getCompanyName());
        Integer i1=5;
        Integer i2=5;
        System.out.println(i1==i2);//autoboxing
        int i3=i1;//no error comes known as autoboxing
        System.out.println(i1<5);


//        String name="NMSWorks";
//        String company="NMSWorks";
//        System.out.println(name==company);
//        System.out.println(name.equals(company));

    }
}
