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
    public Label LBLABdivide;
    public Label lblRoots;
    public TextField txtroots;
    public Label lblgrade;
    public TextField txtgrade;
    public TextField txtBank;
    public Label lblBalance;
    @FXML
    private Label welcomeText;
    public TextField Txtboxevenodd;
    public Label LblEvenOrOdd;


    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private Mathclass mathclass = new Mathclass();
    private BankClass bankClass = new BankClass();


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
        String remainder = Mathclass.remainder(a,b);
        LBLABdivide.setText(remainder);



    }

    public void handleRoots(ActionEvent actionEvent) {
        int a = Integer.parseInt(txtroots.getText());
        String roots = Mathclass.Roots(a);
        lblRoots.setText(roots);

    }

    public void handleGrade(ActionEvent actionEvent) {
        double a = Double.parseDouble(txtgrade.getText());
        String grade = Mathclass.Grade(a);
        lblgrade.setText(grade);

        
    }

    public void handleDeposit(ActionEvent actionEvent) {
        int cash = Integer.parseInt(txtBank.getText());
        double balance = BankClass.deposit(cash);
        lblBalance.setText(String.valueOf(balance));
    }

    public void handleWithdrawl(ActionEvent actionEvent) {
        int cash = Integer.parseInt(txtBank.getText());
        double balance = bankClass.withdrawl(cash);
        lblBalance.setText(String.valueOf(balance));
    }
}
