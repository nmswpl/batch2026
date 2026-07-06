package in.co.nmsworks.training.week4.Day1;

public class InternsRunner{
    public static void main(String[] args) {
        InternsRunner run = new InternsRunner();
        Interns[] internsList = {
                new Interns("MANS", 25000.0),
                new Interns("MADS", 30000.0),
                new Interns("PRIS", 22000.0)
        };
        run.averageSalary(internsList);
        double avg = run.averageSalary(internsList);
        System.out.println("The average salary of the interns is: " + avg);

    }

    private double averageSalary(Interns[] intern) {
        if(intern == null || intern.length ==0){
                return 0.0;
        }
        double sumOfsalary = 0.0;

        for(Interns intI:intern){
            sumOfsalary+=intI.getSalary();
        }
        return  sumOfsalary/intern.length;


    }

}
