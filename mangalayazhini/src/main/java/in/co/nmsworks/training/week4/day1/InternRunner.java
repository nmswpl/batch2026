package in.co.nmsworks.training.week4.day1;

public class InternRunner {
    public static void main(String[] args) {

        String[] names = {"Priya", "Amizh", "Nithya", "Aambal", "Harini"};
        Integer[] salary = {15000, 20000, 17000, 18000, 19000};

        Company company1 = new Company();

        for (int i = 0; i < 5; i++) {
            company1.addInterns(new Intern(names[i], salary[i]));
        }

        company1.calculateAvgInternSalary(company1.getInternList());
    }
}

