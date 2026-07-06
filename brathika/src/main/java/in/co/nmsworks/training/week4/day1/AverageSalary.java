package in.co.nmsworks.training.week4.day1;

public class AverageSalary {
    public static void main(String[] args) {
        AverageSalary averageSalary = new AverageSalary();
        Intern intern1 = new Intern("Brathika",15000);
        Intern intern2 = new Intern("Sibi",15000);
        Intern intern3 = new Intern("Mohana",15000);
        Intern[] array = {intern1, intern2, intern3};
        averageSalary.calculateAverageSalaryOfInters(array);

    }

    private void calculateAverageSalaryOfInters(Intern[] array) {
        int totalSalary = 0;
        for (Intern intern : array) {
            totalSalary += intern.getSalary();

        }
        System.out.println("Total salary of all interns: "+totalSalary);
        int noOfInters = array.length;
        System.out.println("No of interns: "+noOfInters);
        double averageSalary = (double) totalSalary / array.length ;
        System.out.println("The average salary of the interns are: "+averageSalary);
    }
}
