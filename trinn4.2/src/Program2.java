import java.util.ArrayList;
import java.util.Scanner;

public class Program2 {
    BookRegister2 register;


    // constructor with 0 params
    public Program2() {
        register = new BookRegister2();
        handleUserInteraction();
    }

    // method to handle user interaction with program
    private void handleUserInteraction() {
        System.out.println("Welcome to Moldevort's book register! Here's a list of options for you: ");
        Scanner userInput = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            printMenu();
            System.out.print("Type you number here: ");
            choice = userInput.nextInt();
            userInput.nextLine();
            switch (choice){
                case 1 : {
                    addBook(userInput);
                    break;
                }
                case 2: {
                    getAllBooks();
                    break;
                }
                case 3: {
                    getBooksByGenre(userInput);
                    break;
                }
                case 4: {
                    getBooksByMaxReadingTime(userInput);
                    break;
                }
                case 5: {
                    printBooksByAuthor(userInput);
                    break;
                }
                case 6: {
                    removeBook(userInput);
                    break;
                }
                case 7: {
                    quit();
                    break;
                }
                default: {
                    System.out.println("Your options are 1-6");
                }
            }
        }
    }

    private void printBooksByAuthor(Scanner userInput) {
        System.out.println("Enter author's name: ");
        String author = userInput.nextLine();
        register.printBooksByAuthor(author);
    }

    private void addBook(Scanner userInput) {
        System.out.println("Enter ISBN: ");
        String isbn = userInput.nextLine();
        System.out.println("Enter Title: ");
        String title = userInput.nextLine();
        System.out.println("Enter Author's name: ");
        String author = userInput.nextLine();
        System.out.println("Enter number of pages: ");
        int pages = userInput.nextInt();
        userInput.nextLine();
        System.out.println("Enter a genre (CRIME, ACTION, FANTASY, CLASSIC, OTHER): ");
        String genreText = userInput.nextLine().toUpperCase();
        Genre2 genre = Genre2.valueOf(genreText);
        System.out.println("Enter reading time per page: ");
        int readingTime = userInput.nextInt();
        userInput.nextLine();
        ArrayList<Chapter2> chapters = new ArrayList<>();
        boolean moreChapters = true;
        while (moreChapters) {
            System.out.println("Enter the chapter's title: ");
            String chapterTitle = userInput.nextLine();
            System.out.println("Enter the number of pages in this chapter: ");
            int chapterPages = userInput.nextInt();
            userInput.nextLine();
            chapters.add(new Chapter2(chapterTitle, chapterPages)); // creating new Chapter2 object with params
            System.out.println("Are there more chapters in this book? (y/n)");
            moreChapters = userInput.nextLine().equalsIgnoreCase("y");
        }

        register.addBook(new Book2(isbn, title, author, pages, genre, chapters, readingTime));

    }

    private void getAllBooks() {
        register.printAllBooks();
    }

    private void getBooksByGenre(Scanner userInput) {
        System.out.println("Enter genre (CRIME, ACTION, FANTASY, CLASSIC, OTHER): ");
        String genre = userInput.nextLine().toUpperCase();
        register.printBooksByGenre(Genre2.valueOf(genre));
    }

    private void getBooksByMaxReadingTime(Scanner userInput) {
        System.out.println("Enter max reading time (in minutes): ");
        int max = userInput.nextInt();
        register.printBooksByMaxReadingTime(max);
    }

    private void removeBook(Scanner userInput) {
        System.out.println("Enter the ISBN for the book you wish to remove: ");
        String isbn = userInput.nextLine();
        register.removeBook(isbn);
    }

    private void quit() {
        System.out.println("Thank you for visiting our book register, we hope to see you again soon. Farewell!");
    }

    private void printMenu() {
        System.out.println("1: Add book");
        System.out.println("2: Display books");
        System.out.println("3: Display books by genre");
        System.out.println("4: Display books by reading time");
        System.out.println("5: Display books by author");
        System.out.println("6: Remove a book");
        System.out.println("7: Quit");
    }
}
