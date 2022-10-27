import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rental rental = new Rental();
        boolean isProgramWorking = true;

        while(isProgramWorking){
        System.out.println("""
                Welcome to Librjava, select an action:
                [1] Add a book
                [2] Edit a book
                [3] Delete a book
                [4] Show books database
                [5] Exit the program""");

        int choice = scanner.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Give the title: ");
                String title = scanner.next();
                System.out.println("Give the author: ");
                String author = scanner.next();
                System.out.println("Give the release date: ");
                String date = scanner.next();
                System.out.println("Give the number of pages: ");
                int numberOfPages = scanner.nextInt();
                System.out.println("Give the price: ");
                int price = scanner.nextInt();
                rental.addToDatabase(new Book(title, author, date, numberOfPages, price));
                break;
            case 2:
                System.out.println("Give the ID of the book to be edited: ");
                int idOfBookToEdit = scanner.nextInt();
                System.out.println("""
                Give the element to be edited: ""
                [1] Title
                [2] Author
                [3] ReleaseDate
                [4] NumberOfPages
                [5] Price
                [6] Status""");
                int parameterOfBookToEdit = scanner.nextInt();
                System.out.println("Replace this data with: ");
                String modifiedData = scanner.next();
                switch(parameterOfBookToEdit){
                    case 1:
                        rental.getBooksDatabase().get(idOfBookToEdit).setTitle(modifiedData);
                        break;
                    case 2:
                        rental.getBooksDatabase().get(idOfBookToEdit).setAuthor(modifiedData);
                        break;
                    case 3:
                        rental.getBooksDatabase().get(idOfBookToEdit).setReleaseDate(modifiedData);
                        break;
                    case 4:
                        rental.getBooksDatabase().get(idOfBookToEdit).setNumberOfPages(Integer.parseInt(modifiedData));
                        break;
                    case 5:
                        rental.getBooksDatabase().get(idOfBookToEdit).setPrice(Integer.parseInt(modifiedData));
                        break;
                    case 6:
                        rental.getBooksDatabase().get(idOfBookToEdit).setStatus(Boolean.getBoolean(modifiedData));
                        break;
                }
                break;
            case 3:
                System.out.println("Give the ID of the book to be deleted");
                int id = scanner.nextInt();
                rental.removeFromDatabase(id);
                break;
            case 4:
                rental.printDatabase();
                break;
            case 5:
                isProgramWorking = false;
                break;
        }
        }
    }
}