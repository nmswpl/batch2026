package in.co.nmsworks.training.week2.weekend;

public class LibraryBook {
    private int id;
    private String title;
    private String author;
    private String publicationYear;
    private Integer availableCount;

    public LibraryBook() {
    }

    public LibraryBook(int id, String title, String author, String publicationYear, Integer availableCount) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.availableCount = availableCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Integer getAvailableCount() {
        return availableCount;
    }

    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
    }

    public void checkout(int copies) {
        if (copies > availableCount) {
            System.out.println("Only "+availableCount+" copies left!!");
        }
        else {
            System.out.println("Sucessfully checkout");
            availableCount -= copies;
        }
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear='" + publicationYear + '\'' +
                ", availableCount=" + availableCount +
                '}';
    }
}
