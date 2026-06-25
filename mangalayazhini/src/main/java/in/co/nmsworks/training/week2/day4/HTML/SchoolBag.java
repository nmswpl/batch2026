package in.co.nmsworks.training.week2.day4.HTML;

public class SchoolBag extends Container {

    private String brandName ;
    private TextBook book;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public TextBook getBook() {
        return book;
    }

    public void setBook(TextBook book) {
        this.book = book;
    }

    public void open(){

        System.out.println("Opening the school bag");
    }

    public void study(){
        System.out.println("I am studying : " + book.getSubject());
        book.read();
    }



}
