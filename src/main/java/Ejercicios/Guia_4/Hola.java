package Ejercicios.Guia_4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Hola extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label("Ingrese su nombre:");
        var campo = new TextField();
        var vbox = new VBox(label);
        var button = new Button("Saludar");

        button.setOnAction(e -> new Alert(Alert.AlertType.INFORMATION,"Hola " + campo.getText() + "!").show());

        vbox.getChildren().add(campo);
        vbox.getChildren().add(button);
        var scene = new Scene(vbox);

        stage.setScene(scene);
        stage.show();
    }
}
