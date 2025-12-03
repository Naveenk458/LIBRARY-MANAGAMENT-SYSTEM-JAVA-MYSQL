public class HoldRequest {
    int holdId;
    int borrowerId;
    int bookId;

    HoldRequest(int holdId, int borrowerId, int bookId) {
        this.holdId = holdId;
        this.borrowerId = borrowerId;
        this.bookId = bookId;
    }
}