import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookRegister {
    ArrayList<Book> bookList = new ArrayList<>();
    String title;
    String author;
    int numberOfPages;
    Genre genre;

    public BookRegister () {
        addNPCBooks();
        userInteraction();
    }

    public void userInteraction() {
        System.out.println("Welcome to my store motherucker");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            menu();
            System.out.print("Enter a number 1-7\n>");
            choice = sc.nextInt();
            switch (choice) {
                case 1 : addBook(); break;
                case 2: showBooksInArray(); break;
                case 3: printBooksByAuthor(); break;
                case 4: printBooksByGenre(); break;
                case 5: showBooksByReadingTime(); break;
                case 6: removeBook(); break;
                case 7: quit(); choice = 7;
                default:
                    System.out.println("Invalid input");
                    break;
                    }
            }
        }

        public void quit() {
            System.out.println("Thank you for using my bookregister! See you again soon, bye...");
        }

        public void showBooksByReadingTime() {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter max reading time (min):\n>");
            int userInput = sc.nextInt();
            for (Book book : bookList) {
                if (book.getReadingTime() < userInput) {
                    book.printState();
                }
            }
        }

        public void removeBook() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the ISBN number of the book you wish to delete:\n>");
            for (Book book:bookList) {
                if (sc.nextLine().equals(book.getIsbn())) {
                    bookList.remove(book);
                }
            }
        }

    public void showBooksInArray() {
        for (int i = 0; i < bookList.size(); i++) {
            bookList.get(i).printState();
        }
    }

    public void printBooksByAuthor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Author name:\n>");
        String userInput = sc.nextLine();
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(userInput)) {
                book.printState();
            }
        }
    }

    public void printBooksByGenre() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter desired genre:\n>");
        String userInput = sc.nextLine();
        for (Book book: bookList) {
            if (book.getGenre().toString().equals(userInput)) {
                book.printState();
            }
        }
    }

    public String generateISBN() {
        Random ISBN = new Random();
        return String.valueOf(ISBN.nextInt(10000));
    }

    public void addNPCBooks() {
        Book hp1 = new Book("Harry Potter & The Sorcerers Stone", "J.K. Rowling", 999, Genre.FANTASY);
        Book hp2 = new Book("Harry Potter & The Chamber of Secrets", "J.K. Rowling", 919, Genre.ACTION);
        Book hp3 = new Book("Harry Potter & The Prisoner From Askaban", "J.K. Rowling", 1006, Genre.FANTASY);
        Book hp4 = new Book("Harry Potter & The Goblet of Fire", "J.K. Rowling", 666, Genre.FANTASY);

        bookList.add(hp1);
        hp1.setIsbn(generateISBN());
        hp1.setMinutesPerPage(1);
        bookList.add(hp2);
        hp2.setIsbn(generateISBN());
        hp2.setMinutesPerPage(1);
        bookList.add(hp3);
        hp3.setIsbn(generateISBN());
        hp3.setMinutesPerPage(1);
        bookList.add(hp4);
        hp4.setIsbn(generateISBN());
        hp4.setMinutesPerPage(1);
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        //String title, String author, int numberOfPages, Genre genre
        System.out.print("Please add a title for your book: ");
        this.title = sc.nextLine();
        System.out.print("Please add the book's author: ");
        this.author = sc.nextLine();
        System.out.print("Please add the book's number of pages: ");
        this.numberOfPages = sc.nextInt();
        System.out.print("Please add the book's genre (ACTION, CRIME, FANTASY, CLASSIC, OTHER): ");
        sc.nextLine();
        this.genre = Genre.valueOf(sc.nextLine());
        bookList.add(new Book(this.title, this.author, this.numberOfPages, this.genre));
        bookList.get(bookList.size()-1).setIsbn(generateISBN());
    }

    public void getBooksInGenre() {
        ArrayList<Genre> templist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Genre tempGenre;
        System.out.print("Please enter desired Genre: ");
        tempGenre = Genre.valueOf((sc.nextLine()));
        for (Book value : bookList) {
            if (value.getGenre().equals(tempGenre)) {
                templist.add(value.getGenre());
            }
        }
        if (templist.size() <= 0) {
            System.out.println("Didn't find any books in that genre");
        } else {
            System.out.print("Found " + templist.size() + " books with the " + tempGenre + " genre.\nWould you like to display them? (y/n)");
            if (sc.nextLine().equals("y")) {
                for (Book book : bookList) {
                    if (book.getGenre().equals(tempGenre)) {
                        templist.add(book.getGenre());
                        book.printState();
                    }
                }
            } else {
                System.out.println("Bye.");
            }
        }
    }

    public void getBooksByAuthor() {
        ArrayList<String> templist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String tempAuthor;
        System.out.print("Please enter desired Author: ");
        tempAuthor = (sc.nextLine());
        for (Book value : bookList) {
            if (value.getAuthor().equals(tempAuthor)) {
                templist.add(value.getAuthor());
            }
        }
        if (templist.size() <= 0) {
            System.out.println("Didn't find any books by given Author");
        } else {
            System.out.print("Found " + templist.size() + " books from " + tempAuthor + "\nWould you like to display them? (y/n)");
            if (sc.nextLine().equals("y")) {
                for (Book book : bookList) {
                    if (book.getAuthor().equals(tempAuthor)) {
                        templist.add(book.getAuthor());
                        book.printState();
                    }
                }
            } else {
                System.out.println("Bye.");
            }
        }
    }

    public void menu() {
        System.out.println("#1: Add book");
        System.out.println("#2: Show all books in register");
        System.out.println("#3: Show books by author");
        System.out.println("#4: Show books by genre (CRIME, ACTION, FANTASY, CLASSIC, OTHER)");
        System.out.println("#5: Show books by reading time");
        System.out.println("#6: Remove book");
        System.out.println("#7: Quit");
    }
}
