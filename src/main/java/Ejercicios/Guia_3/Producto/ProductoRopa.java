package Ejercicios.Guia_3.Producto;

public class ProductoRopa extends Producto{
    public ProductoRopa(String nombre, double precio) {
        super(nombre, precio);
    }

    public double calcularPrecio() {
        return getPrecio() * 1.2;
    }
}
