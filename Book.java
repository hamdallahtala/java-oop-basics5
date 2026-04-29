public class Book {
    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }
    public String toString() {
        return "Title: " + getTitle() + " , Pages: " + getPages();
    }
}
