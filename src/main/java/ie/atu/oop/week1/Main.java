package ie.atu.oop.week1;

public class Main {
    public static void main(String[] args) {

        Book firstBook = new Book();
        firstBook.title = "The Hobbit";
        firstBook.author = "J.R.R Tolkien";
        firstBook.pageCount = 366;

        //before loan
        firstBook.displayDetails();
        firstBook.borrowBook();
        System.out.println("\n");
        //after loan
        firstBook.displayDetails();
    }
}