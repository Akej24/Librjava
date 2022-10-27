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
                System.out.println("Podaj tytuł: ");
                String title = scanner.next();
                System.out.println("Podaj autora: ");
                String author = scanner.next();
                System.out.println("Podaj datę wydania: ");
                String date = scanner.next();
                System.out.println("Podaj liczbę stron: ");
                int numberOfPages = scanner.nextInt();
                System.out.println("Podaj cenę: ");
                int price = scanner.nextInt();
                rental.addToDatabase(new Book(title, author, date, numberOfPages, price));
                break;
            case 2:
                break;
            case 3:
                System.out.println("Podaj ID książki do usunięcia");
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