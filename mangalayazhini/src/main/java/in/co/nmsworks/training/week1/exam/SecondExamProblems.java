package in.co.nmsworks.training.week1.exam;

public class SecondExamProblems {

    public static void main(String[] args) {
        SecondExamProblems obj = new SecondExamProblems();

        int[] array = {1,2,3,4,5};
        obj.arrayMean(array);
        obj.calculateGrade(75);


        Book book1 = new Book(1,"Core Java","Author1",1500);
        Book book2 = new Book(2,"Linux","Author2",900);
        Book book3 = new Book(3,"C Programming","Author3",800);
        Book book4 = new Book(4,"Operating System","Author4",1900);
        Book book5 = new Book(5,"DBMS","Author5",2000);

        book1.bookDetails();
        book2.bookDetails();
        book3.bookDetails();
        book4.bookDetails();
        book5.bookDetails();
    }

    public void calculateGrade(int mark) {
        if(mark > 100){
            System.out.println("Invalid Mark");
        }
        else{
            if(mark >90){
                System.out.println("Grade : S");
            } else if (mark >80) {
                System.out.println("Grade : A");
            }
            else if(mark > 70){
                System.out.println("Grade : B");
            }
            else if(mark > 60){
                System.out.println("Grade : C");
            } else if (mark >50) {
                System.out.println("Grade : D");
            }
            else{
                System.out.println("Grade : F");
            }
        }
    }

    public void arrayMean(int[] arr) {

        double sum = 0  ;
        System.out.print("\nArray : ");
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            System.out.print(arr[i] + " ");
        }

        double mean = sum/arr.length ;
        System.out.println("\nThe mean of array : " + mean);
    }

}


