package com.project;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class VistaCalculadora {
    @FXML
    private Text calctext;

    @FXML
    private Button button0;

    @FXML
    private Button button1;
    
    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button buttonac;

    @FXML
    private Button buttonperiod;

    private String text = "";
    private float result = 0;

    @FXML
    private void add0(ActionEvent event) {
        text = text + "0";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add1(ActionEvent event) {
        text = text + "1";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add2(ActionEvent event) {
        text = text + "2";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add3(ActionEvent event) {
        text = text + "3";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add4(ActionEvent event) {
        text = text + "4";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add5(ActionEvent event) {
        text = text + "5";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add6(ActionEvent event) {
        text = text + "6";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add7(ActionEvent event) {
        text = text + "7";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add8(ActionEvent event) {
        text = text + "8";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void add9(ActionEvent event) {
        text = text + "9";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void addperiod(ActionEvent event) {
        text = text + ".";
        calctext.setText(String.valueOf(text));
    }

    @FXML
    private void reset(ActionEvent event) {
        text = "0";
        calctext.setText(String.valueOf(text));
        text = "";
    }

    @FXML
    private void showresult(ActionEvent event) {
        calctext.setText(String.valueOf(result));
    }


    private float operation(String operator, float x, float y) {
            float result = 0;
            if (operator.equals("*")){
                result = x * y;
            }
            else if (operator.equals("+")){
                result = x + y;
            }
            else if (operator.equals("-")){
                result = x - y;
            }
            else if (operator.equals("/")){
                result = x / y;
            }
            return result;
        }

}
