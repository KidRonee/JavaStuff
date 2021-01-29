import java.util.ArrayList;

public class BookRegister {
    private ArrayList<Book> bookArray = new ArrayList<Book>(20);

    // Constructor

    public BookRegister () {

    }

    public void addBook() {
        System.out.println("Welcome to out bookstore!\nPress 1 to add book(s)\nPress 2 to get an overview of our books\nPress 3 to look for books written by a specific author\nPress 4 to get an overview of all books in a specific genre\nPress 5 to get an overview over books with a maximum reading time\nPress 6 to remove a book");

    }

}
