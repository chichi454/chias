import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String choose = null;
        boolean exit = false;
        BookManager bookManagerManager = new BookManager();
        Book Id;
        showMenu();
        while (true) {
            switch (choose) {
                case "2":
                    bookManagerManager.add();
                    break;
                case "3":
                    Id = bookManagerManager.getBookById();
                    bookManagerManager.getBookById(Id);
                    break;
                case "4": //deleteabook
                    Id = bookManagerManager.getBookById();
                    bookManagerManager.remove(Id);
                    break;
                case "5":
                    bookManagerManager.searchByName();
                    break;
                case "6":
                    bookManagerManager.sortDescByPrice();
                    break;
                case "1":
                    bookManagerManager.printBooks();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
    public static void showMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("1. list all books");
        System.out.println("2. add a new book");
        System.out.println("3. edit book");
        System.out.println("4. delete a book");
        System.out.println("5. search books by name");
        System.out.println("6. sort book descending by price");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("0. save & exit");
        System.out.println("--------------------------------------------------");
        System.out.println(" Your option : ");
    }
}
