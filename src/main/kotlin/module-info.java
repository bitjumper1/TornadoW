module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires tornadofx;

    opens com.example.demo.app to javafx.fxml;
    exports com.example.demo.app;
    exports com.example.demo.view;
}