package Ejercicios.Guia_2.FIUBA2;

import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    private final ArrayList<Integrante> integrantes;
    private final HashMap<Integer, Alumno> alumnos;
    private final HashMap<Integer, Docente> docentes;

    public Sistema() {
        this.integrantes = new ArrayList<>();
        this.alumnos = new HashMap<>();
        this.docentes = new HashMap<>();
    }

    public boolean cargarIntegrante(Integrante nuevo) {
        if (nuevo instanceof Alumno) {
            Alumno alumno = (Alumno) nuevo;
            if (alumnos.containsKey(alumno.getPadron())) {
                return false;
            }
            alumnos.put(alumno.getPadron(), alumno);
        } else {
            Docente docente = (Docente) nuevo;
            if (docentes.containsKey(docente.getPadron())) {
                return false;
            }
            docentes.put(docente.getPadron(), docente);
        }
        integrantes.add(nuevo);
        return true;
    }

    public void listarAlumnos() {
        System.out.println("Alumnos:\n");
        for (Integer padron : alumnos.keySet()) {
            System.out.println("----------------------------------");
            System.out.println("Nombre: " + alumnos.get(padron).getNombre());
            System.out.println("DNI: " + alumnos.get(padron).getDNI());
            System.out.println("Padron: " + padron);
            System.out.println("----------------------------------\n");

        }
    }

    public void listarDocentes() {
        System.out.println("Docentes:\n");
        for (Integer padron : docentes.keySet()) {
            System.out.println("----------------------------------");
            System.out.println("Nombre: " + docentes.get(padron).getNombre());
            System.out.println("DNI: " + docentes.get(padron).getDNI());
            System.out.println("Padron: " + padron);
            System.out.println("----------------------------------\n");
        }
    }
}
