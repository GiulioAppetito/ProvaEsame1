module com.example.provaesame1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.provaesame1 to javafx.fxml;
    exports com.example.provaesame1;
}