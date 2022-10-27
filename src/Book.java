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
                ", Status: " + convertBooleanToStringAvaible(status) +
                ']';
    }

    public String convertBooleanToStringAvaible(boolean status){
        if(status){
            return "avaible";
        }
        return "not avaible";
    }
}
