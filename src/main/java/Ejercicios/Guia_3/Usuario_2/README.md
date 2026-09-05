Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.
```java
class Usuario {
    private String nombre;
    private String email;
    private BaseDeDatos db;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.db = new BaseDeDatos();
    }

    public void guardar() {
        this.db.guardar(this);
    }
}

class BaseDeDatos {
    public static void guardar(Usuario user) {
        // código para guardar el usuario en la base de datos
    }
}
```

# Respuesta
Se violan 2 principios:
* Explicit Dependencies Principle (EDP)
Se viola porque la clase BaseDeDatos depende implicitamente de la clase Usuario para funcionar, y este asume que lo tiene disponible
* Dependency Inversion Principle (DIP)
Se viola porque la clase Usuario depende de la implementacion de la BaseDeDatos para su funcionamiento

Una solucion seria implementar la base de datos como una interfaz, y que el Usuario tenga un metodo guardar que reciba un objeto que use esta interfaz
para usar el metodo guardar