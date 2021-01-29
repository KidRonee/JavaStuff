import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    private int numberOfPages;
    private Genre genre;
    private int isbn;
    private ArrayList<Integer> isbnArray = new ArrayList<Integer>();
    private ArrayList<Chapter> chapters = new ArrayList<>();



    public Book (String title, String author, int numberOfPages, Genre genre) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
    }

    /*
    public void addChapter () {
        Scanner sc = new Scanner(System.in);
        String tempChapterTitle;
        int tempPages;
        int readingTime;
        String chapterAlias;
        System.out.print("Please add a title for the chapter: ");
        tempChapterTitle = sc.nextLine();
        System.out.print("Please add the number of pages in this chapter: ");
        tempPages = sc.nextInt();
        System.out.print("Please enter the reading time per page: ");
        readingTime = sc.nextInt();
        System.out.println("Enter chapter alias: ");
        sc.nextLine(); // control flow
        chapterAlias = sc.nextLine();
    }
     */

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

    void printState () {
        System.out.println(title + "\nWas written by: " + author + "\n" + title + " consists of " + numberOfPages + " pages.\nThe Genre of this book is: " + genre);
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
}
