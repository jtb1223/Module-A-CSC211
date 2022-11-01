module com.mycompany.fxmlexample {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.fxmlexample to javafx.fxml;
    exports com.mycompany.fxmlexample;
}
