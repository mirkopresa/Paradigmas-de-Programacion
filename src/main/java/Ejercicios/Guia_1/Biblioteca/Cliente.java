package Ejercicios.Guia_1.Biblioteca;

import java.util.HashMap;

public class Cliente {
    private final String nombre;
    private final HashMap<String, Libro> libros;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.libros = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<String, Libro> getLibros() {
        return libros;
    }

    public boolean agregarLibro(Libro libro) {
        if (libros.containsKey(libro.getCodigo())) {
            return false;
        }
        libros.put(libro.getCodigo(), libro);
        return true;
    }

    public boolean quitarLibro(Libro libro) {
        if (!libros.containsKey(libro.getCodigo())) {
            return false;
        }
        libros.remove(libro.getCodigo());
        return true;
    }
}
