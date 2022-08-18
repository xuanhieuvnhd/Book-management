public class Book {
    private String bookTitle;
    private double price;
    private int PublishingYear;
    private Author author;

    public Book(String bookTitle, double price, int publishingYear, Author author) {
        this.bookTitle = bookTitle;
        this.price = price;
        PublishingYear = publishingYear;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublishingYear() {
        return PublishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        PublishingYear = publishingYear;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", price=" + price +
                ", PublishingYear=" + PublishingYear +
                ", author=" + author +
                '}';
    }

    public void printBookTitle(){
        System.out.println(bookTitle);
    }
    public boolean checkSamYearOfPublication(Book book){
        return book.PublishingYear == PublishingYear;
    }
    public  double thePriceAfterLowingDown(double x){
        return price*(1-x/100);
    }
}
