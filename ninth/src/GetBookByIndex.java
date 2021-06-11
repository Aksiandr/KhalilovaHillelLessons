
import java.util.ArrayList;

public class GetBookByIndex {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();


        books.add(new Book(120, "Book 1", "soft", 250));
        books.add(new Book(150, "Book 2", "hard", 300));
        books.add(new Book(99, "Book 3", "soft", 130));
        books.add(new Book(122, "Book 4", "hard", 235));
        books.add(new Book(20, "Book 5", "soft", 99));

        for (int i = 0; i <= books.size(); i++) {
            try {
                Book book = books.get(i);
                System.out.println("Do you want to buy this book: " + book.getTitle());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("The book with index " + i + " is not present in the 'books' arrayList. \n");
            }
        }

    }
}
