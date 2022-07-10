public class Main {

    public static void main(String[] args) {
        Author leo_tolstoy = new Author("Leo", "Tolstoy");
        Book war_and_peace = new Book("WarAndPeace", leo_tolstoy, 1869);

        System.out.println("war_and_peace.getNameBook() = " + war_and_peace.getNameBook() +  war_and_peace.getAuthor().getName() +  war_and_peace.getAuthor().getSurname() +  war_and_peace.getYearPublishing());

        war_and_peace.setYearPublishing(2022);

        System.out.println("war_and_peace.getNameBook() = " + war_and_peace.getNameBook() +  war_and_peace.getAuthor().getName() +  war_and_peace.getAuthor().getSurname() +  war_and_peace.getYearPublishing());


        Author author1 = new Author("John", "Kovalski");
        Book book1 = new Book("book1", author1, 2023);
        System.out.println(book1.getNameBook() + book1.getAuthor().getName() + book1.getAuthor().getSurname() + book1.getYearPublishing());
        book1.setYearPublishing(2024);
        System.out.println(book1.getNameBook() + book1.getAuthor().getName() + book1.getAuthor().getSurname() + book1.getYearPublishing());
    }
}