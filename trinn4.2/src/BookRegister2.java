import java.util.ArrayList;

public class BookRegister2 {
    // array of book objects
    ArrayList<Book2> books;

    // constructor
    public BookRegister2() {
        books = new ArrayList<>();
        initializeRegister();
    }


    // method that takes in a book object and addis it to book register ArrayList
    public void addBook(Book2 b) {
        books.add(b);
    }

    // method that takes in genre as parameter and prints book objects in ArrayList that
    // corresponds to that genre
    public void printBooksByGenre(Genre2 genre) {
        for (int i  = 0; i < books.size(); i++) {
            Book2 b = books.get(i);
            if(b.getGenre() == genre) {
                b.printState();
            }
        }
    }

    // method to print out all books in ArrayList (books)
    public void printAllBooks() {
        for (Book2 b : books) {
            b.printState();
        }
    }

    public void printBooksByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            Book2 b = books.get(i);
            if (b.getAuthor().equalsIgnoreCase(author)) {
                b.printState();
            }
        }
    }

    public void printBooksByMaxReadingTime(int max) {
        for (Book2 b: books) {
            if(b.getReadingTime() <= max) {
                b.printState();
            }
        }
    }

    public void removeBook(String isbn) {
        for (Book2 b : books) {
            if (b.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Removed " + b.getTitle() + " from our records!");
                books.remove(b);
            }
            else {
                System.out.println("There are no books in our register with a isbn number of " + isbn);
            }
            break;
        }
    }

    // method to add books pre initialization of program
    private void initializeRegister() {
        // adding chapters to chapter array
        ArrayList<Chapter2> hpChapters = new ArrayList<>();
        hpChapters.add(new Chapter2("Chapter 1", 20));
        hpChapters.add(new Chapter2("Chapter 2", 18));
        hpChapters.add(new Chapter2("Chapter 3", 19));
        hpChapters.add(new Chapter2("Chapter 4", 17));
        hpChapters.add(new Chapter2("Chapter 5", 21));

        // creating a Book object called book1
        // takes in vital information about the book as well as the Arraylist for the given book
        Book2 book1 = new Book2("12345678", "Harry Potter & The Philosophers stone", "J.K. Rowling", 400, Genre2.FANTASY, hpChapters, 3);
        addBook(book1);

        ArrayList<Chapter2> sultChapters = new ArrayList<>();
        sultChapters.add(new Chapter2("Kapittel 1", 5));
        sultChapters.add(new Chapter2("Kapittel 2", 7));
        sultChapters.add(new Chapter2("Kapittel 3", 10));

        Book2 book2 = new Book2("12938472", "Sult", "Knut Hamsun", 115, Genre2.CLASSIC, sultChapters, 2);
        addBook(book2);

        ArrayList<Chapter2> giveAFuckChapters = new ArrayList<>();
        giveAFuckChapters.add(new Chapter2("Chapter 1", 13));
        giveAFuckChapters.add(new Chapter2("Chapter 2", 13));
        giveAFuckChapters.add(new Chapter2("Chapter 3", 17));

        Book2 book3 = new Book2("20938475", "The Subtle Art of Not Giving a Fuck", "No Fux", 420, Genre2.OTHER, giveAFuckChapters, 1);
        addBook(book3);

    }

}
