public class Chapter {
    String chapterTitle;
    int chapterPages;

    public Chapter (String chapterTitle, int chapterPages) {
        this.chapterTitle = chapterTitle;
        this.chapterPages = chapterPages;
    }

    public void printChapterInformation() {
        System.out.println("Chapter title: " + chapterTitle + "\nPages: " + chapterPages);
    }

    public String getChapterTitle() {
        return chapterTitle;
    }

    public void setChapterTitle(String chapterTitle) {
        this.chapterTitle = chapterTitle;
    }

    public int getChapterPages() {
        return chapterPages;
    }

    public void setChapterPages(int chapterPages) {
        this.chapterPages = chapterPages;
    }
}
