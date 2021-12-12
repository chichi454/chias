import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

public class BookManager {
    // TODO: your code here
    // attribute books
    int Id;
    String Name;
    Double Price;
    Scanner scanner;
    ArrayList<Book> Books = new ArrayList<>();
    private Object keyword;

    public BookManager() {
        // TODO: your code here
        loadFromFile();
    }

    public ArrayList<Book> getBooks() {
        // TODO: your code here
        return Books;
    }

    /**
     * update this.books by reading books from file books.txt
     */
    public void loadFromFile() {
        // TODO: your code here
        System.out.println("Loading books...");
        try {
            File Books = new File("books.txt");
            scanner = new Scanner(Books);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            System.out.println("An error occurred. ");
        }
        scanner.close();

        //tách
        while (scanner.hasNextLine()) {
            String li = scanner.nextLine();
            if (li.isEmpty()) continue;
            int Id = Integer.parseInt(li.substring(0, 5).trim());
            String Name = li.substring(7, 46);
            Double Price = Double.parseDouble(li.substring(47).trim());
        }
    }

    /**
     * print books (one/line) in required format
     */
    public void printBooks() {
        // TODO: your code here
        if (Books.isEmpty()) {
            System.out.println("(empty)");
        } else {
            System.out.println("__________________________________________________________");
            System.out.printf("%-5s%-45s%-10s", "ID", "Name", "Price");
            System.out.println();
            for (int i = 0; i < Books.size(); i++) {
                int outputid = Books.get(i).getId();
                String outputname = Books.get(i).getName();
                Double outputprice = Books.get(i).getPrice();
            }
            System.out.println("__________________________________________________________");
        }
    }
    /**
     * if book.id is not duplicated, add book to this.books
     * return whether added or not
     */
    public void add() throws IOException {
        // TODO: your code here
        int id = (Books.size() > 0) ? (Books.size() + 1) : 1;
        System.out.println(id);
        String name;
        Double price;
        System.out.println("Enter your book name :");
        name = scanner.nextLine();
        System.out.println("Enter the book price : ");
        price = scanner.nextDouble();
        Book books = new Book(id, name, price);
        Books.add(books);
    }

    /**
     * return book specified by id, null if not found
     */
    public Book  getBookById( int id) {
        // TODO: your code here
        boolean isExisted = false;
        int size = Books.size();
        for (int i = 0; i < size; i++) {
            if (Books.get(i).getId() == id) {
                isExisted = true;
                Books.get(i).getName(i);
                Books.get(i).getPrice(i);
                break;
            }
            return null;
        }
        if (!isExisted) {
            System.out.printf("id = %d not found.\n", id);
        } else {
            Books.add(getBookById());
        }
        return null;
    }

    Book getBookById() {
        return null;
    }

    /**
     * remove book from this.books
     */
    public void remove (Book book){
        // TODO: your code here
        Book books = null;
        int size = Books.size();
        for (int i = 0; i < size; i++) {
            if (Books.get(i).getId() == Id) {
                books = Books.get(i);
                break;
            }
        }
        if (books != null) {
            Books.remove(book);
        } else {
            System.out.printf("id = %d not existed.\n", Id);
        }
    }

    /**
     * update this.books to be sorted by price from high -> low
     */
    public void sortDescByPrice () {
        // TODO: your code here

    }

    /**
     * return all books having name contains keyword (case in-sensitive)
     */
    public void searchByName(){
        ArrayList<Book> matches = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        keyword = sc.nextLine();
if ( keyword.equals(Book.getName))
        // TODO: your code here

{
}
    }
    /**
     * write this.books to file books.txt in required format
     */
    public void saveToFile () {
        // TODO: your code here

    }

    private String inputBookName() {
        return scanner.nextLine();
    }

    private Double inputPrice () {
        return scanner.nextDouble();
    }

    public void getBookById(Book id) {
    }
}
