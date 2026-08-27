package Ejercicios.Guia_2.Figuras;

public class Cuadrado implements Figura {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado*lado;
    }
}