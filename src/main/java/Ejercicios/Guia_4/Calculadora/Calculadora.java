package Ejercicios.Guia_4.Calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label("Calculadora");
        var primerNumero = new Label("Primer numero: ");
        var segundoNumero = new Label("Segundo numero: ");
        var operacion = new Label("Operacion: ");
        var numero1 = new TextField();
        var numero2 = new TextField();
        var resultado = new Label("Resultado: ");
        var opciones = new ChoiceBox<String>();
        opciones.getItems().addAll("+", "-", "*", "/");
        var boton = new Button("Calcular");
        boton.setOnAction(e -> {
            int opcion = opciones.getSelectionModel().getSelectedIndex();
            int res = 0;
            if (opcion == 0) {
                res = Integer.parseInt(numero1.getText()) + Integer.parseInt(numero2.getText());
            } else if (opcion == 1) {
                res = Integer.parseInt(numero1.getText()) - Integer.parseInt(numero2.getText());
            } else if (opcion == 2){
                res = Integer.parseInt(numero1.getText()) * Integer.parseInt(numero2.getText());
            } else {
                res = Integer.parseInt(numero1.getText()) / Integer.parseInt(numero2.getText());
            }
            resultado.setText("Resultado: " + res);
        });

        var vbox = new VBox(label);
        vbox.getChildren().add(primerNumero);
        vbox.getChildren().add(numero1);
        vbox.getChildren().add(segundoNumero);
        vbox.getChildren().add(numero2);
        vbox.getChildren().add(operacion);
        vbox.getChildren().add(opciones);
        vbox.getChildren().add(resultado);
        vbox.getChildren().add(boton);
        var scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }
}