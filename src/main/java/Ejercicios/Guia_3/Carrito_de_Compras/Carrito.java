package Ejercicios.Guia_3.Carrito_de_Compras;

import java.util.List;

public class Carrito {
    private List<Item> items;

    public void addItem(Item item) {
        items.add(item);
    }
}