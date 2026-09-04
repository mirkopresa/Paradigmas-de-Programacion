Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.
```java
public class CarritoDeCompras {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }
}

public class ServicioWeb {
    public agregarAlCarrito(CarritoDeCompras carrito, Item item) {
        carrito.getItems().add(item);
    }
}
```

# Respuesta
El principio que se viola es el PoLK (Principle of Least Knowledge), ya que en el codigo planteado, el objeto CarritoDeCompras
puede ser modificado de varias maneras por el ServicioWeb ya que este utiliza el metodo getItems para obtener la lista interna
y modificarlo, sin que el objeto CarritoDeCompras se entere