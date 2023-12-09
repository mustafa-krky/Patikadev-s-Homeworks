import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Kitap adına göre sıralandı:");
        System.out.println();
        TreeSet<Book> booksSortedByName = new TreeSet<>(new Book());

        booksSortedByName.add(new Book("Gün Olur Asra Bedel",400,"Cengiz Aytmatov",""));
        booksSortedByName.add(new Book("Fareler ve İnsanlar",120,"John Steinbeck",""));
        booksSortedByName.add(new Book("Sherlock",80,"C. Doyle ",""));
        booksSortedByName.add(new Book("Uğultulu Tepeler",100,"Emily Bronte",""));
        booksSortedByName.add(new Book("İnci",70,"John",""));

        for(Book bookName: booksSortedByName){
            System.out.println(bookName.getBookName());
        }

        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("Sayfa sayısına göre sıralandı:");
        System.out.println();

        TreeSet<Book> booksSortedByPageNumber = new TreeSet<>(new Book());

        booksSortedByPageNumber.add(new Book("Gün Olur Asra Bedel",400,"Cengiz Aytmatov",""));
        booksSortedByPageNumber.add(new Book("Fareler ve İnsanlar",120,"John Steinbeck",""));
        booksSortedByPageNumber.add(new Book("Sherlock",80,"C. Doyle ",""));
        booksSortedByPageNumber.add(new Book("Uğultulu Tepeler",100,"Emily Bronte",""));
        booksSortedByPageNumber.add(new Book("İnci",70,"John",""));

        for(Book book: booksSortedByPageNumber){
            System.out.println(book.getBookName());
        }
    }
}
