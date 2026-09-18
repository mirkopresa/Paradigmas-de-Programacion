package Ejercicios.Guia_4.ListaDeTareas;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Tarea extends HBox {
    private final CheckBox tarea;
    private final Button botonEliminar;


    public Tarea(String tarea, VBox contenedor) {
        this.tarea = new CheckBox(tarea);
        this.botonEliminar = new Button("Eliminar");
        this.botonEliminar.setOnAction(e2 -> {
            contenedor.getChildren().remove(this);
        });
        this.getChildren().addAll(this.tarea, this.botonEliminar);
    }
}
