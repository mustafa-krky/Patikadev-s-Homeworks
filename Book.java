import java.util.Comparator;

public class Book implements Comparator<Book> {
    private String bookName;
    private int bookPageNumber;
    private String bookAuthor;
    private String releaseDate;
    private static int counter = 0;

    public Book(){
        counter++;
    }

    public Book(String bookName, int bookPageNumber, String bookAuthor,String releaseDate){
        this.bookName = bookName;
        this.bookPageNumber = bookPageNumber;
        this.bookAuthor = bookAuthor;
        this.releaseDate = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPageNumber() {
        return bookPageNumber;
    }

    public void setBookPageNumber(int bookPageNumber) {
        this.bookPageNumber = bookPageNumber;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public int compare(Book o1, Book o2) {

        if(counter == 1){
            return o1.getBookName().compareTo(o2.getBookName());
        }

        return o2.getBookPageNumber() - o1.getBookPageNumber();
    }

}
