package de.myasar.mybookmanagement.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * As the model class, it represents a book, with characteristics of genre, title, publish year, and author.
 */
public class Book {

    //region Constants
    public static final String STD_STRING_VALUE = "noValueSetYet";
    public static final int STD_INT_VALUE = -1;
    //endregion

    //region Attributes
    private int id;
    private final StringProperty genre;
    private final StringProperty title;
    private final IntegerProperty publishYear;
    private final StringProperty author;
    private final IntegerProperty bookCount;
    //endregion

    //region Constructors
    public Book() {
        genre = new SimpleStringProperty(STD_STRING_VALUE);
        title = new SimpleStringProperty(STD_STRING_VALUE);
        publishYear = new SimpleIntegerProperty(STD_INT_VALUE);
        author = new SimpleStringProperty(STD_STRING_VALUE);
        bookCount = new SimpleIntegerProperty(STD_INT_VALUE);
    }

    public Book(String genre, String title, int publishYear, String author, int bookCount) {
        this.genre = new SimpleStringProperty(genre);
        this.title = new SimpleStringProperty(title);
        this.publishYear = new SimpleIntegerProperty(publishYear);
        this.author = new SimpleStringProperty(author);
        this.bookCount = new SimpleIntegerProperty(bookCount);
    }
    //endregion

    //region Methods

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre.get();
    }
    public StringProperty genreProperty() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre.set(genre);
    }

    public String getTitle() {
        return title.get();
    }
    public StringProperty titleProperty() {
        return title;
    }
    public void setTitle(String title) {
        this.title.set(title);
    }

    public int getPublishYear() {
        return publishYear.get();
    }
    public IntegerProperty publishYearProperty() {
        return publishYear;
    }
    public void setPublishYear(int publishYear) {
        this.publishYear.set(publishYear);
    }

    public String getAuthor() {
        return author.get();
    }
    public StringProperty authorProperty() {
        return author;
    }
    public void setAuthor(String author) {
        this.author.set(author);
    }

    public int getBookCount() {
        return bookCount.get();
    }
    public IntegerProperty bookCountProperty() {
        return bookCount;
    }
    public void setBookCount(int bookCount) {
        this.bookCount.set(bookCount);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + getId() + '\'' +
                "genre='" + genre.get() + '\'' +
                ", name='" + title.get() + '\'' +
                ", year=" + publishYear.get() +
                ", author='" + author.get() + '\'' +
                ", count='" + bookCount.get() + '\'' +
                '}';
    }
    //endregion
}
