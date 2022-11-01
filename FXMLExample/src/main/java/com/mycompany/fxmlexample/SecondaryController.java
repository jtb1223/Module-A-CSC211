package com.mycompany.fxmlexample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class SecondaryController {
    
    private Button signOut;

    @FXML
    public void userSignOut(ActionEvent event) throws IOException {
        App m = new App();
        m.changeScene("primary.fxml");
    }
}