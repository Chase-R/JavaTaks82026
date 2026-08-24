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
    public TextField Coord1;
    public TextField Coord2;
    public Label mdpntlbl;
    public Label slopelbl;
    @FXML
    private Label welcomeText;
    public TextField Txtboxevenodd;
    public Label LblEvenOrOdd;


    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    private Mathclass mathclass = new Mathclass();
    private BankClass bankClass = new BankClass();
    private Coordsclass coordsclass = new Coordsclass();


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

    public void handleMdptn(ActionEvent actionEvent) {
        String coord1 = Coord1.getText();
        int c1comma = coord1.indexOf(",");
        int c1end = coord1.length() - 1;
        int x1 = Integer.parseInt(coord1.substring(1,c1comma));
        int y1 = Integer.parseInt(coord1.substring(c1comma+1,c1end));
        System.out.println(x1 + y1);
        String coord2 = Coord2.getText();
        int c2comma = coord2.indexOf(",");
        int c2end = coord2.length() - 1;
        int x2 = Integer.parseInt(coord2.substring(1,c2comma));
        int y2 = Integer.parseInt(coord2.substring(c2comma+1,c2end));
        System.out.println(x2 + y2);
        mdpntlbl.setText(Coordsclass.mdpoint(x1,x2,y1,y2));
    }

    public void handleSlope(ActionEvent actionEvent) {
        String coord1 = Coord1.getText();
        int c1comma = coord1.indexOf(",");
        int c1end = coord1.length() - 1;
        int x1 = Integer.parseInt(coord1.substring(1,c1comma));
        int y1 = Integer.parseInt(coord1.substring(c1comma+1,c1end));
        System.out.println(x1 + y1);
        String coord2 = Coord2.getText();
        int c2comma = coord2.indexOf(",");
        int c2end = coord2.length() - 1;
        int x2 = Integer.parseInt(coord2.substring(1,c2comma));
        int y2 = Integer.parseInt(coord2.substring(c2comma+1,c2end));
        System.out.println(x2 + y2);
        slopelbl.setText(Coordsclass.slope(x1,x2,y1,y2));
    }
}
