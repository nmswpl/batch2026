package in.co.nmsworks.training.week1.exam;

public class Runner {

        public static void main(String[] args) {

            Books book1 = new Books(101, "Java Programming", "James Gosling", 450.0);
            Books book2 = new Books();
            Books book3 = new Books();
            Books book4 = new Books();
            Books book5 = new Books();

//            Books book2 = new Books(102, "C Programming", "Henry", 200.0);
//            Books book3 = new Books(103, "C++ Programming", "James", 500.0);
//            Books book4 = new Books(104, "Python Programming", "Gosling", 550.0);
//            Books book5 = new Books(105, "Programming languages", "Mona", 650.0);

            book2.setId(102);
            book2.setTitle("C Programming");
            book2.setAuthor("Henry");
            book2.setPrice(204.0);

            book3.setId(102);
            book3.setTitle("C ++Programming");
            book3.setAuthor("James");
            book3.setPrice(230.0);

            book4.setId(102);
            book4.setTitle("Python Programming");
            book4.setAuthor("Wilson");
            book4.setPrice(220.0);

            book5.setId(102);
            book5.setTitle("Programming Languages");
            book5.setAuthor("HMoona");
            book5.setPrice(245.0);


            System.out.println("--- Book Details ---");
            System.out.println("ID: " + book1.getId());
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            System.out.println("Price: rs. " + book1.getPrice());


            System.out.println("ID: " + book2.getId());
            System.out.println("Title: " + book2.getTitle());
            System.out.println("Author: " + book2.getAuthor());
            System.out.println("Price: rs. " + book2.getPrice());


            System.out.println("ID: " + book3.getId());
            System.out.println("Title: " + book3.getTitle());
            System.out.println("Author: " + book3.getAuthor());
            System.out.println("Price: rs. " + book3.getPrice());


            System.out.println("ID: " + book4.getId());
            System.out.println("Title: " + book4.getTitle());
            System.out.println("Author: " + book4.getAuthor());
            System.out.println("Price: rs. " + book4.getPrice());


            System.out.println("ID: " + book5.getId());
            System.out.println("Title: " + book5.getTitle());
            System.out.println("Author: " + book5.getAuthor());
            System.out.println("Price: rs. " + book5.getPrice());




        }
    }








