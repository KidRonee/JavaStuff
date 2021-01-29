import java.util.ArrayList;

public class Book2 {
    // fields for book
    String isbn;
    String title;
    String author;
    int numberOfPages;
    Genre2 genre;
    ArrayList<Chapter2> chapters;
    int minutesPerPage;

    // constructor
    public Book2(String isbn, String title, String author, int numberOfPages, Genre2 genre, ArrayList<Chapter2> chapters, int minutesPerPage) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.chapters = chapters;
        this.minutesPerPage = minutesPerPage;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Genre2 getGenre() {
        return genre;
    }

    public void setGenre2(Genre2 genre) {
        this.genre = genre;
    }

    public ArrayList<Chapter2> getChapters2() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter2> chapters2) {
        this.chapters = chapters;
    }

    public int getMinutesPerPage() {
        return minutesPerPage;
    }

    public void setMinutesPerPage(int minutesPerPage) {
        this.minutesPerPage = minutesPerPage;
    }

    public void printState() {
        System.out.println("ISBN:" + isbn + "\nTitle: " + title + "\nAuthor: " + author + "\nPages in book: " + numberOfPages + "\nGenre: " + genre + "\navg reading time per page: " + minutesPerPage);
        System.out.println("Chapters: ");
        for (Chapter2 c:
             chapters) {
            c.printChapterInformation();
        }
        System.out.println("-----------------------------------");
    }

    public int getReadingTime() {
        return getNumberOfPages()*getMinutesPerPage();
    }
}
