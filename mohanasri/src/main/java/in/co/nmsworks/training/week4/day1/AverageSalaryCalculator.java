package in.co.nmsworks.training.week4.day1;

public class AverageSalaryCalculator {
    public static void main(String[] args) {


        Intern intern1 = new Intern("mohana", 5000);
        Intern intern2 = new Intern("Sibi", 4000);
        Intern intern3 = new Intern("abi", 6000);

        Intern[] internsArray = {intern1, intern2, intern3};
        AverageSalaryCalculator avg = new AverageSalaryCalculator();
        avg.getAverageSalary(internsArray);
    }

    private void getAverageSalary(Intern[] internsArray) {
        int sum = 0;
        for (Intern i : internsArray){
            sum += i.getSalary();

        }
        System.out.println(sum);
       int avg = sum / internsArray.length;
        System.out.println("Average : "+ avg);
    }
}
