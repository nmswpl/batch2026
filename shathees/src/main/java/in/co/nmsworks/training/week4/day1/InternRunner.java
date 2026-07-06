package in.co.nmsworks.training.week4.day1;

public class InternRunner {
    public static void main(String[] args) {
        String arr[] = {"ram","kani","shathees"};
        int arr2[] = {200,300,200};
        Intern[] interns = new Intern[3];
        for (int i = 0; i < interns.length; i++) {
            interns[i] = new Intern(arr[i],arr2[i]);

        }
        printAvg(interns);

    }

    private static void printAvg(Intern[] interns) {
        int sum = 0;

        for (int i = 0; i < interns.length; i++) {
            sum += interns[i].getSal();
        }
        System.out.println("avg sal :"+sum/interns.length);
    }
}
