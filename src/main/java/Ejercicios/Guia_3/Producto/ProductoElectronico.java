package Ejercicios.Guia_3.Producto;

public class ProductoElectronico extends Producto{
    public ProductoElectronico(String nombre, double precio) {
        super(nombre, precio);
    }

    public double calcularPrecio() {
        return getPrecio() * 1.1;
    }
}