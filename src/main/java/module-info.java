module com.example.persondemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.persondemo to javafx.fxml;
    exports com.example.persondemo;
}