package Ejercicios.Guia_2.FIUBA2;

public class Docente extends Integrante {
    private final int padron;

    public Docente(String nombre, int dni, int padron) {
        super(nombre, dni);
        this.padron = padron;
    }

    public Integer getPadron() {
        return padron;
    }
}
