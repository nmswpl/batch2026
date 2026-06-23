package in.co.nmsworks.training.week1.exam;

public class TestSet1 {
    public static void main(String args[])
    {
        findMean();
        markSlab();
        printBook();
    }

    private static void printBook() {
        Book b1 = new Book(101, "Java Programming", "James", 450.0);
        Book b2 = new Book(102, "HTML", "Abishek", 500.0);
        Book b3 = new Book(103, "CSS", "Raj", 400.0);
        Book b4 = new Book(104, "CPP", "Siva", 450.0);
        Book b5 = new Book(104, "AI intro", "Mani", 420);

        System.out.println(b1.getId()+" "+b1.getTitle()+" "+b1.getAuthor()+" "+b1.getPrice());
        System.out.println(b2.getId()+" "+b2.getTitle()+" "+b2.getAuthor()+" "+b2.getPrice());
        System.out.println(b3.getId()+" "+b3.getTitle()+" "+b3.getAuthor()+" "+b3.getPrice());
        System.out.println(b4.getId()+" "+b4.getTitle()+" "+b4.getAuthor()+" "+b4.getPrice());
        System.out.println(b5.getId()+" "+b5.getTitle()+" "+b5.getAuthor()+" "+b5.getPrice());
    }

    private static void markSlab() {
        int mark = 95;
        if(mark > 100) System.out.println("Invalid");
        else {
            if(mark > 90 && mark < 100) System.out.println("S");
            else if (mark > 80 && mark <= 90) System.out.println("A");
            else if (mark > 70 && mark <= 80) System.out.println("B");
            else if (mark > 60 && mark <= 70) System.out.println("C");
            else if (mark > 50 && mark <= 60) System.out.println("D");
            else System.out.println("F");
        }
    }

    private static void findMean() {
        float arr[] = {1,2,3,4,5};
        float sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum += arr[i];
        }
        System.out.println("The mean is "+sum/2);
    }
}
