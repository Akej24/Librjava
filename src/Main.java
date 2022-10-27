import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rental rental = new Rental();
        boolean isProgramWorking = true;
        while(isProgramWorking){
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("""
                        Welcome to Librjava, select an action:
                        [1] Add a book
                        [2] Edit a book
                        [3] Delete a book
                        [4] Show books database
                        [5] Exit the program""");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {
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
                    }
                    case 2 -> {
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
                        switch (parameterOfBookToEdit) {
                            case 1 -> rental.getBooksDatabase().get(idOfBookToEdit).setTitle(modifiedData);
                            case 2 -> rental.getBooksDatabase().get(idOfBookToEdit).setAuthor(modifiedData);
                            case 3 -> rental.getBooksDatabase().get(idOfBookToEdit).setReleaseDate(modifiedData);
                            case 4 -> rental.getBooksDatabase().get(idOfBookToEdit).setNumberOfPages(Integer.parseInt(modifiedData));
                            case 5 -> rental.getBooksDatabase().get(idOfBookToEdit).setPrice(Integer.parseInt(modifiedData));
                            case 6 -> rental.getBooksDatabase().get(idOfBookToEdit).setStatus(Boolean.getBoolean(modifiedData));
                            default -> System.out.println("Enter a valid ID or element to be edited!");
                        }
                    }
                    case 3 -> {
                        System.out.println("Give the ID of the book to be deleted");
                        int id = scanner.nextInt();
                        rental.removeFromDatabase(id);
                    }
                    case 4 -> rental.printDatabase();
                    case 5 -> isProgramWorking = false;
                    default -> System.out.println("Enter a valid number!");
                }
                System.out.println("----------------------");
            }catch(InputMismatchException | IndexOutOfBoundsException e){
                System.out.println("Invalid input, try again");
            }
        }
    }
}