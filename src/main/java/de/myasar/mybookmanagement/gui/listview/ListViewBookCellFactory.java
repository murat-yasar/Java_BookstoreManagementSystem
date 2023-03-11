package de.myasar.mybookmanagement.gui.listview;

import de.myasar.mybookmanagement.model.Book;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

/**
 * Builds the ListView using the cells which are defined here {@link ListViewBookCell}.
 */
public class ListViewBookCellFactory implements Callback<ListView<Book>, ListCell<Book>> {
    //region Constants
    //endregion

    //region Attributes
    //endregion

    //region Constructors
    //endregion

    //region Methods

    /**
     * Builds and returns a new cell for each element of the ObservableList of the ListView.
     *
     * @param bookListView : {@link ListView<Book>} : Listview with the list of books.
     *
     * @return {@link ListViewBookCell}: Object of own cell class.
     */
    @Override
    public ListCell<Book> call(ListView<Book> bookListView) {
        return new ListViewBookCell();
    }
    //endregion
}
