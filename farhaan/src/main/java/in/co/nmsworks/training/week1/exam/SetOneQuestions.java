package in.co.nmsworks.training.week1.exam;

public class SetOneQuestions {
    public static void main(String[] args) {
        meanOfTheArray();
        printGradeForMarks(76);
        Book book1 = new Book(1,"Java","James",250);
        Book book2 = new Book(2,".NET","John",150);
        Book book3 = new Book(3,"JS","Kumar",370);
        Book book4 = new Book(4,"Python","Seb",290);
        Book book5 = new Book(5,"C++","Eve",500);
        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();
    }

    private static void printGradeForMarks(int marks) {
        if(marks > 100){
            System.out.println("Invalid Marks");
        }
        if(marks > 90){
            System.out.println("S Grade");
        }
        else if (marks <= 90 && marks > 80) {
            System.out.println("A Grade");
        }
        else if (marks <=80 && marks > 70){
            System.out.println("B Grade");
        }
        else if (marks <= 70 && marks > 60) {
            System.out.println("C Grade");
        }
        else if (marks <= 60 && marks > 50) {
            System.out.println("D Grade");
        }
        else{
            System.out.println("F Grade");
        }
    }

    private static void meanOfTheArray() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("The Mean of the Array is: " + (float) sum / array.length);
    }

}
