import java.util.ArrayList;

public class BookTester {

    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<Book>();

        bookCollection.add(new Book(213, "Book 1", "soft", 300));
        bookCollection.add(new Book(50, "Book 2", "soft", 300));
        bookCollection.add(new Book(136, "Book 3", "hard", 300));
        bookCollection.add(new Book(100, "Book 5", "soft", 300));
        bookCollection.add(new Book(99, "Book 6", "hard", 300));
        bookCollection.add(new Book(23, "Book 7", "soft", 300));
        bookCollection.add(new Book(619, "Book 8", "soft", 300));
        bookCollection.add(new Book(528, "Book 9", "hard", 300));
        bookCollection.add(new Book(371, "Book 10", "soft", 300));

        ArrayList<Book> booksWithSoftCover = new ArrayList<Book>();
        ArrayList<Book> booksWithHardCover = new ArrayList<Book>();

        for (Book book : bookCollection) {
            if (book.getCoverType().equals("soft")) {
                booksWithSoftCover.add(book);
            } else {
                booksWithHardCover.add(book);
            }
        }

        System.out.println("In the store we have such books with hard cover:");
        booksWithHardCover.forEach(book -> System.out.println(book.getTitle()));

        System.out.println("In the store we have such books with soft cover:");
        booksWithSoftCover.forEach(book -> System.out.println(book.getTitle()));
    }
}
