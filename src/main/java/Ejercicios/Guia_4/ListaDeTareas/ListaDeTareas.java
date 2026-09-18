package Ejercicios.Guia_4.ListaDeTareas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListaDeTareas extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label("Ingrese una nueva tarea: ");
        var label2 = new Label("Tareas: ");
        var campo = new TextField();

        var vbox1 = new VBox(label2);
        var vbox2 = new VBox(label);
        campo.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                var nuevaTarea = new Tarea(campo.getText(), vbox1);
                vbox1.getChildren().add(nuevaTarea);
                campo.setText("");
            }
        });
        vbox2.getChildren().add(campo);
        var borderPane = new BorderPane();
        borderPane.setTop(vbox1);
        borderPane.setBottom(vbox2);
        var scene = new Scene(borderPane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}