import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private int numberOfPages;
    private Genre genre;
    private int readingTime;
    private int isbn;
    private ArrayList<Chapter> chapters;
    private ArrayList<Integer> isbnArray = new ArrayList<Integer>();

    public Book (String title, String author, int numberOfPages, Genre genre) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        readingTime = readTime();
        final int i = generateISBN();
    }

    public int readTime() {
        if (getNumberOfPages() < 100) {
            return 50;
        } else if (getNumberOfPages() > 100 && getNumberOfPages() <= 200) {
            return 100;
        } else if (getNumberOfPages() > 200 && getNumberOfPages() <= 300) {
            return 150;
        } else {
            return 300;
        }
    }

    public int generateISBN () {
        int isbn = (int) Math.floor(Math.random()*9999);
        for (int i  = 0; i < isbnArray.size(); i++) {
            if (isbn != isbnArray.get(i)) {
                isbnArray.add(isbn);
            }
        }
        return isbn;
    }

    void printState () {
        System.out.println(title + "\nWas written by: " + author + "\n" + title + " consists of " + numberOfPages + " pages.\nThe Genre of this book is: " + genre);
    }

    // getters and setters

    public int getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(int readingTime) {
        this.readingTime = readingTime;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

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
}
