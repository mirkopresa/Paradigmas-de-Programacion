package Ejercicios.Guia_4.Teclado;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Teclado extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label("Presione una tecla");
        var vbox = new VBox(label);
        var scene = new Scene(vbox, 400, 400);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        stage.setScene(scene);
        stage.show();
        scene.setOnKeyPressed(e -> {
            alert.setContentText("Se presiono la tecla: " + e.getText());
            alert.show();
        });
    }
}
