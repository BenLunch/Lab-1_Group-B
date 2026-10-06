Book Tracker Application.

Lab 1 Question Answers:
When setting a breakpoint at the final displayDetails
for first book you can see that all the details are
the same except for the availability which is now false
due to the borrowedBook method used prior. Everything is
functioning as intended.
The logged details for first book were as followed in 
our breakpoint at line 16.
title: The Hobbit.
author. J.R.R Tolkien.
pageCount: 366.
available: false.

Lab 3 Question Answers:
1. In the main program the 7 day call reaches the borrow book method
because the duration of the loan is within the 1 to 14 day parameter
we set in LibraryService where as the 15 day call was outside this parameter
also the book was AVAILABLE before the 15 day call because before this we
called our return book method to make the ON_LOAN book AVAILABLE again.
2. JDK and Java Package: Open jdk - 27 / ie.atu.oop.week1
3. Why does the constructor call null before isBlank(): If null is true then isBlank() won't be called
that way we don't run into a nullPointerException.
4. Why title,author and pageCount are final and status is not: These first 3 variables are final because
the name of a book, the author and the pageCount should not be subject to change. The status is not final 
because borrowing and returning book methods need to be able to change whether the Book is ON_LOAN or
AVAILABLE.
5. Why do we use borrowBook and returnBook instead of status setters:Behaviour methods hide internal data
where status setters expose internal data, this means that using the methods BorrowBook and ReturnBook is 
better encapsulation than just using a status setter. It also allows for better clarity.
6. Which checks belong in Book and which checks belong in LibraryService: Any checks in relation to what the book
is or the status of the book should be in book. Any checks in relation to library operations should be in library.
For book examples would be title checks, author checks and checking pageCount. LibraryService has checks for things
like amount o0f loan days and book returns. An argument can be made for the borrow and return book checks to be in 
the library service as these fields pertain to library operations but they are also fine for book because they are 
in relation to the status of the book itself.

