public class Main {
    public static void main(String[] args) {
        DateBirth dateBirth = new DateBirth(19,1,1987);
        DateBirth dateBirth1 = new DateBirth(19,1,1988);
        DateBirth dateBirth2 = new DateBirth(19,1,1989);

        Author author = new Author("Hieu Hoang",dateBirth);
        Author author1 = new Author("Giang Coi",dateBirth1);
        Author author2 = new Author("Duong Vat",dateBirth2);

        Book book = new Book("Lap trinh Java",10000,1987,author);
        Book book1 = new Book("Lap trinh Python",15000,1988,author1);
        Book book2 = new Book("Lap trinh JS",20000,1987,author2);

        book.printBookTitle();
        book1.printBookTitle();
        book2.printBookTitle();

        System.out.println("so sanh NXB sach  & 2: "+book.checkSamYearOfPublication(book2));
        System.out.println("so sanh NXB sach 1 & 2: "+book1.checkSamYearOfPublication(book2));
        System.out.println("sach  giam 10%: "+book.thePriceAfterLowingDown(10));
        System.out.println("sach 1 giam 20%: "+book1.thePriceAfterLowingDown(20));
        System.out.println("sach 2 giam 50%: "+book2.thePriceAfterLowingDown(50));
    }
}
