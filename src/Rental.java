import java.util.ArrayList;

public class Rental  {
    private ArrayList<Book> booksDatabse = new ArrayList<>( );

    public void printDatabase(){
        for(Book book : booksDatabse){
            System.out.println(book.toString());
        }
    }

    public void addToDatabase(Book book){
        this.booksDatabse.add(book);
    }

    public void removeFromDatabase(int id){
        booksDatabse.remove(id);
    }
}
