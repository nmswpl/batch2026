package in.co.nmsworks.week4.day1;



public class InternMain {
    public static void main(String[] args) {

        Intern intern1 = new Intern(5000, "Priya");
        Intern intern2 = new Intern(6000, "Kavya");

        Intern[] arr = new Intern[]{intern1, intern2};

        double sum = 0;
        double noOfSalary = arr.length;
        for (Intern intern : arr) {
            sum += intern.getSalary();
        }

        double avgSalary = sum / noOfSalary;
        System.out.println("Average Salary of interns :" + avgSalary);
    }

}
