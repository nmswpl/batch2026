package in.co.nmsworks.training.week1.exam;

public class SetOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        float mean = findMean(nums);
        System.out.println("Mean is: " + mean);

        Book book1 = new Book(1, "Book 1", "Author 1", 300);
        Book book2 = new Book(2, "Book 2", "Author 2", 340);
        Book book3 = new Book(3, "Book 3", "Author 3", 2300);
        Book book4 = new Book(4, "Book 4", "Author 4", 3055);
        Book book5 = new Book(5, "Book 5", "Author 5", 500);

        book1.displayAttributes();
        book2.displayAttributes();
        book3.displayAttributes();
        book4.displayAttributes();
        book5.displayAttributes();

        getGrades(97);

    }

    public static float findMean(int[] nums){
        float sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

        }
        float mean = sum/(nums.length);
        return mean;
    }


    public static void getGrades(float marks){
        if (marks > 100){
            System.out.println("Invalid input");
        } else {
            if (marks > 90){
                System.out.println("S");
            } else if (marks > 80){
                System.out.println("A");
            } else if (marks > 70){
                System.out.println("B");
            } else if (marks > 60){
                System.out.println("C");
            } else if (marks > 50){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }

}
