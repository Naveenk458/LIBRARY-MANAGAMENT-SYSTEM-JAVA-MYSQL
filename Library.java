import java.util.ArrayList;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added: " + b.title);
    }

    public void showBooks() {
        for (Book b : books) {
            System.out.println(b.id + " - " + b.title + " by " + b.author);
        }
    }
}