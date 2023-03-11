package de.myasar.mybookmanagement.gui;

import de.myasar.mybookmanagement.gui.listview.ListViewBookCellFactory;
import de.myasar.mybookmanagement.logic.BookHolder;
import de.myasar.mybookmanagement.model.Book;
import de.myasar.mybookmanagement.settings.AppSettings;
import de.myasar.mybookmanagement.settings.AppTexts;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Control logic for the overview scene
 */
public class OverviewController implements Initializable {
    //region Constants
    //endregion

    //region Attributes
    @FXML
    private ListView<Book> bookListView;
    //endregion

    //region Constructors
    //endregion

    //region Methods
    /**
     * Called before opening a scene to initialize the scene's controller.
     *
     * @param url : {@link URL} : Location to resolve relative paths for the root object, or null if the location is not known.
     * @param resourceBundle : {@link ResourceBundle} : to locate the object, or null if the object is not located.
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Assign own cell factory
        bookListView.setCellFactory(new ListViewBookCellFactory());

        // Fill list view with elements (must be an ObservableList)
        bookListView.setItems(BookHolder.getInstance().getBooks());

        bookListView.setOnMouseClicked(mouseEvent -> {
            if (mouseEvent.getClickCount() == AppSettings.DETAIL_CLICK_COUNT &&
                    mouseEvent.getButton() == MouseButton.PRIMARY) {
                Book selectedBook = bookListView.getSelectionModel().getSelectedItem();
                SceneManager.getInstance().switchToDetailScene(selectedBook);
            }
        });

        bookListView.setOnKeyPressed(keyEvent -> {
            if (keyEvent.getCode() == KeyCode.ENTER) {
                Book selectedBook = bookListView.getSelectionModel().getSelectedItem();
                SceneManager.getInstance().switchToDetailScene(selectedBook);
            }
        });
    }

    @FXML
    private void switchToDetailSceneForNewBook() {
        SceneManager.getInstance().switchToDetailScene(null);
    }

    @FXML
    private void sortBookList(ActionEvent actionEvent) {

        if (actionEvent.getSource() instanceof Button sortButton) {
            switch (sortButton.getId()) {
                case AppSettings.BTN_SORT_BOOK_ID -> BookHolder.getInstance().sortById();
                case AppSettings.BTN_SORT_GENRE_ID -> BookHolder.getInstance().sortByGenre();
                case AppSettings.BTN_SORT_TITLE_ID -> BookHolder.getInstance().sortByTitle();
                case AppSettings.BTN_SORT_PUBLISH_YEAR_ID -> BookHolder.getInstance().sortByPublishYear();
                case AppSettings.BTN_SORT_AUTHOR_ID -> BookHolder.getInstance().sortByAuthor();
                case AppSettings.BTN_SORT_COUNT_ID -> BookHolder.getInstance().sortByBookCount();
                default -> System.err.println(AppTexts.MSG_INVALID_SORT_BUTTON);
            }
        }
    }

    @FXML
    public void addNewBook(ActionEvent actionEvent) {
        if (actionEvent.getSource() instanceof Button) {
            switchToDetailSceneForNewBook();
        }
    }

    //TODO 2: Implement helpScreen() Method
    @FXML
    public void helpButton(ActionEvent actionEvent) {
        if (actionEvent.getSource() instanceof Button) {
            switchToHelpScene();
        }
    }

    private void switchToHelpScene() {
    }
    //endregion
}