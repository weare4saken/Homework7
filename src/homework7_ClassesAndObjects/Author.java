package homework7_ClassesAndObjects;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return  true;
        } else if (other == null || getClass() != other.getClass()) {
            return  false;
        } else {
            Author author = (Author) other;
            return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

