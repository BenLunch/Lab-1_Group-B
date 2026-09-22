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
        firstBook.borrowBook();

        Book secondBook = createBook("The Skinner","Neal Asher", 424);
        Book thirdBook = createBook("The Last of the Sky Pirates","Chris Riddell and Paul Stewart", 350);
        Book fourthBook = createBook("The Thief of Always","Clive Barker", 288);

        System.out.println("\n");
        secondBook.displayDetails();
        System.out.println("\n");
        thirdBook.displayDetails();
        System.out.println("\n");
        fourthBook.displayDetails();
        System.out.println("\n");
    }

    private static Book createBook(String title, String author, int pageCount )
    {
        Book book = new Book();
        book.title = title;
        book.author = author;
        book.pageCount = pageCount;
        return book;
    }
}