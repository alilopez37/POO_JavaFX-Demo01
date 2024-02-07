package com.alilopez.demo01;

import com.alilopez.demo01.models.Suma;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private Button btnSumar;

    @FXML
    private Label res;

    @FXML
    private TextField txtNum01;

    @FXML
    private TextField txtNum02;

    @FXML
    private Label welcomeText;

    @FXML
    void btnSumarOnClick(MouseEvent event) {
        int num01;
        int num02;
        int result;
        num01 = Integer.parseInt(txtNum01.getText());
        num02 = Integer.parseInt(txtNum02.getText());
        Suma suma = new Suma(num01,num02);

        result = suma.sumar();
        res.setText("Resultado: " + result);
    }
}
