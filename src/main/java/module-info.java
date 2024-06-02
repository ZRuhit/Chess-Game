module org.example.chess {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.chess to javafx.fxml;
    exports org.example.chess;
}