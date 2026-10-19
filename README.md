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

Lab 4 Questions Answers:
Lab 4 changes LibraryService from working with a single supplied Book to owning a
List<Book>.
1. Explain what List<Book> tells the compiler: It tells us that this is a List and Book tells us that only books 
are allowed in this list. Telling the compiler it is a list means we can get, add and remove from it.
2.  Explain why final does not prevent books.add(...).: final means that can't be used for a different 
ArrayList but the items in the array lists can be changed.
3.  Explain what the enhanced for loop variable represents. In for(Book book : books); book points to the first book,
then the second book then the third until the list is done.
4. • Describe what findBookByTitle returns for a known and an unknown title.: For a known title it returns the book 
object. for an unknow title it returns null.
5.  Explain why removeBook reuses findBookByTitle instead of writing another search loop.: Why code it again if you 
have it. We can reuse findBookByTitle meaning no need for a loop and less bugs.
6. • Explain which responsibilities belong to Main, LibraryService and Book.:
Main: Creates objects, calls methods, prints result.
LibraryService: Holds list of books and actions involving books. e.g. loaning, removing, returning.
Book: Holds title, author, pageCount,and status, checks if valid, controls status change
I used AI to help me understand the concepts that the questions were asking me about. helping me to
understand how exactly every piece of my code operates and the order it occurs.

Lab 5 Question Answers:
In lab 4 book protects one object and LibraryService owns a private List<Book>. In lab 5 we locate a throw statement
already used in Book, explore Path and Files. Then we save Library Catalogue to data/book.cvs and this will rebuild
it on the next run.
1. Briefly explain the difference between the throw statement inside book and the catch block used by the caller:
The throw statement in Book is where a problem with book is detected.Book has error handling e.g. title being blank 
or pageCount being letters not numbers. The catch block used by caller handles the problem detected by the throw 
statement and prints the correlated message. Allowing the program to keep running and fix errors while still 
operating.
2. Record what Path.of(...) does and name one Path method and one Files method used in the lab: Path.of(...)
creates a path object. This shows us the location of a file or folder on the computer. 
One Path method - getFileName().
One Files method - File.exists(file)
3. State that Lab 5 adds exception handling and CSV persistence to the Library application: Lab 5 adds exception
handling using throw and catch to handle errors, we also use cvs persistence to carry on information through
multiple runs of main. 
4.  Explain the difference between unchecked NumberFormatException and checked IOException: NumberFormatException 
comes from a bad input like typing thirty four rather than 34. IOException is an error with input / output 
operations. This error does have to be dealt with usually with a try/catch or with a throw IOException.
5. Explain the difference between Path and Files:
Path - This shows us where a file is or where it would be. It is the address
Files - This puts actions into place such as creating a file, read file and get file. It is the action.
6. Document the CSV columns in order: title, author, pageCount, status.
   title,author,pageCount,status
   Dune,Frank Herbert,412,ON_LOAN
   Clean Code,Robert C. Martin,464,AVAILABLE




