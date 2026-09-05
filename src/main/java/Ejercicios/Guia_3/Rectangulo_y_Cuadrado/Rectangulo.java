package Ejercicios.Guia_3.Rectangulo_y_Cuadrado;

public class Rectangulo extends Figura {
    private int alto;
    private int ancho;

    public Rectangulo(int alto, int ancho) {
        setAlto(alto);
        setAncho(ancho);
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int calcularArea() {
        return alto * ancho;
    }
}
