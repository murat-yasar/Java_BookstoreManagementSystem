package de.myasar.mybookmanagement.test;

import de.myasar.mybookmanagement.model.Book;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    //region Constants
    private static final int BOOK_AMOUNT = 10;
    //endregion

    //region Attributes
    //endregion

    //region Constructors
    private TestData() {}
    //endregion

    //region Methods
    public static List<Book> getTestBooks() {
        List<Book> bookList = new ArrayList<>();

//        for (int i = 0; i < BOOK_AMOUNT; i++) {
//            Book testBook = new Book("Genre " + i, "Title " + i, 2000+i, "Author " + i);
//            testBooks.add(testBook);
//        }

        Book testBook1 = new Book("Sci-Fi", "Old Book", 2002, "Me", 1);
        bookList.add(testBook1);
        Book testBook2 = new Book("Horror", "Older Book", 2000, "MySelf", 1);
        bookList.add(testBook2);
        Book testBook3 = new Book("Detective", "New Book", 2004, "I", 1);
        bookList.add(testBook3);
        Book testBook4 = new Book("Sci-Fi", "Newer Book", 2022, "Someone", 1);
        bookList.add(testBook4);
        Book testBook5 = new Book("Self-Help", "Last Book", 2020, "No one", 1);
        bookList.add(testBook5);
        Book testBook6 = new Book("Adventure", "First Book", 2010, "Any one", 1);
        bookList.add(testBook6);

        return bookList;
    }
    //endregion
}
