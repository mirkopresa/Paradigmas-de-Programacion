package Ejercicios.Guia_4.Animacion;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Animacion extends Application {
    @Override
    public void start(Stage stage) {
        int radio = 50;
        double width = 1000;
        double height = 1000;
        var canvas = new Canvas(width, height);
        var panel = new Pane(canvas);
        var scene = new Scene(panel, width, height);
        CirculoAnimado circulo = new CirculoAnimado(canvas, radio);
        AnimationTimer animacion = new AnimationTimer() {
            @Override
            public void handle(long now) {
                circulo.mover();
            }
        };
        animacion.start();
        stage.setTitle("Animacion");
        stage.setScene(scene);
        stage.show();
    }
}