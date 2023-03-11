package de.myasar.mybookmanagement.gui;

import de.myasar.mybookmanagement.logic.BookHolder;
import de.myasar.mybookmanagement.model.Book;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Control logic for the detail scene
 */
public class DetailController {
    //region Constants
    //endregion

    //region Attributes
    @FXML
    private TextField txtGenre;
    @FXML
    private TextField txtTitle;
    @FXML
    private TextField txtPublishYear;
    @FXML
    private TextField txtAuthor;
    @FXML
    private TextField txtBookCount;

    private Book selectedBook;
    //endregion

    //region Constructors
    //endregion

    //region Methods
    /**
     * Sets the selected book and fills the text fields with the values of its properties
     *
     * @param selectedBook : {@link Book} : Book selected in the overview
     */
    public void setSelectedBookAndDetails(Book selectedBook) {
        this.selectedBook = selectedBook;

        if (selectedBook != null) {
            txtGenre.setText(selectedBook.getGenre());
            txtTitle.setText(selectedBook.getTitle());
            txtPublishYear.setText(String.valueOf(selectedBook.getPublishYear()));
            txtAuthor.setText(selectedBook.getAuthor());
            txtBookCount.setText(String.valueOf(selectedBook.getBookCount()));
        }
    }

    @FXML
    private void saveBook() {
        if (selectedBook != null) {
            // Edit selected book
            if (textFieldIsNotBlankEmptyOrEqual(txtGenre, selectedBook.getGenre()))
                selectedBook.setGenre(txtGenre.getText());

            if (textFieldIsNotBlankEmptyOrEqual(txtTitle, selectedBook.getTitle()))
                selectedBook.setTitle(txtTitle.getText());

            if (textFieldIsNotBlankEmptyOrEqual(txtPublishYear, String.valueOf(selectedBook.getPublishYear())))
                selectedBook.setPublishYear(Integer.parseInt(txtPublishYear.getText()));

            if (textFieldIsNotBlankEmptyOrEqual(txtAuthor, selectedBook.getAuthor()))
                selectedBook.setAuthor(txtAuthor.getText());

            if (textFieldIsNotBlankEmptyOrEqual(txtBookCount, String.valueOf(selectedBook.getBookCount())))
                selectedBook.setBookCount(Integer.parseInt(txtBookCount.getText()));

        } else {
            // Create a new book
            Book newBook = new Book(
                    txtGenre.getText(),
                    txtTitle.getText(),
                    Integer.parseInt(txtPublishYear.getText()),
                    txtAuthor.getText(),
                    Integer.parseInt(txtBookCount.getText())
            );

            BookHolder.getInstance().getBooks().add(newBook);
        }

        switchToOverviewScene();
    }

    /**
     * Deletes a book from the list
     */
    @FXML
    public void deleteBook() {
        if (selectedBook != null) {
            BookHolder.getInstance().getBooks().remove(selectedBook);
            switchToOverviewScene();
        }
    }

    @FXML
    private void switchToOverviewScene() {
        SceneManager.getInstance().switchToOverviewScene();
    }

    private boolean textFieldIsNotBlankEmptyOrEqual(TextField textField, String attributeValue) {
        return !textField.getText().isBlank() &&
                !textField.getText().isEmpty() &&
                !textField.getText().equals(attributeValue);
    }
    //endregion
}
