package Ejercicios.Guia_4.Coordenadas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Coordenadas extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label();
        var vbox = new VBox(label);
        var scene = new Scene(vbox, 400, 400);
        stage.setScene(scene);
        stage.show();
        scene.setOnMouseMoved(e -> {
            label.setText(e.getX() + " " +  e.getY());
        });
    }
}