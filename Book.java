public class Book {
    int id;
    String title;
    String author;
    String subject;
    boolean issued;

    public Book(int id, String title, String author, String subject) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.issued = false;
    }
}