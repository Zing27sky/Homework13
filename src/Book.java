import java.util.Objects;

public class Book {
    private String name;
    private int publicationYear;
    private Author author;

    public Book(Author author, String name, int publicationYear) {
        this.author = author;
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int Year) {
        this.publicationYear = Year;
    }

    public String toString() {
        return this.name + ", " + this.author + ", " + this.publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear, author);
    }
}
