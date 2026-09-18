package Ejercicios.Guia_4.Animacion;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class CirculoAnimado {
    public final static double velocidadX = 11;
    public final static double velocidadY = 3;
    private final int radio;
    private double posicionX = 0;
    private double posicionY = 0;
    private final double bordeX;
    private final double bordeY;
    private double derecha = 1;
    private double arriba = 1;
    private final GraphicsContext contextoGrafico;

    public CirculoAnimado(Canvas canvas, int radio) {
        this.radio = radio;
        this.bordeX = canvas.getWidth();
        this.bordeY = canvas.getHeight();
        this.contextoGrafico = canvas.getGraphicsContext2D();
    }

    public void mover() {
        contextoGrafico.clearRect(0, 0, bordeX, bordeY);
        if (posicionX >= bordeX - radio) {
            derecha = -1;
        } else if (posicionX <= radio) {
            derecha = 1;
        }
        if (posicionY >= bordeY - radio) {
            arriba = -1;
        } else if (posicionY <= radio) {
            arriba = 1;
        }
        posicionX += (velocidadX*derecha);
        posicionY += (velocidadY*arriba);
        contextoGrafico.fillOval(posicionX - radio, posicionY - radio, radio*2, radio*2);
    }
}