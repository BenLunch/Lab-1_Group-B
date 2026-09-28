package ie.atu.oop.week1;

public class Main
{
    public static void main(String[] args)
    {
        Book myBook = new Book("Dune", "Frank", 0);
        System.out.println(myBook.getTitle());
        System.out.println(myBook.getAuthor());
        System.out.println(myBook.getPageCount());
    }
}