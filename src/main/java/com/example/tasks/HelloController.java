package com.example.tasks;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.swing.*;

public class HelloController {

    public TextField MultA;
    public TextField MultB;
    public Label CheckMult;
    @FXML
    private Label welcomeText;
    public TextField Txtboxevenodd;
    public Label LblEvenOrOdd;


    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private Mathclass mathclass = new Mathclass();


    public void handleEvenOdd(ActionEvent actionEvent) {
        int EvenOddinput = Integer.parseInt(Txtboxevenodd.getText());
        if (mathclass.checkEvenOdd(EvenOddinput)) {
            LblEvenOrOdd.setText("even");
        }else {
            LblEvenOrOdd.setText("odd");
        }
    }


    public void Handlemult(ActionEvent actionEvent) {
        int a = Integer.parseInt(MultA.getText());
        int b = Integer.parseInt(MultB.getText());
        String Mult = Mathclass.MultCheck(a,b);
        CheckMult.setText(Mult);

    }
}
