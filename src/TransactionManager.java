import java.time.LocalDate;

public class TransactionManager {
    private String transactionID;
    private String memberID;
    private String bookID;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private LocalDate returnDate;

    public TransactionManager(String inTransID, String inMemberID, String inBookID,
                              LocalDate inIssueDate, LocalDate inDueDate, LocalDate inReturnDate) {
        this.transactionID = inTransID;
        this.memberID = inMemberID;
        this.bookID = inBookID;
        this.issueDate = inIssueDate;
        this.dueDate = inDueDate;
        this.returnDate = inReturnDate;
    }//End of constructor

    public String getTransactionID() {
        return transactionID;
    }//End of getTransID

    public String getMemberID() {
        return memberID;
    }//ENd getMember

    public String getBookID() {
        return bookID;
    }//End of getBookID

    public LocalDate getIssueDate() {
        return issueDate;
    }//End getIssueDate

    public LocalDate getDueDate() {
        return dueDate;
    }//End getDueDate

    public LocalDate getReturnDate() {
        return returnDate;
    }//Ed getReturnDate

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }//End setTransID

    public String toString(){
        return "Trans ID: " + transactionID + " Member ID: " + memberID + " Book ID: " + bookID +
               " Issue Date: " + issueDate + " Return Date: " + returnDate;
    }//End of toString
}//End of TransactionManager
