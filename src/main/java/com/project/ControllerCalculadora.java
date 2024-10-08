package com.project;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class ControllerCalculadora {
    @FXML
    private Text calctext;


    private String text = "";
    private float result = 0;
    private String calc = "";

    @FXML
    private void add0(ActionEvent event) {
        if (text.length() < 15){
            text = text + "0";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add1(ActionEvent event) {
        if (text.length() < 15){
            text = text + "1";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add2(ActionEvent event) {
        if (text.length() < 15){
            text = text + "2";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add3(ActionEvent event) {
        if (text.length() < 15){
            text = text + "3";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add4(ActionEvent event) {
        if (text.length() < 15){
            text = text + "4";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add5(ActionEvent event) {
        if (text.length() < 15){
            text = text + "5";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add6(ActionEvent event) {
        if (text.length() < 15){
            text = text + "6";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add7(ActionEvent event) {
        if (text.length() < 15){
            text = text + "7";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add8(ActionEvent event) {
        if (text.length() < 15){
            text = text + "8";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void add9(ActionEvent event) {
        if (text.length() < 15){
            text = text + "9";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void addperiod(ActionEvent event) {
        if (text.length() < 15){
            text = text + ".";
            calctext.setText(String.valueOf(text));
        }
    }

    @FXML
    private void reset(ActionEvent event) {
        clearscreen();
        text = "";
        result = 0;
        calc = "";
    }

    @FXML
    private void sum(ActionEvent event) {
        if (calc == ""){
            result = Float.parseFloat(text);
            calc = "+";
            clearscreen();

        }
        else{
            result = operation(calc, result, Float.parseFloat(text));
            calc = "+";
            clearscreen();
        }

    }

    @FXML
    private void rest(ActionEvent event) {
        if (calc == ""){
            result = Float.parseFloat(text);
            calc = "-";
            clearscreen();
        }
        else{
            result = operation(calc, result, Float.parseFloat(text));
            calc = "-";
            clearscreen();
        }
    }

    @FXML
    private void multi(ActionEvent event) {
        if (calc == ""){
            result = Float.parseFloat(text);
            calc = "*";
            clearscreen();
        }
        else{
            result = operation(calc, result, Float.parseFloat(text));
            calc = "*";
            clearscreen();
        }
    }

    @FXML
    private void div(ActionEvent event) {
        if (calc == ""){
            result = Float.parseFloat(text);
            calc = "/";
            clearscreen();
        }
        else{
            result = operation(calc, result, Float.parseFloat(text));
            calc = "/";
            clearscreen();
        }
    }

    @FXML
    private void showresult(ActionEvent event) {
        result = operation(calc, result, Float.parseFloat(text));
        calctext.setText(String.valueOf(result));
        text = "";
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

    private void clearscreen(){
        text = "0";
        calctext.setText(String.valueOf(text));
        text = "";
    }

    @FXML
    private void closeapp() {
        System.exit(0);
    }
}
