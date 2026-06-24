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

        int sum = 0  ;
        System.out.print("\nArray : ");
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
            System.out.print(arr[i]);
        }

        int mean = sum/arr.length ;
        System.out.println("\nThe mean of array : " + mean);
    }




}

class Book{
    private int id;
    private String title;
    private String author;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book(int id, String title, String author, float price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void bookDetails(){
        System.out.println("\nBook Details : ");
        System.out.println("Book ID : "+ id);
        System.out.println("Title : "+ title);
        System.out.println("Author : "+ author);
        System.out.println("Price : "+ price);
    }
}
