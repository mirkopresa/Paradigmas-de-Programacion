package Ejercicios.Guia_1.FIUBA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Alumno {
    private final String nombre;
    private final Integer padron;
    private Map<Carrera, ArrayList<Materia>> materiasAprobadas;
    private ArrayList<Carrera> carrerasEnCurso;

    public Alumno(String nombre, Integer padron) {
        this.nombre = nombre;
        this.padron = padron;
        this.materiasAprobadas = new HashMap<Carrera, ArrayList<Materia>>();
        this.carrerasEnCurso = new ArrayList<Carrera>();
    }

    public boolean inscribirCarrera(Carrera carrera) {
        if (carrerasEnCurso.contains(carrera)) {
            return false;
        }
        carrerasEnCurso.add(carrera);
        ArrayList<Materia> materias = new ArrayList<Materia>();
        materiasAprobadas.put(carrera, materias);
        return true;
    }

    public boolean aprobarMateria(Carrera carrera, Materia materia) {
        if (!materiasAprobadas.containsKey(carrera)) {
            return false;
        }
        ArrayList<Materia> materias = materiasAprobadas.get(carrera);
        if (materias.contains(materia) ){
            return false;
        }
        materias.add(materia);
        return true;
    }

    public String consultarEstado(Carrera carrera) {
        if (!carrerasEnCurso.contains(carrera)) {
            return "El alumno no esta inscrito a la carrera indicada";
        }
        ArrayList<Materia> materias = materiasAprobadas.get(carrera);
        int cantidadCreditos = 0;
        int materiasObligatoriasAprobadas = 0;
        for (Materia materia : materias) {
            cantidadCreditos = cantidadCreditos + materia.obtenerCreditos();
            if (carrera.esObligatoria(materia)) {
                materiasObligatoriasAprobadas++;
            }
        }
        if (cantidadCreditos >= carrera.obtenerCreditosMinimos()) {
            if (materiasObligatoriasAprobadas == carrera.obtenerCantidadObligatorias()) {
                return "Ya estas recibido!";
            }
        } else {
            if (materiasObligatoriasAprobadas == carrera.obtenerCantidadObligatorias()) {
                return String.format("Tienes %d creditos de %d minimos. No cuentas con materias obligatorias por cursar.", cantidadCreditos, carrera.obtenerCreditosMinimos());
            }
        }
        return String.format("Tienes %d creditos de %d minimos. Te faltan %d materias obligatorias para recibirte", cantidadCreditos, carrera.obtenerCreditosMinimos(), carrera.obtenerCantidadObligatorias() - materiasObligatoriasAprobadas);
    }
}
