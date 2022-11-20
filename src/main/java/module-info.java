module com.example.blackknightgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.blackknightgame to javafx.fxml;
    exports com.example.blackknightgame;
}