package f_Library_Management_System;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "1984", "George Orwell"));
        library.addBook(new Book(4, "Pride and Prejudice", "Jane Austen"));

        // Linear search by title
        String searchTitle = "1984";
        Book foundBook = library.linearSearchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Linear search - Book found: " + foundBook);
        } else {
            System.out.println("Linear search - Book not found with title: " + searchTitle);
        }

        // Binary search by title (assuming the list is sorted)
        searchTitle = "Pride and Prejudice";
        foundBook = library.binarySearchByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Binary search - Book found: " + foundBook);
        } else {
            System.out.println("Binary search - Book not found with title: " + searchTitle);
        }
    }
}
