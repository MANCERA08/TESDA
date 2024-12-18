//Ma. Angela M. Mancera
//Task: Create a Java class to represent a Book and implement a constructor to initialize its attributes.

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public String toString() {
       
       String s = ("Title: " + "\"" + title + "\"" + "\r\n" + 
                   "Author: " + "\"" + author + "\"" + "\r\n" +
                   "Year Published: " + yearPublished + "\r\n" + 
                   "Price: " + "$"+ price);  
       return s;      
    }
}
public class Tasksheet123 {
    public static void main(String[] args) {
        Book[] book = new Book[] {
            new Book("Java Programming", "John Smith", 2021, 39.99),
            new Book("Python Basics", "Jane Doe", 2020, 29.99),
            new Book("C++ Essentials", "Michael Johnson", 2019, 49.99) };
  
        int countBook = 0;
        
        for(Book b: book) {
            countBook++;
            System.out.println("\r\n" + "Book " + countBook + ":" + "\r\n" + b.toString());
        }
    }
}
