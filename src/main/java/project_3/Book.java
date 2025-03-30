package project_3;

public class Book {

    private String title;

    public String getTitle() {
        return title;
    }


    public boolean isAvailable() {
        return !isBorrowed;
    }


    private boolean isBorrowed;
    public Book(String title)
    {
        this.title = title;
        this.isBorrowed = false;
    }
}
