package Ejercicios.Guia_4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ChoiceBoxApp extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label("Color");
        var choiceBox = new ChoiceBox<String>();
        choiceBox.getItems().addAll("Rojo", "Azul", "Verde");
        choiceBox.setOnAction(e -> {
            int indice = choiceBox.getSelectionModel().getSelectedIndex();
            if (indice == 0) {
                label.setTextFill(Color.RED);
            } else if (indice == 1) {
                label.setTextFill(Color.BLUE);
            } else {
                label.setTextFill(Color.GREEN);
            }
        });
        var vbox = new VBox(label);
        vbox.getChildren().add(choiceBox);
        var scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
    }
}