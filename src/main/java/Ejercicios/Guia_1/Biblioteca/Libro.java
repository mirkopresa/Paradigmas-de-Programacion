package Ejercicios.Guia_1.Biblioteca;

import java.util.ArrayList;
import java.util.HashSet;

public class Libro {
    private final String isbn;
    private final String titulo;
    private final String fecha;
    private final HashSet<String> autores;
    private int cantidad;

    public Libro(String codigo, String titulo, String fecha, ArrayList<String> autores, int cantidad) {
        this.isbn = codigo;
        this.titulo = titulo;
        this.fecha = fecha;
        this.autores = new HashSet<>();
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public HashSet<String> getAutores() {
        return autores;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void aumentarCantidad(int aumento) {
        this.cantidad += aumento;
    }

    public void disminuirCantidad(int disminucion) {
        this.cantidad -= disminucion;
    }
}
