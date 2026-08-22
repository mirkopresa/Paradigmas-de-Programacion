package Ejercicios.Guia_1.FIUBA;

public class Materia {
    private final int codigo;
    private final String nombre;
    private final int creditos;

    public Materia(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public int obtenerCreditos() {
        return creditos;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
