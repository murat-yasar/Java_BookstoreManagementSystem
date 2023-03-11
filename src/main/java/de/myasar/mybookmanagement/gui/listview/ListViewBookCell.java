package de.myasar.mybookmanagement.gui.listview;

import de.myasar.mybookmanagement.model.Book;
import de.myasar.mybookmanagement.settings.AppTexts;
import javafx.scene.control.ListCell;

/**
 * Defines a cell as it should be displayed in the ListView.
 */
public class ListViewBookCell extends ListCell<Book> {
    //region Constants
    //endregion

    //region Attributes
    //endregion

    //region Constructors
    //endregion

    //region Methods

    /**
     * Updates the content of a cell and displays it in the implemented way.
     * The cells are built from {@link ListViewBookCellFactory}.
     *
     * @param bookToShow : {@link Book} : The book to display
     * @param isEmpty : boolean : Indicates whether cell should be empty or not.
     */
    @Override
    protected void updateItem(Book bookToShow, boolean isEmpty) {
        super.updateItem(bookToShow, isEmpty);

        if (isEmpty && bookToShow == null) {
            setText(null);
            setGraphic(null);
        } else {
            setText(String.format(AppTexts.BOOK_FORMAT_STRING, bookToShow.getId(), bookToShow.getGenre(), bookToShow.getTitle(),
                    bookToShow.getPublishYear(), bookToShow.getAuthor(), bookToShow.getBookCount()));
        }
    }

    //endregion
}
