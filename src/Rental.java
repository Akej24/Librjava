import java.util.ArrayList;

public class Rental  {
    final private ArrayList<Book> booksDatabase = new ArrayList<>( );

    public void printDatabase(){
        for(Book book : booksDatabase){
            System.out.println(book.toString());
        }
    }

    public void addToDatabase(Book book){
        this.booksDatabase.add(book);
    }

    public void removeFromDatabase(int id){
        booksDatabase.remove(id);
    }

    public ArrayList<Book> getBooksDatabase() {
        return booksDatabase;
    }

}
