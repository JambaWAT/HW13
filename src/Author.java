import java.util.Objects;

public class Author {
   private String firstName;
   private String Surname;

    public Author(String firstName, String surname) {
        this.firstName = firstName;
        this.Surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return Surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) && Objects.equals(Surname, author.Surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, Surname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", Surname='" + Surname + '\'' +
                '}';
    }
}
