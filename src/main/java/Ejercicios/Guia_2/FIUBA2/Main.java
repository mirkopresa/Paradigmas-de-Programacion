package Ejercicios.Guia_2.FIUBA2;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Alumno alumno1 = new Alumno("Mirko", 46581152, 114225);
        Alumno alumno2 = new Alumno("Sawken", 69420, 67);
        Docente docente1 = new Docente("Pocho", 420420420, 420);
        sistema.cargarIntegrante(alumno1);
        sistema.cargarIntegrante(alumno2);
        sistema.cargarIntegrante(docente1);
        sistema.listarAlumnos();
        sistema.listarDocentes();
    }
}
