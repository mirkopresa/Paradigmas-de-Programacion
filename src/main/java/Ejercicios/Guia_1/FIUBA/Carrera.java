package Ejercicios.Guia_1.FIUBA;
import java.util.ArrayList;

public class Carrera {
    private final String nombre;
    private final ArrayList<Materia> materiasObligatorias;
    private final ArrayList<Materia> materiasOptativas;
    private final int creditosMinimos;

    public Carrera(String nombre, ArrayList<Materia> obligatorias, ArrayList<Materia> optativas, int creditos) {
        this.nombre = nombre;
        this.materiasObligatorias = obligatorias;
        this.materiasOptativas = optativas;
        this.creditosMinimos = creditos;
    }

    public Materia buscarMateria(String nombreMateria) {
        for (Materia materia : materiasObligatorias) {
            if (materia.obtenerNombre().equals(nombreMateria)){
                return materia;
            }
        }
        for (Materia materia : materiasOptativas) {
            if (materia.obtenerNombre().equals(nombreMateria)) {
                return materia;
            }
        }
        return null;
    }

    public boolean esObligatoria(Materia materia) {
        return materiasObligatorias.contains(materia);
    }

    public int obtenerCreditosMinimos() {
        return creditosMinimos;
    }

    public int obtenerCantidadObligatorias() {
        return materiasObligatorias.size();
    }

}
