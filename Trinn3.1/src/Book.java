import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private Genre genre;
    private String isbn;
    private int minutesPerPage;
    private ArrayList<Chapter> chapters = new ArrayList<>();

    public Book (String title, String author, int numberOfPages, Genre genre) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    public int getReadingTime() {
        return getNumberOfPages()*getMinutesPerPage();
    }

    // mod this
    void printState () {
        System.out.println("ISBN:" + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nPages in book: " + numberOfPages + "\nGenre: " + genre + "\navg reading time per page: " + minutesPerPage);
        System.out.println("Chapters: ");
        for (Chapter c :
                chapters) {
            c.printChapterInformation();
        }
        System.out.println("Reading time for this book is " + getReadingTime() + " minutes.");
        System.out.println("-----------------------------------");
    }

    // getters and setters
     public Genre getGenre() {
        return genre;
    }

     public void setGenre(Genre genre) {
        this.genre = genre;
    }

     public void setAuthor (String author) {
        this.author = author;
    }

     public String getAuthor () {
        return author;
    }

     public void setTitle (String title) {
        this.title = title;
    }

     public String getTitle () {
        return title;
    }

     public void setNumberOfPages (int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

     public int getNumberOfPages () {
        return numberOfPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getMinutesPerPage() {
        return minutesPerPage;
    }

    public void setMinutesPerPage(int minutesPerPage) {
        this.minutesPerPage = minutesPerPage;
    }
}
