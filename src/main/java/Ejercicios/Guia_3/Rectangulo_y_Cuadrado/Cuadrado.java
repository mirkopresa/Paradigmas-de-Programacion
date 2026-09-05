package Ejercicios.Guia_3.Rectangulo_y_Cuadrado;

public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(int lado) {
        setLado(lado);
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public int calcularArea() {
        return lado * lado;
    }
}
