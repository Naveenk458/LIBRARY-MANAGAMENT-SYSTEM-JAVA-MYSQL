public class Clerk extends Borrower {

    Clerk(int id, String name, String email, String phone) {
        super(id, name, email, phone);
    }

    public void issueBook() {
        System.out.println("Clerk Issued Book");
    }

    public void returnBook() {
        System.out.println("Clerk Returned Book");
    }
}