module com.example.solidshop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.solidshop to javafx.fxml;
    exports com.example.solidshop;
    exports Controller;
    opens Controller to javafx.fxml;
}