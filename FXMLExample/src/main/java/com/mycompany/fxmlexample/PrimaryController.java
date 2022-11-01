package com.mycompany.fxmlexample;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class PrimaryController {
    @FXML
    private Button button;
    @FXML
    private Label wrongSignIn;
    @FXML
    private TextField userName;
    @FXML
    private PasswordField passWord;
    
public void userSignIn(ActionEvent event) throws IOException { 
    checkSignIn();
}
private void checkSignIn() throws IOException {
    App m = new App();
    if(userName.getText().toString().equals("username") && passWord.getText().toString().equals("password")) {
        wrongSignIn.setText("Welcome username!");
        
        m.changeScene("secondary.fxml");
    }
    else if(userName.getText().isEmpty() && passWord.getText().isEmpty()) {
        wrongSignIn.setText("please enter username and password");
        
    }
    else {
        wrongSignIn.setText("please enter username and password");
    }
    }
}
