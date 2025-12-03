public class Librarian extends Clerk {

    Librarian(int id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    public void addBook() {
        System.out.println("Book Added by Librarian");
    }

    public void deleteBook() {
        System.out.println("Book Deleted by Librarian");
    }
}