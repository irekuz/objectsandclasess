import java.security.PublicKey;
import java.security.cert.PKIXCertPathBuilderResult;

public class Book {
        private final String nameBook;
        private final Author author;
        private int yearPublishing;
    public Book(String nameBook,Author author, int yearPublishing) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublishing = yearPublishing;

    }
    public String getNameBook(){
        return this.nameBook;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYearPublishing(){
        return this.yearPublishing;
    }
    public void setYearPublishing(int new_year){
        this.yearPublishing = new_year;
    }
}
