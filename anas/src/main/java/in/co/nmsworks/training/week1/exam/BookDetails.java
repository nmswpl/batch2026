package in.co.nmsworks.training.week1.exam;


public class BookDetails {
    public static void main(String[] args) {


        BookOwners bk1 = new BookOwners();

        bk1.setID(1);
        bk1.setTitle("Computer Science");
        bk1.setAuthor("Charles");
        bk1.setPrice(450);

        bk1.setID(2);
        bk1.setTitle("Java");
        bk1.setAuthor("james");
        bk1.setPrice(300);

        bk1.setID(3);
        bk1.setTitle("python");
        bk1.setAuthor("Carolas");
        bk1.setPrice(350);



        System.out.println(bk1.getID());
        System.out.println(bk1.getAuthor());
        System.out.println(bk1.getTitle());
        System.out.println(bk1.getPrice());
    }
}


