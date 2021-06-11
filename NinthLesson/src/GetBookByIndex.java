
import java.util.ArrayList;

public class GetBookByIndex {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();


        books.add(new Book(120, "Boys Book", "soft", 250));
        books.add(new Book(150, "Girls Book", "hard", 300));
        books.add(new Book(99, "Interesting Stories Book", "soft", 130));
        books.add(new Book(122, "Book with games", "hard", 235));
        books.add(new Book(20, "Parents Book", "soft", 99));

        for (int i = 0; i <= books.size(); i++) {
            try {
                Book book = books.get(i);
                System.out.println("Do you want to buy '" + book.getTitle() + "' with " +
                        book.getCoverType() + " cover?");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("The book with index " + i + " is not present in the 'books' arrayList. \n");
            }
        }

    }
}
