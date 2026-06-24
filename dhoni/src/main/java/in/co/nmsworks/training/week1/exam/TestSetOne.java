package in.co.nmsworks.training.week1.exam;

public class TestSetOne {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        meanOfArray(numbers);
        int mark = 70;
        printGrade(mark);

        Book b = new Book(1,"Java Programming","James",450);
        Book b2 = new Book(2,"C Programming"," Robert",250);
        Book b3 = new Book(3,"Javascript Programming","Joshua",350);
        Book b4 = new Book(4,"Python Programming","Martin",450);
        Book b5 = new Book(5,"Java Programming","Brian",450);

        b.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }

    private static void printGrade(int mark) {

        if (mark > 90 && mark <= 100){
            System.out.println("Grade : S");
        }
        else if (mark > 80 && mark <= 90){
            System.out.println("Grade : A");
        }
        else if (mark > 70 && mark <= 80){
            System.out.println("Grade : B");
        }
        else if (mark > 60 && mark <= 70){
            System.out.println("Grade : C");
        }
        else if (mark > 50 && mark <= 60){
            System.out.println("Grade : D");
        }
        else{
            System.out.println("Grade : F");
        }

    }

    private static void meanOfArray(int[] numbers) {
        float sum = 0;
        for(int k : numbers){
            sum = sum + k;
        }

        float mean = sum / numbers.length;
        System.out.println("mean : " + mean);
    }
}

