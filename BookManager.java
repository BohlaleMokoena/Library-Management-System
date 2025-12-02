import javax.swing.*;
import java.awt.print.Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {
    private String authorName;
    private String title;
    private String ISBN;
    private LocalDate publicationDate;
    private static final String BOOKS_FILE = "Books.txt";
    private List<Book> books = new ArrayList<>();

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

    /*
    loadBooksFromFile, saveBooksToFile, appendBookToFile, and
    getBooks for File Handling
     */
    //Read from Books.txt
    public void loadBooksFromFile(){
        try(Scanner input = new Scanner(new File(BOOKS_FILE))){
            String line;

            while (input.hasNextLine()){
                Book book = new Book();
                if (books.isEmpty()){
                    books.add(book);
                }//End of if
            }//End of while

        }catch (FileNotFoundException ex){ //End of try
            JOptionPane.showMessageDialog(null, ex);
        }//End of catch
    }//End of loadBooksFromFile

    //Writes to Books.txt
    public void saveBooksToFile(){
        try(PrintWriter output = new PrintWriter(new File(BOOKS_FILE))){
            for (Book book : books){
                output.println(book.toString());
            }//End of for-each loop
        }catch (IOException e){ //End of try
            JOptionPane.showMessageDialog(null, e);
        }//End of catch
    }//End of saveBooksToFile

    //Converts file line into Book object
    private Book parseBook(String line){
        String[] bookLine = line.split(";");
        if (bookLine.length <4){
            System.out.println("Invalid Book Line");
            return null;
        }//End of if

        String author = bookLine[0];
        String title = bookLine[1];
        String ISBN = bookLine[2];
        LocalDate publicationDate = LocalDate.parse(bookLine[3]);
        return new Book();
    }//End of parseBook

    public List<Book> getBooks() {
        return books;
    }//End of Book List

    /*
    addBook, searchByTitle, searchByAuthor, searchByISBN
    and deleteBook for CRUD Operations
     */
    //Adds a book
    public boolean addBook(Book book){
        //Check duplicate Book Objects
        for (Book book1 : books){
            if (book1.equals(book)){
                System.out.println("Book already exists");
                return false;
            }//End of if
        }//End of book1 for-each loop

        books.add(book);
        System.out.println("Book added successfully");
        return true;
    }//End of addBook

    //Search by title
    public List<Book> searchByTitle(String title){
        List<Book> result = new ArrayList<>();
        for (Book book : books){
            if (book.equals(title)){
                result.add(book);
            }//End of if
        }//End of book for-each loop
        return result;
    }//End of searchByTitle

    //Search by author
    public List<Book> searchByAuthor(String author){
        List<Book> result = new ArrayList<>();
        for (Book book : books){
            if (book.equals(author)){
                result.add(book);
            }//End of if
        }//End of book for-each loop
        return result;
    }//End of searchByAuthor

    //Search by ISBN
    public List<Book> searchByISBN(String title){
        List<Book> result = new ArrayList<>();
        for (Book book : books){
            if (book.equals(ISBN)){
                result.add(book);
            }//End of if
        }//End of book for-each loop
        return result;
    }//End of searchByTitle

    public boolean removeBook(Book book){
        for (int i = 0; i < books.size(); i++){
            Book book1 = books.get(i);
            if (book1.equals(book)){
                books.remove(book1);
                System.out.println("Book removed successfully");
                return true;
            }//End of if
        }//End of book1 for-each loop
        return false;
    }//End of removeBook
}//End of BookManager
