package com.example.javapackage;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controllers {
    @FXML
    private Button exitbutton;

    @FXML
    private TextField unamefield;

    @FXML
    private PasswordField passfield;

    @FXML
    private Label errormessage;

    public void labelbuttonmessage(ActionEvent e){

        if(unamefield.getText().isBlank()==true && passfield.getText().isBlank()==true){
            errormessage.setText("Enter the Credentails!!!");
        }else if (unamefield.getText().isBlank()==false && passfield.getText().isBlank()==false){
            errormessage.setText("Success");
        }else{
            errormessage.setText("Enter all the Credentails!!!");

        }

    }

    public void exitbuttonAction(ActionEvent e){
        Stage stage =(Stage) exitbutton.getScene().getWindow();
        stage.close();
    }


}