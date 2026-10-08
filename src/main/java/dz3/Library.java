package dz3;

public class Library {


    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }




}
