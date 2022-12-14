package homework7_ClassesAndObjects;

import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int yearOfPublication;

    public Book(String title, Author author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Книга: " + "\"" + title + "\"" +
                ", автор: " + author.toString() +
                ", год публикации: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        } else {
            Book book = (Book) other;
            return yearOfPublication == book.yearOfPublication && Objects.equals(title, book.title);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfPublication);
    }
}
