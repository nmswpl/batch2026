package in.co.nmsworks.training.week1.exam;

public class SetOneQuestions {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};

//        findMean(nums);
//        createAndPrintFiveObjects();
//        printGradeForMark(41);
    }

    private static void findMean(int[] nums){
        double sum = 0;

        for(int num : nums){
            sum += num;
        }

        System.out.println("Total sum : " + sum);
        double mean = (sum/nums.length);
        System.out.println("Mean : " + mean);
    }

    private static void createAndPrintFiveObjects(){
        Book javaProg = new Book(1, "Java Programming", "James Gosling", 450);
        Book effectiveJava = new Book(2, "Effective Java", "Joshua Bloch", 500);
        Book absJava = new Book(3, "Absolute Java", "Walter Savitch", 550);
        Book cleanCode = new Book(4, "Clean Code", "Robert Martin", 450);
        Book coreJava = new Book(5, "Core Java", "Horstmann", 650);

        printObject(javaProg);
        printObject(effectiveJava);
        printObject(absJava);
        printObject(cleanCode);
        printObject(coreJava);
    }

    private static void printObject(Book book){
        System.out.println("ID = " + book.getId());
        System.out.println("Title = " + book.getTitle());
        System.out.println("Author = " + book.getAuthor());
        System.out.println("Price = " + book.getPrice());
    }

    private static void printGradeForMark(int mark){
        if (mark > 100){
            System.out.println("Invalid Marks");
        }else{
            System.out.print("Grade : ");
            if (mark > 90){
                System.out.println("S");
            }
            else if (mark > 80){
                System.out.println("A");
            }
            else if (mark > 70) {
                System.out.println("B");
            }
            else if (mark > 60) {
                System.out.println("C");
            }
            else if (mark > 50) {
                System.out.println("D");
            }
            else {
                System.out.println("F");
            }
        }
    }
}
