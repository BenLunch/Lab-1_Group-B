package ie.atu.oop.week1;

import java.sql.SQLOutput;

public class BookExceptionCheck
{
    public static void main(String[] args)
    {
        try
        {
            Book invalid = new Book("Dune", "Frank Herbert", 412);
            System.out.println(invalid.getTitle());
        }catch (IllegalArgumentException ex)
        {
            System.out.println("Book Rejected: " + ex.getMessage());
        }
    }
}
