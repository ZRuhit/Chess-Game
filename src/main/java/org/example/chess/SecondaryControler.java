package org.example.chess;

import javafx.fxml.FXML;

import java.io.IOException;

public class SecondaryControler {

    @FXML
    private void switchToPrimary() throws IOException {
        HelloApplication.setRoot("primary");
    }
}
