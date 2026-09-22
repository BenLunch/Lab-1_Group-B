package ie.atu.oop.week1;

public class Book {

    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails()
    {
        System.out.println("Book title: " + title);
        System.out.println("Book author: " + author);
        System.out.println("Book page count: " + pageCount);
    }

    public void borrowBook()
    {
        if(available)
        {
            available = false;
            System.out.println(title + ": Successfully borrowed ");
        }
        else
        {
            System.out.println(title + " is already on loan");
        }
    }
}
