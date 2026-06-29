package in.co.nmsworks.training.week2.day5;

public class RunnerLibrary {
    public static void main(String[] args) {

        String[] title = {"Story Book", "Physics", "Chemistry", "Maths"};
        String[] author = {"Mona", "Nehru", "Ram", "Alice"};
        int[] noOfCopies = {1, 3 , 4 , 5};
        int [] pubYear = {2003, 1974, 1999, 2000};
        LibraryBook[] book = new LibraryBook[title.length];
        for (int i = 0; i < title.length; i ++){
            book[i] = new LibraryBook(title[i], author[i],  pubYear[i],noOfCopies[i] );
        }
        for(LibraryBook books : book){
            System.out.println(books);
            books.checkout();
        }
        for(LibraryBook books : book) {

            books.checkout();
        }
    }
}
