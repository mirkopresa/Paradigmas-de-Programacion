package Ejercicios.Guia_1.Biblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Biblioteca {
    private final HashMap<String, Libro> libros;
    private final HashMap<String, ArrayList<Libro>> prestados;
    private static Scanner scanner;

    public Biblioteca() {
        this.libros = new HashMap<>();
        this.prestados = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public String agregarLibro(Libro libro) {
        if (!libros.containsKey(libro.getCodigo())) {
            libros.put(libro.getCodigo(), libro);
        } else {
            Libro l = libros.get(libro.getCodigo());
            l.aumentarCantidad(libro.getCantidad());
        }
        return "Libro agregado correctamente.";
    }

    public String quitarLibro(Libro libro) {
        if (!libros.containsKey(libro.getCodigo())) {
            return "No existe ese libro.";
        }
        libro.disminuirCantidad(1);
        if (libros.get(libro.getCodigo()).getCantidad() <= 0) {
            libros.remove(libro.getCodigo());
        }
        return "Libro correctamente eliminado de la biblioteca.";
    }

    public String consultarStock() {
        System.out.println("Por que deseas consultar?");
        System.out.println("1: Titulo");
        System.out.println("2: Fecha");
        System.out.println("3: Autor");
        String opcion = scanner.nextLine();
        switch (opcion) {
            case "1":
                System.out.println("Ingresa el titulo:");
                return encontrarTitulo();
            case "2":
                System.out.println("Ingresa la fecha en formato DD/MM/YYYY:");
                return encontrarFecha();
            case "3":
                System.out.println("Ingresa el nombre del autor");
                return encontrarAutor();
            default:
                break;
        }
        return "Error: opcion invalida";
    }

    public String prestarLibro(Cliente cliente, Libro libro) {
        HashMap<String, Libro> clienteLibros = cliente.getLibros();
        if (clienteLibros.containsKey(libro.getCodigo())) {
            return "El cliente ya tiene ese libro";
        }
        Libro libroAPrestar = libros.get(libro.getCodigo());
        cliente.agregarLibro(libroAPrestar);
        quitarLibro(libro);
        return "Libro prestado correctamente.";
    }

    public String devolverLibro(Cliente cliente, Libro libro) {
        HashMap<String, Libro> clienteLibros = cliente.getLibros();
        if (!clienteLibros.containsKey(libro.getCodigo())) {
            return "El cliente no tenia ese libro";
        }
        cliente.quitarLibro(libro);
        agregarLibro(libro);
        return "Libro devuelto correctamente.";
    }

    public void consultarLibrosPrestados(Cliente cliente) {
        HashMap<String, Libro> prestados = cliente.getLibros();
        System.out.println("Libros prestados al cliente " + cliente.getNombre());
        for (String codigo : prestados.keySet()) {
            System.out.println(prestados.get(codigo).getTitulo());
        }
    }

    private String encontrarTitulo() {
        String opcion = scanner.nextLine();
        for (String codigo : libros.keySet()) {
            Libro libro = libros.get(codigo);
            if (libro.getTitulo().equals(opcion)) {
                return String.format("Cantidad de libros: %d", libro.getCantidad());
            }
        }
        return "No se ha encontrado el libro.";
    }

    private String encontrarFecha() {
        String opcion = scanner.nextLine();
        for (String codigo : libros.keySet()) {
            Libro libro = libros.get(codigo);
            if (libro.getFecha().equals(opcion)) {
                return String.format("Cantidad de libros: %d", libro.getCantidad());
            }
        }
        return "No se ha encontrado el libro.";
    }

    private String encontrarAutor() {
        String opcion = scanner.nextLine();
        for (String codigo : libros.keySet()) {
            Libro libro = libros.get(codigo);
            if (libro.getAutores().contains(opcion)) {
                return String.format("Cantidad de libros: %d", libro.getCantidad());
            }
        }
        return "No se ha encontrado el libro.";
    }
}
