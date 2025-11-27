import java.time.LocalDate;

public class BookManager {
    private String authorName;
    private String title;
    private String ISBN;
    private LocalDate publicationDate;

    public BookManager(String inAuthor, String inTitle, String inISBN, LocalDate inPubDate) {
        authorName = inAuthor;
        title = inTitle;
        ISBN = inISBN;
        publicationDate = inPubDate;
    }//End of constructor

    public String getAuthorName() {
        return authorName;
    }//End getAuthorName

    public String getTitle() {
        return title;
    }//End getTitle

    public String getISBN() {
        return ISBN;
    }//End getISBN

    public LocalDate getPublicationDate() {
        return publicationDate;
    }//End of getPublicationDate

    public String toString() {
        return "Author: " + authorName + " Title: " + title + " ISBN: " + ISBN +
                " Publication Date: " + publicationDate;
    }//End of toString
}//End of BookManager
