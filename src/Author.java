import java.util.Objects;

public class Author {
    private String writerName;
    private DateBirth dateBirth;

    public Author(String writerName, DateBirth dateBirth) {
        this.writerName = writerName;
        this.dateBirth = dateBirth;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public DateBirth getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(DateBirth dateBirth) {
        this.dateBirth = dateBirth;
    }

    @Override
    public String toString() {
        return "Author{" +
                "writerName='" + writerName + '\'' +
                ", dateBirth=" + dateBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(getWriterName(), author.getWriterName()) && Objects.equals(getDateBirth(), author.getDateBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWriterName(), getDateBirth());
    }
}
