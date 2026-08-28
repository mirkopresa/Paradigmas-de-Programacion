package Ejercicios.Guia_2.FIUBA2;

public class Alumno extends Integrante {
    private final int padron;

    public Alumno(String nombre, int dni, int padron) {
        super(nombre, dni);
        this.padron = padron;
    }

    public Integer getPadron() {
        return padron;
    }
}
