package de.myasar.mybookmanagement.logic.db;

import java.sql.Connection;
import java.util.List;

/**
 * Interface that predefines methods for CRUD operations.
 * DAO - Data Access Object
 */
public interface Dao<T> {
    /**
     * Method for inserting an object into the database
     *
     * @param dbConnection : {@link Connection} : Connection to the database
     * @param object : T : Object of a specific class to create
     */
    void create(Connection dbConnection, T object);

    /**
     * Method for reading all objects from the database
     * @param dbConnection : {@link Connection} : Connection to the database
     * @return {@link List <T>} : List of objects from the database
     */
    List<T> readAll(Connection dbConnection);

    /**
     * Method for reading an object from the database using the ID.
     *
     * @param dbConnection : {@link Connection} : Connection to the database
     * @param id : int : Id of the object to be read
     * @return
     */
    T read(Connection dbConnection, int id);

    /**
     * Method for updating a specific object in the database
     *
     * @param dbConnection : {@link Connection} : Connection to the database
     * @param object : T : Object of a specific class to be updated
     */
    void update(Connection dbConnection, T object);

    /**
     * Method for deleting a specific object from the database
     *
     * @param dbConnection : {@link Connection} : Connection to the database
     * @param object : T : Object of a specific class to be deleted
     */
    void delete(Connection dbConnection, T object);
}
