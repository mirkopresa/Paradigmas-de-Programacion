package Ejercicios.Guia_1.Biblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // se encuentra roto por el momento, faltaria resolver el problema de prestar y devolver libros
        // creo que lo mejor es que la biblioteca y el cliente tengan diferentes instancias del mismo libro
        // para poder manejar mejor el stock, y no darle 5 libros a una persona
        // o tener un hash con el stock de libros y eliminar el atributo stock de libros
        Biblioteca biblioteca = new Biblioteca();
        Cliente cliente1 = new Cliente("Mirko");
        Cliente cliente2 = new Cliente("Sawken");
        ArrayList<String> autores1 = new ArrayList<String>();
        autores1.add("Pocho");
        autores1.add("Sawken");
        Libro libro1 = new Libro("1", "Falopa 1", "9/11/2001", autores1, 5);
        ArrayList<String> autores2 = new ArrayList<String>();
        autores2.add("Disco");
        Libro libro2 = new Libro("2", "Falopa 2", "8/3/2005", autores2, 3);

        System.out.println(biblioteca.agregarLibro(libro1));
        System.out.println(biblioteca.agregarLibro(libro2));
        System.out.println(biblioteca.consultarStock());
        biblioteca.consultarLibrosPrestados(cliente1);
        System.out.println(biblioteca.prestarLibro(cliente1, libro1));
        System.out.println(biblioteca.consultarStock());
        biblioteca.consultarLibrosPrestados(cliente1);
        System.out.println(biblioteca.prestarLibro(cliente2, libro2));
        biblioteca.consultarLibrosPrestados(cliente2);
        System.out.println(biblioteca.devolverLibro(cliente1, libro1));
        biblioteca.consultarLibrosPrestados(cliente1);
        System.out.println(biblioteca.consultarStock());
        System.out.println(biblioteca.consultarStock());
    }
}
