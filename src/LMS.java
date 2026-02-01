import java.util.Scanner;

public class LMS {
    static Book[] books = new Book[5];
    static int bookCount = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            System.out.println("Library Menu:");
            System.out.println("0. Exit");
            System.out.println("1. Add a Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Check Out a Book");
            System.out.println("4. Return a Book");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
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

        System.out.println("Thank you for visiting!");
        scanner.close();
    }

    static void addBook() {
        if (bookCount >= 5) {
            System.out.println("Book not added. Library is full!");
            return;
        }

        System.out.println("Enter book title:");
        String title = scanner.nextLine();

        System.out.println("Enter book author:");
        String author = scanner.nextLine();

        books[bookCount] = new Book(bookCount + 1, title, author);
        bookCount++;

        System.out.println("Book added to library!");
    }

    static void checkOutBook() {
        System.out.println("Enter book number to check out:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num < 1 || num > bookCount) {
            System.out.println("Invalid book number!");
            return;
        }

        books[num - 1].checkOut();
    }

    static void returnBook() {
        System.out.println("Enter book number to return:");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num < 1 || num > bookCount) {
            System.out.println("Invalid book number!");
            return;
        }

        books[num - 1].returnBook();
    }

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