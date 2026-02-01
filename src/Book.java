public class Book {
    int bookNumber;
    String title;
    String author;
    boolean checkedOut;



public Book(int bookNumber, String title, String author) {
    this.bookNumber = bookNumber;
    this.title = title;
    this.author = author;
    this.checkedOut = false;
}
public void displayBook() {
    System.out.println(bookNumber + " " + title + " " + author + " " + (checkedOut ? "1" : "0"));
}

public void checkOut() {
    if (!checkedOut) {
        checkedOut = true;
        System.out.println("Book checked out successfully!");
    } else {
        System.out.println("Book already checked out!");
    }
}

    public void returnBook() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book was not checked out!");
        }
    }

}
