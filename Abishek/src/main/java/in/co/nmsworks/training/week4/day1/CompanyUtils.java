package in.co.nmsworks.training.week4.day1;

public class CompanyUtils {
    public static void main(String[] args) {
        Intern interns[] = new Intern[2];
        String[] name = {"Abi","Shek"};
        double[] salary = {10000, 20000};
        for(int i=0;i< name.length;i++)
        {
            Intern it = new Intern(name[i],salary[i]);
            interns[i] = it;
        }
        System.out.println(getAverageSalary(interns));
    }
    public static double getAverageSalary(Intern[] interns) {
            if (interns == null || interns.length == 0) {
                return 0.0;
            }

            double totalSalary = 0;
            for (Intern intern : interns) {
                if (intern != null) {
                    totalSalary += intern.getSalary();
                }
            }

            return totalSalary / interns.length;
        }
    }
