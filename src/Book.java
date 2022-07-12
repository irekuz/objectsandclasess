public class Book {
    private final String nameBook;
    private final Author author;
    private int yearPublishing;


    public Book(String nameBook, Author author, int yearPublishing) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublishing = yearPublishing;

    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublishing() {
        return this.yearPublishing;
    }

    public void setYearPublishing(int new_year) {
        this.yearPublishing = new_year;
    }

    @Override
    public String toString() {
        return "" + nameBook + ""
                + ", " + author
                + ", " + yearPublishing;
    }

    @Override
    public boolean equals(Object other) {
        Book guest = (Book) other;
        if (other == this)
            return true;
        else if (this.nameBook == guest.getNameBook() && this.yearPublishing == guest.yearPublishing && this.author.equals(guest.getAuthor()))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.nameBook.hashCode() + this.author.hashCode() + this.yearPublishing;
    }
}
