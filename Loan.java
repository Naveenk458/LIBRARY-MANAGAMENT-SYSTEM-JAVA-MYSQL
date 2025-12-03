public class Loan {
    int loanId;
    int bookId;
    int borrowerId;
    String dueDate;

    Loan(int loanId, int bookId, int borrowerId, String dueDate) {
        this.loanId = loanId;
        this.bookId = bookId;
        this.borrowerId = borrowerId;
        this.dueDate = dueDate;
    }
}