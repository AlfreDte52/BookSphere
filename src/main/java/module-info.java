module com.umg.booksphere {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.umg.booksphere to javafx.fxml;
    exports com.umg.booksphere;
}
