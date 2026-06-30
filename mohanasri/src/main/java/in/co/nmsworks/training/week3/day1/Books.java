package in.co.nmsworks.training.week3.day1;

public class Books {
        private int bookID;
        private String title;
        private String author;
        private double  price;
        public Books(){


        }
        public Books(int id, String title, String author, double price) {
            this.bookID = id;
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public int getId() {

            return bookID;
        }
        public void setId(int id) {

            this.bookID = id;
        }

        public String getTitle() {

            return title;
        }
        public void setTitle(String title) {

            this.title = title;
        }
        public String getAuthor() {

            return author;
        }
        public void setAuthor(String author) {

            this.author = author;
        }
        public double getPrice() {

            return price;
        }
        public void setPrice(double price) {

            this.price = price;
        }

        @Override
        public String toString() {
            return "\nBooks{" +
                    "bookID=" + bookID +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }





