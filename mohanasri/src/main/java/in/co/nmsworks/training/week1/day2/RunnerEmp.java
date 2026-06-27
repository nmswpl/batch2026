package in.co.nmsworks.training.week1.day2;

public class RunnerEmp {
    public static void main(String[] args) {

        Integer i1 = 5;
        Integer i2 = 5;
        int i3 = 5;

        String name = "Mohana";
        name.startsWith("M");
        if (i1 < 6){

        }
//        String name = "NMSWorks";
        String company = "NMSWorks";
        System.out.println(i1 == i3);

        System.out.println(name == company);
        System.out.println(name.equals(company));

        Employee emp1 = new Employee();

        emp1.setId(1);
        emp1.setName("Mohanasri");
        emp1.setDept("Software Engineer");
        emp1.setSalary(100000);
        System.out.println(emp1);
    }
}
//        emp1.setCompanyName("NMSWorks");
        //emp1.setIsFullTime(true);

//        Employee emp2 = new Employee();
////        emp2.setId(2);
////        emp2.setName("Priya");
////        emp2.setDept("Software Engineer");
////        emp2.setSalary(200000);
////        //emp2.setIsFullTime(true);
////        System.out.println(emp1 == emp2);
////        System.out.println(emp1.equals(emp2));
////        System.out.println(emp2);
//        System.out.println("Employee ID: "+ emp1.getId() + " Employee 1: " + emp1.getName() + ", Dept: " + emp1.getDept() + "company " + emp1.getCompanyName());
////        System.out.println("Employee 2: " + emp2.getName() + ", Dept: " + emp2.getDept());
//    }
//}

