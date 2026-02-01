import java.util.Scanner;

public class LMS {
    static Book[] books = new Book[5];
    static int bookCount = 0;
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while(!exit) {
            System.out.println("Library Menu:");
            System.out.println("0. Exit");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Check Out a Book");
            System.out.println("4. Return a Book");
            System.out.print("Enter your choice: ");
            System.out.println("Thank you for visiting!:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("See you soon :0");  
                    exit = true;
                    break;

                case 1:
                    addBook();
                    break;

                case 2:
                    displayAllBooks();
                    break;

                case 3:
                    checkOutBook();
                    break;

                case 4:
                    returnBook();
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");


        }
    }

    scanner.close();
}

// Book Class
static void addBook() {

    // Check if the library is full
    if (bookCount >= 5) {
        System.out.println("Book not added. Library is full!");
        return;
    }

    // Input book details
    System.out.print("Enter book title: ");
    String title = scanner.nextLine();

    System.out.print("Enter book author: ");
    String author = scanner.nextLine();

    // Create and add the new Book object
    books[bookCount] = new Book(bookCount + 1, title, author);
    bookCount++;

    System.out.println("Book added to library!");
}

// Checkout book
static void checkOutBook() {
    System.out.print("Enter book number to check out: ");
    int num = scanner.nextInt();
    scanner.nextLine();

    if (num < 1 || num > bookCount) {
        System.out.println("Invalid book number!");
        return;
    }

    books[num - 1].checkOut();
}

// Return Book
static void returnBook() {
    System.out.print("Enter book number to return: ");
    int num = scanner.nextInt();
    scanner.nextLine();

    if (num < 1 || num > bookCount) {
        System.out.println("Invalid book number!");
        return;
    }

    books[num - 1].returnBook();
}

// Display all Books
static void displayAllBooks() {
    if (bookCount == 0) {
        System.out.println("No books in library!");
        return;
    }

    System.out.println("Books in Library:");
    for (int i = 0; i < bookCount; i++) {
        books[i].displayBook();
    }
}


}
