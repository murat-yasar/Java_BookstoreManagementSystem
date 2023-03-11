package de.myasar.mybookmanagement.logic.db;

import de.myasar.mybookmanagement.model.Book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

/**
 * Builds connections to databases and provides the respective Dao objects to access individual tables
 */
public class DbManager  {
    //region Constants
    public static final int BOOKS = 0;
    public static final int USERS = 1;
    private static final String SERVER_IP = "localhost";

    private static final String DB_NAME = "bookmanagement";

    private static final String DB_USER_NAME = "root";
    private static final String DB_USER_PASSWORD = "";

    private static final String CONNECTION_URL = "jdbc:mariadb://" + SERVER_IP + "/" + DB_NAME;
    //endregion

    //region Attributes
    private static DbManager instance;

    private final DaoBooks daoBooks;
    //endregion

    //region Constructor
    private DbManager() {
        daoBooks = new DaoBooks();
    }
    //endregion

    //region Methods
    public static synchronized DbManager getInstance() {
        if (instance == null) instance = new DbManager();
        return instance;
    }

    /**
     * Establishes and returns a connection to the database
     *
     * @return {@link Connection} : Connection to the database
     */
    private Connection getConnection() {
        Connection dbConnection = null;

        try {
            dbConnection = DriverManager.getConnection(CONNECTION_URL, DB_USER_NAME, DB_USER_PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dbConnection;
    }

    /**
     * It checks the instance for the passed object to insert a record.
     *
     * @param object : {@link Object} : The object to insert
     */
    public void insertDataRecord(Object object) {
        if (object instanceof Book book) daoBooks.create(getConnection(), book);
    }

    /**
     * Reads all books from the database and returns them as a list.
     *
     * @return {@link List <Book>} : The List of all books in the Database
     */
    public List<Book> readAllDataRecords() {
        return daoBooks.readAll(getConnection());
    }

    /**
     * It checks the instance for the passed object to update a record.
     */
    public void updateDataRecord(Object object) {
        if (object instanceof Book book) daoBooks.update(getConnection(), book);
    }

    /**
     * It checks the instance for the passed object to delete a record.
     */
    public void deleteDataRecord(Object object) {
        if (object instanceof Book book) daoBooks.delete(getConnection(), book);
    }
    //endregion
}
