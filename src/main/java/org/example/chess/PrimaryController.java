package org.example.chess;

import javafx.fxml.FXML;

import java.io.IOException;

public class PrimaryController {
    @FXML
    private void switchToSecondary() throws IOException {
        HelloApplication.setRoot("secondary");
    }
}
