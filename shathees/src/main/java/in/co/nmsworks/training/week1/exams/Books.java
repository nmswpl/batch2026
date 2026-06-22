package in.co.nmsworks.training.week1.exams;

public class Books {

        private int id;
        private String title,author;
        private double price;
        public int getId(){
            return  id;
        }
        public void setId(int newId){
            id=newId;
        }
        public String getTitle(){
            return  title;
        }
        public void setTitle(String newTitle){
            title=newTitle;
        }
        public String getAuthor(){
            return  author;
        }

    public Books() {
    }
    public void display(){
        System.out.println("ID = " + this.getId());
        System.out.println("Title = " + this.getTitle());
        System.out.println("Author = " + this.getAuthor());
        System.out.println("Price = " + this.getPrice());
    }
    public Books(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setAuthor(String newAuthor){
            author=newAuthor;
        }
        public double getPrice(){
            return  price;
        }
        public void setPrice(double newPrice){
            price=newPrice;
        }


    }

