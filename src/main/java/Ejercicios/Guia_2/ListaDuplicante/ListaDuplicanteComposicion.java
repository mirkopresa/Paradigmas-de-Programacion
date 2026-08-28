package Ejercicios.Guia_2.ListaDuplicante;
import java.util.ArrayList;

public class ListaDuplicanteComposicion<T> {
    private final ArrayList<T> arreglo;

    public ListaDuplicanteComposicion() {
        this.arreglo = new ArrayList<T>();
    }

    public void add(T elemento) {
        arreglo.add(elemento);
        arreglo.add(elemento);
    }

    public T get(int posicion) {
        return arreglo.get(posicion);
    }
}
