Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.
```java
public class Auto {
    private boolean moviendo;

    public void mover() {
        moviendo = !moviendo;
    }

    public boolean enMovimiento() {
        return moviendo;
    }
}
```

# Respuesta

El principio que se viola es el POLA (Principle of Least Astonishment), ya que no se comporta adecuadamente, al usar el metodo
*mover* va alternando un booleano entre True o False, lo cual no tiene mucho sentido
