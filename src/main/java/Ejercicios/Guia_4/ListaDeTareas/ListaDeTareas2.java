package Ejercicios.Guia_4.ListaDeTareas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class ListaDeTareas2 extends Application {

    @Override
    public void start(Stage stage) {
        var label = new Label("Ingrese una nueva tarea: ");
        var label2 = new Label("Tareas: ");

        var campo = new TextField();
        // vbox1: lista de tareas
        var vbox1 = new VBox(label2);
        for (String tarea : leerTareas()) {
            var tareaArchivo = new Tarea(tarea, vbox1);
            vbox1.getChildren().add(tareaArchivo);
        }
        // vbox2: campo para ingresar las tareas
        var vbox2 = new VBox(label);
        campo.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                var nuevaTarea = new Tarea(campo.getText(), vbox1);
                vbox1.getChildren().add(nuevaTarea);
                guardarTarea(campo.getText());
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

    private ArrayList<String> leerTareas() {
        Path ruta = Path.of("tareas.txt");
        ArrayList<String> tareas = new ArrayList<>();
        if (Files.exists(ruta)) {
            try {
                Files.lines(ruta).forEach(tareas::add);
            } catch (IOException e) {
                System.out.println("Error");
            }
        }
        return tareas;
    }

    private void guardarTarea(String tarea) {
        Path ruta = Path.of("tareas.txt");
        try {
            Files.writeString(ruta, tarea + "\n", StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
