public class Book {
    public static String getName;
    // TODO: your code here
    // attributes id, name, price
    private int id;
    private String name;
    private Double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    // constructor
    public Book(int id, String name, double price) {
        // TODO: your code here
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        // TODO: your code here
        this.name = name;
    }

    public void setPrice(double price) {
        // TODO: your code here
        this.price = price;
    }
    /**
     * return this as a String in the required format
     */
    @Override
    public String toString() {
        // TODO: your code here
        return id + " " + name + " " + price;
    }

    public void getName(int i) {
    }

    public void getPrice(int i) {
    }
}
