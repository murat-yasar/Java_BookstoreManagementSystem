module de.myasar.mybookmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.mariadb.jdbc;

    opens de.myasar.mybookmanagement to javafx.fxml;
    exports de.myasar.mybookmanagement;
    exports de.myasar.mybookmanagement.gui;
    opens de.myasar.mybookmanagement.gui to javafx.fxml;
}