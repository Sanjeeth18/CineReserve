module com.example.javapackage {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javapackage to javafx.fxml;
    exports com.example.javapackage;
}