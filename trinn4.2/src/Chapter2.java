public class Chapter2 {
    String title;
    int numberOfPages;

    // Chapter constructor with 2 params (title and num pages)
    public Chapter2(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // method that prints information about chapter(s)
    public void printChapterInformation() {
        System.out.println("Title: " + title + "\nPages: " + numberOfPages);
    }
}
