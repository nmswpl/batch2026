package in.co.nmsworks.training.week3.day1;

class LibraryBook {

    String title;
    String author;
    int year;
    int copies;
    int id;


    LibraryBook(int id, String title, String author, int year, int copies) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.copies = copies;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void display() {

        System.out.println("ID = " + id);
        System.out.println("Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Year = " + year);
        System.out.println("Copies = " + copies);
    }


    void checkout() {

        if(copies > 0) {

            copies--;
            System.out.println("Book available. Checkout successful.");
            System.out.println("Remaining copies = " + copies);

        } else {

            System.out.println("Book unavailable");
        }
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", copies=" + copies +
                ", id=" + id +
                '}';
    }
}