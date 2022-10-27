public class Book {

    static int nextId = 0;
    int id;
    private String title;
    private String author;
    private String releaseDate;
    private int numberOfPages;
    private int price;
    private boolean status;

    Book(){
        id = nextId;
        nextId++;
        this.status = true;
    }
    Book(String title, String author, String releaseDate, int numberOfPages, int price) {
        this();
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    @Override
    public String toString() {

        return "[" +
                "ID: " + id +
                ", Title: " + title +
                ", Author: " + author +
                ", ReleaseDate: " + releaseDate +
                ", NumberOfPages: " + numberOfPages +
                ", Price: " + price +
                ", Status: " + convertStatusToString(status) +
                ']';
    }

    public String convertStatusToString(boolean status){
        if(status){
            return "avaible";
        }
        return "not avaible";
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
