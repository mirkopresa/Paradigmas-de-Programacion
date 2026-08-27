package Ejercicios.Guia_2.Figuras;

public class Circulo implements Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * (radio*radio);
    }
}
