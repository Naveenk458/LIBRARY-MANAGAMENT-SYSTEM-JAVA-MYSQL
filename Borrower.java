public class Borrower extends Person {

    Borrower(int id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    public void viewBorrowedBooks() {
        System.out.println(name + " is viewing borrowed books...");
    }

    public void searchBooks() {
        System.out.println(name + " is searching for books...");
    }
}