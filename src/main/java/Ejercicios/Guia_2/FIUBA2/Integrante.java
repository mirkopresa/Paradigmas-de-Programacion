package Ejercicios.Guia_2.FIUBA2;

public abstract class Integrante {
    private final String nombre;
    private final int dni;

    public Integrante(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDNI() {
        return dni;
    }
}
