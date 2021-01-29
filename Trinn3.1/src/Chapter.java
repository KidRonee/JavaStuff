import java.util.Scanner;

public class Chapter {
    private String title;
    private int pages;

    /*
    public Chapter() {
        System.out.println("Add chapter title and number of pages here");
        Scanner sc = new Scanner(System.in);
        System.out.print("Add chapter title: ");
        sc.nextLine();
        System.out.print("Add number of pages: ");
        sc.nextInt();
    }
    */



    public Chapter (String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void printChapterInformation() {
        System.out.println("Title: " + title + "\nPages: " + pages);
    }
}
