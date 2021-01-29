import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class BookRegister {
    ArrayList<Book> bookList = new ArrayList<>();
    String title;
    String author;
    int numberOfPages;
    Genre genre;
    String bookName;

    public void showBooksInArray() {
        for (int i = 0; i < bookList.size(); i++) {
            bookList.get(i).printState();
        }
    }

    public void addNPCBooks() {
        Book hp1 = new Book("Harry Potter & The Sorcerers Stone", "J.K. Rowling", 999, Genre.FANTASY);
        Book hp2 = new Book("Harry Potter & The Chamber of Secrets", "J.K. Rowling", 919, Genre.ACTION);
        Book hp3 = new Book("Harry Potter & The Prisoner From Askaban", "J.K. Rowling", 1006, Genre.FANTASY);
        Book hp4 = new Book("Harry Potter & The Goblet of Fire", "J.K. Rowling", 666, Genre.FANTASY);

        bookList.add(hp1);
        bookList.add(hp2);
        bookList.add(hp3);
        bookList.add(hp4);
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

        System.out.print("Please enter a name for your book register: ");
        bookName = sc.nextLine();

        Book bookName = new Book(this.title, this.author, this.numberOfPages, this.genre);
        bookList.add(bookName);
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
}
