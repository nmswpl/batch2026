package in.co.nmsworks.training.week4.day1;

public class InternRunner {
    public static void main(String[] args) {
        Interns vetri=new Interns("vetri",10000);;
        Interns sinthanai=new Interns("sinthanai",20000);
        Interns selvan=new Interns("selvan",10000);
        Interns[] array={vetri,sinthanai,selvan};
        int averageSalary = InternRunner.avargeSalaryCalcultor(array);
        System.out.println(averageSalary);
    }

    private static int avargeSalaryCalcultor(Interns[] interns) {
        int totalSalary=0;
        int noOfInterns=interns.length;
        for (Interns intern : interns) {
            totalSalary += intern.getSalary();
        }
        int averageSal=totalSalary/noOfInterns;
        return averageSal;
    }
}
