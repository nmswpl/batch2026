package in.co.nmsworks.training.week2.day6;

public class LibraryBook {
        public String title;
        public String author;
        public int publication_year;
        public int numberOfCopies;

    public LibraryBook(String title, String author, int publication_year, int numberOfCopies) {
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
        this.numberOfCopies = numberOfCopies;
    }

    public void checkOut(){
        if(this.numberOfCopies>0){
            numberOfCopies--;
            System.out.println(this.title+" is available");
        }
        else{
            System.out.println(this.title+" is not available");
        }
}

}
