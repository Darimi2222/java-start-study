package sungbinClub.day7.advanced;

public class Book {
    private static int ID_COUNTER = 1;
    private int id;
    private String title;
    private String author;
    private String publishing;
    private int price;
    private int stock;
    private String isbn;

    public Book(String title, String author, String publishing, int price, int stock, String isbn) {
        this.id = ID_COUNTER++;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.price = price;
        this.stock = stock;
        this.isbn = isbn;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getIsbn() {
        return isbn;
    }
}
